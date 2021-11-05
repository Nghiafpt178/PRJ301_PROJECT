/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookTours_Status;
import model.Booktour;
import model.Tour;
import model.ToursType;

/**
 *
 * @author ADMIN
 */
public class TourDBContext extends DBContext {

    public ArrayList<ToursType> getToursType() {
        ArrayList<ToursType> toursType = new ArrayList<>();
        try {
            String sql = "select id,name\n"
                    + "from Tours_type";
            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ToursType tp = new ToursType();
                tp.setId(rs.getInt("id"));
                tp.setName(rs.getString("name"));
                toursType.add(tp);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return toursType;

    }

    public ArrayList<Tour> getTours() {
        ArrayList<Tour> tours = new ArrayList<>();
        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],tourType,[img]  \n"
                    + "  FROM [Tour] ";
            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setTourType(rs.getInt("tourType"));
                t.setImg(rs.getString("img"));
                tours.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tours;

    }

    public ArrayList<Tour> getToursPagging(int pageSize, int pageIndex) {
        ArrayList<Tour> tours = new ArrayList<>();
        try {
            String sql = "select tourCode, tourName,tourPrice,tourNumberGuests,tourStartDate,tourTime"
                    + ",tourEndDate,tourSchedule ,tourDescription ,tourVehicle,tourType,img  from\n"
                    + "(select ROW_NUMBER() OVER (Order by tourCode) as rownum,\n"
                    + "tourCode, tourName,tourPrice,tourNumberGuests,tourStartDate,tourTime"
                    + ",tourEndDate,tourSchedule ,tourDescription ,tourVehicle,tourType,img \n"
                    + "from Tour) t\n"
                    + "where rownum >= (?- 1)*?+1 \n"
                    + "and rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setTourType(rs.getInt("tourType"));
                t.setImg(rs.getString("img"));
                tours.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tours;

    }

    public ArrayList<Booktour> getToursBookedPagging(int pageSize, int pageIndex) {
        ArrayList<Booktour> bookTours = new ArrayList<>();
        try {
            String sql = "select bTourid, t.tourCode,t.tourName, username, startDate, endDate, price, status_id ,\n"
                    + "                   	fullname, phone, email, [address], require, t.status_name from\n"
                    + "                  (select ROW_NUMBER() over (order by bTourid) as rownum, \n"
                    + "				    bTourid, t.tourCode,t.tourName, username, startDate, endDate, price, status_id ,\n"
                    + "                   	fullname, phone, email, [address], require, bs.status_name\n"
                    + "					 from booktour b inner join BookTour_Status bs on b.status_id = bs.id\n"
                    + "					 inner join Tour t on b.tourCode = t.tourCode ) t \n"
                    + "                    where rownum >= (?- 1)*?+1 \n"
                    + "              		and rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Booktour b = new Booktour();
                b.setbTourId(rs.getInt("bTourid"));
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("price"));
                t.setStartDate(rs.getDate("startDate"));
                t.setEndDate(rs.getDate("endDate"));
                b.setStatus(rs.getInt("status_id"));
                b.setUsername(rs.getString("username"));
                b.setFullname(rs.getString("fullname"));
                b.setPhone(rs.getString("phone"));
                b.setEmail(rs.getString("email"));
                b.setAddress(rs.getString("address"));
                b.setRequire(rs.getString("require"));
                b.setTour(t);
                BookTours_Status bs = new BookTours_Status();
                bs.setStatus_name(rs.getString("status_name"));
                b.setBs(bs);
                bookTours.add(b);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bookTours;

    }

    public ArrayList<Tour> getToursByTitle(int tourType) {
        ArrayList<Tour> tours = new ArrayList<>();
        try {
            String sql = "select t.tourCode, t.tourType, t.tourName, t.tourPrice,\n"
                    + "t.tourNumberGuests, t.tourStartDate, t.tourTime, t.tourEndDate,\n"
                    + "t.tourSchedule, t.tourDescription, t.tourVehicle, t.img\n"
                    + "from Tour t inner join Tours_Type tp\n"
                    + "on t.tourType = tp.id where t.tourType = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, tourType);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setTourType(rs.getInt("tourType"));
                t.setImg(rs.getString("img"));
                tours.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tours;

    }

    public Tour getToursByCode(String tcode) {

        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],tourType,[img] \n"
                    + "  FROM [Tour] WHERE [tourCode] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, tcode);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setTourType(rs.getInt("tourType"));
                t.setImg(rs.getString("img"));

                return t;

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public void bookTour(Booktour booktour) {

        try {
            String sql = "INSERT INTO [Booktour]\n"
                    + "           ([tourCode]\n"
                    + "           ,[username]\n"
                    + "           ,[startDate]\n"
                    + "           ,[endDate]\n"
                    + "           ,[price]\n"
                    + "           ,[status]\n"
                    + "           ,[fullname]\n"
                    + "           ,[phone]\n"
                    + "           ,[email]\n"
                    + "           ,[address]\n"
                    + "           ,[require])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, booktour.getTour().getTourCode());
            stm.setString(2, booktour.getUsername());
            stm.setDate(3, booktour.getTour().getStartDate());
            stm.setDate(4, booktour.getTour().getEndDate());
            stm.setInt(5, (int) booktour.getTour().getTourPrice());
            stm.setInt(6, booktour.getStatus());
            stm.setString(7, booktour.getFullname());
            stm.setString(8, booktour.getPhone());
            stm.setString(9, booktour.getEmail());
            stm.setString(10, booktour.getAddress());
            stm.setString(11, booktour.getRequire());
            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Tour> searchTour(String name, Date startDate, Date endDate, int tid) {
        ArrayList<Tour> searchTour = new ArrayList<>();
        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],tourType,[img]\n"
                    + "  FROM [Tour] where (1=1)\n";

            HashMap<Integer, Object[]> params = new HashMap<>();
            int paramIndex = 0;
            if (name != null) {
                sql += " and tourName like '%'+?+'%' ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = String.class.getTypeName();
                param[1] = name;
                params.put(paramIndex, param);

            }
            if (startDate != null) {
                sql += " and tourStartDate >= ? ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getTypeName();
                param[1] = startDate;
                params.put(paramIndex, param);

            }
            if (endDate != null) {
                sql += " and tourEndDate <= ? ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getTypeName();
                param[1] = endDate;
                params.put(paramIndex, param);

            }
            if(tid != -1){
                sql += "and tourType= ? ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Integer.class.getTypeName();
                param[1] = tid;
                params.put(paramIndex, param);
            }

            PreparedStatement stm = connection.prepareStatement(sql);

            for (Map.Entry<Integer, Object[]> entry : params.entrySet()) {
                Integer index = entry.getKey();
                Object[] value = entry.getValue();
                String type = value[0].toString();
                if (type.equals(String.class.getTypeName())) {
                    stm.setString(index, value[1].toString());
                } else if (type.equals(Date.class.getTypeName())) {
                    stm.setDate(index, (Date) value[1]);
                } else if (type.equals(Date.class.getTypeName())) {
                    stm.setDate(index, (Date) value[1]);
                }
                else if (type.equals(Integer.class.getTypeName())) {
                    stm.setInt(index, Integer.parseInt(value[1].toString()));
                }

            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setTourType(rs.getInt("tourType"));
                t.setImg(rs.getString("img"));
                searchTour.add(t);

            }

        } catch (SQLException e) {
        }

        return searchTour;
    }

    public ArrayList<Booktour> getToursBooked() {
        ArrayList<Booktour> bookTours = new ArrayList<>();
        try {
            String sql = "SELECT [bTourid],b.[tourCode],[startDate],[endDate],[price],[status_id],\n"
                    + "[fullname],b.username,[phone],[email],[address],[require], t.tourName, bs.status_name\n"
                    + "FROM [Booktour] b inner join Tour t on b.tourCode = t.tourCode inner join BookTour_Status bs\n"
                    + " on b.status_id = bs.id";
            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Booktour bt = new Booktour();
                bt.setbTourId(rs.getInt("bTourid"));
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourPrice(rs.getInt("price"));
                bt.setUsername(rs.getString("username"));
                t.setStartDate(rs.getDate("startDate"));
                t.setEndDate(rs.getDate("endDate"));
                t.setTourName(rs.getString("tourName"));
                bt.setStatus(rs.getInt("status_id"));
                bt.setFullname(rs.getString("fullname"));
                bt.setPhone(rs.getString("phone"));
                bt.setEmail(rs.getString("email"));
                bt.setAddress(rs.getString("address"));
                bt.setRequire(rs.getString("require"));
                BookTours_Status bs = new BookTours_Status();
                bs.setStatus_name(rs.getString("status_name"));
                bt.setTour(t);
                bt.setBs(bs);
                bookTours.add(bt);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bookTours;

    }

    public Booktour getToursBookedById(int btourId) {

        try {
            String sql = "SELECT [bTourid],b.[tourCode],[startDate],[endDate],[price],[status_id],\n"
                    + "[fullname],b.username,[phone],[email],[address],[require], t.tourName, bs.status_name\n"
                    + "FROM [Booktour] b inner join Tour t on b.tourCode = t.tourCode inner join BookTour_Status bs\n"
                    + " on b.status_id = bs.id where [bTourid] = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, btourId);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Booktour bt = new Booktour();
                bt.setbTourId(rs.getInt("bTourid"));
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourPrice(rs.getInt("price"));
                bt.setUsername(rs.getString("username"));
                t.setStartDate(rs.getDate("startDate"));
                t.setEndDate(rs.getDate("endDate"));
                t.setTourName(rs.getString("tourName"));
                bt.setStatus(rs.getInt("status_id"));
                bt.setFullname(rs.getString("fullname"));
                bt.setPhone(rs.getString("phone"));
                bt.setEmail(rs.getString("email"));
                bt.setAddress(rs.getString("address"));
                bt.setRequire(rs.getString("require"));
                BookTours_Status bs = new BookTours_Status();
                bs.setStatus_name(rs.getString("status_name"));
                bt.setTour(t);
                bt.setBs(bs);
                return bt;

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public ArrayList<Booktour> getToursBookedByCustomer(String username) {
        ArrayList<Booktour> bookTours = new ArrayList<>();
        try {
            String sql = "SELECT [bTourid],b.[tourCode],[startDate],[endDate],[price],[status_id],\n"
                    + "[fullname],b.username,[phone],[email],[address],[require], t.tourName, bs.status_name\n"
                    + "FROM [Booktour] b inner join Tour t on b.tourCode = t.tourCode inner join BookTour_Status bs\n"
                    + " on b.status_id = bs.id where username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Booktour bt = new Booktour();
                bt.setbTourId(rs.getInt("bTourid"));
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourPrice(rs.getInt("price"));
                bt.setUsername(rs.getString("username"));
                t.setStartDate(rs.getDate("startDate"));
                t.setEndDate(rs.getDate("endDate"));
                t.setTourName(rs.getString("tourName"));
                bt.setStatus(rs.getInt("status_id"));
                bt.setFullname(rs.getString("fullname"));
                bt.setPhone(rs.getString("phone"));
                bt.setEmail(rs.getString("email"));
                bt.setAddress(rs.getString("address"));
                bt.setRequire(rs.getString("require"));
                BookTours_Status bs = new BookTours_Status();
                bs.setStatus_name(rs.getString("status_name"));
                bt.setTour(t);
                bt.setBs(bs);
                bookTours.add(bt);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bookTours;

    }

    public int getRowCount() {

        String sql = "select count(*) as total from Tour";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int getRowCountBooked() {

        String sql = "select count(*) as total from BookTour";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public void saveTours(Tour t) {

        try {
            String sql = "UPDATE [Tour]\n"
                    + "   SET \n"
                    + "       [tourName] = ?\n"
                    + "      ,[tourPrice] = ?\n"
                    + "      ,[tourNumberGuests] = ?\n"
                    + "      ,[tourStartDate] =  ?\n"
                    + "      ,[tourTime] =  ?\n"
                    + "      ,[tourEndDate] =  ?\n"
                    + "      ,[tourSchedule] =  ?\n"
                    + "      ,[tourDescription] =  ?\n"
                    + "      ,[tourVehicle] =  ?\n"
                    + "      ,tourType =  ?\n"
                    + "      ,[img] =  ?\n"
                    + " WHERE [tourCode] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getTourName());
            stm.setInt(2, t.getTourPrice());
            stm.setInt(3, t.getNumberGuests());
            stm.setDate(4, t.getStartDate());
            stm.setString(5, t.getDateTime());
            stm.setDate(6, t.getEndDate());
            stm.setString(7, t.getSchedule());
            stm.setString(8, t.getDescription());
            stm.setString(9, t.getVehicle());
            stm.setInt(10, t.getTourType());
            stm.setString(11, t.getImg());
            stm.setString(12, t.getTourCode());
            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void addTours(Tour t) {
        try {
            String sql = "INSERT INTO [Tour]\n"
                    + "           ([tourCode]\n"
                    + "           ,[tourType]\n"
                    + "           ,[tourName]\n"
                    + "           ,[tourPrice]\n"
                    + "           ,[tourNumberGuests]\n"
                    + "           ,[tourStartDate]\n"
                    + "           ,[tourTime]\n"
                    + "           ,[tourEndDate]\n"
                    + "           ,[tourSchedule]\n"
                    + "           ,[tourDescription]\n"
                    + "           ,[tourVehicle]\n"
                    + "           ,[img])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, t.getTourCode());
            stm.setInt(2, t.getTourType());
            stm.setString(3, t.getTourName());
            stm.setInt(4, t.getTourPrice());
            stm.setInt(5, t.getNumberGuests());
            stm.setDate(6, t.getStartDate());
            stm.setString(7, t.getDateTime());
            stm.setDate(8, t.getEndDate());
            stm.setString(9, t.getSchedule());
            stm.setString(10, t.getDescription());
            stm.setString(11, t.getVehicle());
            stm.setString(12, t.getImg());

            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void deleteTours(String tourCode) {
        try {
            String sql = "DELETE FROM [Tour]\n"
                    + "      WHERE tourCode = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, tourCode);
            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<BookTours_Status> getBTours_Status() {
        ArrayList<BookTours_Status> btStatus = new ArrayList<>();
        try {
            String sql = "select id,status_name\n"
                    + "from BookTour_Status";
            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BookTours_Status bs = new BookTours_Status();
                bs.setId(rs.getInt("id"));
                bs.setStatus_name(rs.getString("status_name"));
                btStatus.add(bs);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return btStatus;

    }

    public void updateStatus(Booktour b) {

        try {
            String sql = "UPDATE [Booktour]\n"
                    + "   SET \n"
                    + "      [status_id] = ?\n"
                    + " WHERE bTourid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, b.getStatus());
            stm.setInt(2, b.getbTourId());

            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String[] args) {
        TourDBContext tourDB = new TourDBContext();
        ArrayList<Booktour> toursBookedPagging = tourDB.getToursBookedPagging(1, 1);
        for (Booktour booktour : toursBookedPagging) {
            System.out.println(booktour);
        }

    }

}
