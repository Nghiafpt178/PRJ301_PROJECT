/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.News;

/**
 *
 * @author ADMIN
 */
public class NewsDBContext extends DBContext {

    public ArrayList<News> getLastNews() {
        ArrayList<News> news = new ArrayList<>();
        try {
            String sql = "select top 3 id,tital,[description],[Image],writeDate\n"
                    + "from News\n"
                    + "order by writeDate desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setWriteDate(rs.getDate("writeDate"));
                news.add(n);
            }

        } catch (SQLException e) {

        }
        return news;

    }

    public ArrayList<News> getNews(int pageSize, int pageIndex) {
        ArrayList<News> news = new ArrayList<>();
        try {
            String sql = "select id, tital, [description], [image], writeDate  from\n"
                    + "                    (select ROW_NUMBER() OVER (Order by id) as rownum,\n"
                    + "                    id, tital, [description], [image], writeDate\n"
                    + "                    from News) t\n"
                    + "                    where rownum >= (?- 1)*?+1 \n"
                    + "                    and rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setWriteDate(rs.getDate("writeDate"));
                news.add(n);
            }

        } catch (SQLException e) {

        }
        return news;

    }

    public News getNewsById(int id) {

        try {
            String sql = "select id,tital, [description], [image], writeDate\n"
                    + "from News where id =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setWriteDate(rs.getDate("writeDate"));
                return n;
            }

        } catch (SQLException e) {

        }
        return null;

    }

    public void saveNews(News n) {

        try {
            String sql = "UPDATE [News]\n"
                    + "   SET \n"
                    + "      [tital] = ?\n"
                    + "      ,[description] = ?\n"
                    + "      ,[image] = ?\n"
                    + "      ,[writeDate] = ?\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, n.getTitle());
            stm.setString(2, n.getDesciption());
            stm.setString(3, n.getImage());
            stm.setDate(4, n.getWriteDate());
            stm.setInt(5, n.getId());

            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(NewsDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void addNews(News n) {

        try {
            String sql = "INSERT INTO [News]\n"
                    + "           ([id]\n"
                    + "           ,[tital]\n"
                    + "           ,[description]\n"
                    + "           ,[image]\n"
                    + "           ,[writeDate])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, n.getId());
            stm.setString(2, n.getTitle());
            stm.setString(3, n.getDesciption());
            stm.setString(4, n.getImage());
            stm.setDate(5, n.getWriteDate());

            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(NewsDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void deleteNews(int id) {

        try {
            String sql = "DELETE FROM [News]\n"
                    + "      WHERE id =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(NewsDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<News> getNewsPagging(int pageSize, int pageIndex) {
        ArrayList<News> news = new ArrayList<>();
        try {
            String sql = "select  id,tital,[description], [image],writeDate from\n"
                    + "(select ROW_NUMBER() over (order by id) as rownum, id,tital,[description], [image],writeDate\n"
                    + "from News ) t \n"
                    + "where rownum >= (?- 1)*?+1 \n"
                    + "    and rownum <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                n.setWriteDate(rs.getDate("writeDate"));
                news.add(n);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return news;

    }

    public int getRowCount() {

        String sql = "select count(*) as total from News";
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

    public static void main(String[] args) {
       NewsDBContext newDB = new NewsDBContext();
        ArrayList<News> news = newDB.getNews(3, 1);
        for (News aNew : news) {
            System.out.println(aNew);
        }
    }

}
