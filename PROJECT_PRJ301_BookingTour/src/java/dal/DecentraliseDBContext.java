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
import model.Account;
import model.Comment;
import model.Feature;
import model.Group;
import model.GroupFeature;

/**
 *
 * @author ADMIN
 */
public class DecentraliseDBContext extends DBContext {

    public ArrayList<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<>();
        try {
            String sql = "select gid,gname from [Group]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Group g = new Group();
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
                groups.add(g);
            }

        } catch (SQLException e) {

        }
        return groups;

    }

    public ArrayList<Account> getAllAccount(int pageSize, int pageIndex) {
        ArrayList<Account> account = new ArrayList<>();
        try {
            String sql = "select t.username,t.gid, t.gname from\n"
                    + "		(select ROW_NUMBER() over (order by a.username) as rownum, a.username,g.gid, g.gname\n"
                    + "                                      from account a\n"
                    + "                                  left join groupaccount ga on a.username = ga.username\n"
                    + "                                 left join [group] g on ga.gid = g.gid \n"
                    + "                                 ) t\n"
                    + "			 where rownum >= (?- 1)*?+1 \n"
                    + "                               		and rownum <= ?* ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("username"));
                Group g = new Group();
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
                a.setGroup(g);
                account.add(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    public Account getAllAccountByUser(String user) {
        ArrayList<Account> account = new ArrayList<>();
        try {
            String sql = "select distinct a.username,g.gid, g.gname\n"
                    + "                     from account a\n"
                    + "                    left join groupaccount ga on a.username = ga.username\n"
                    + "                    left join [group] g on ga.gid = g.gid where a.username =? \n"
                    + "                    order by a.username asc, g.gid asc ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Account a = new Account();
                a.setUsername(rs.getString("username"));
                Group g = new Group();
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
                a.setGroup(g);
                return a;

            }

        } catch (SQLException ex) {
            Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateAuthority(Account a) {

        try {
            String sql = "UPDATE [GroupAccount]\n"
                    + "   SET [gid] = ?    \n"
                    + " WHERE [username] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, a.getGroup().getGid());
            stm.setString(2, a.getUsername());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Comment> getAllComment(int pageSize, int pageIndex) {
        ArrayList<Comment> comments = new ArrayList<>();
        try {
            String sql = "select  t.id, t.username , t.tourCode, t.[date] , t.content,\n"
                    + "                    t.gname from\n"
                    + "	   (select ROW_NUMBER() OVER (Order by id) as rownum,\n"
                    + "	     c.id, c.username , c.tourCode, c.[date] , c.content,\n"
                    + "                    g.gname\n"
                    + "                    from Comments c inner join Account a\n"
                    + "                    on c.username = a.username left join GroupAccount ga\n"
                    + "                    on a.username = ga.username left join [Group] g\n"
                    + "                    on ga.gid = g.gid) t\n"
                    + "	where rownum >= (? - 1)*? +1 and rownum <= ? *?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageIndex);
            stm.setInt(2, pageSize);
            stm.setInt(3, pageIndex);
            stm.setInt(4, pageSize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Comment c = new Comment();
                c.setId(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setTourCode(rs.getString("tourCode"));
                c.setDatetime(rs.getString("date"));
                c.setContent(rs.getString("content"));
                Group g = new Group();
                g.setGname(rs.getString("gname"));
                c.setGroup(g);
                comments.add(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comments;
    }

    public int getRowCount() {

        String sql = "  select count(*) as total from Account";
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

    public int getRowCountComment() {

        String sql = "select count(*) as total from Comments";
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

    public GroupFeature getAllFeatures(int gid) {

        try {
            String sql = "select distinct gf.fid,gf.gid,g.gname,f.url, f.fname\n"
                    + "                  from  groupaccount ga \n"
                    + "                   left join [group] g on ga.gid = g.gid \n"
                    + "                   left join GroupFeature gf on gf.gid = g.gid\n"
                    + "                   left join Feature f on f.fid = gf.fid\n"
                    + "                    where g.gid =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, gid);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                GroupFeature gf = new GroupFeature();
                Group g = new Group();
                Feature f = new Feature();
                f.setId(rs.getInt("fid"));
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
                f.setUrl(rs.getString("url"));
                f.setName(rs.getString("fname"));
                gf.setF(f);
                gf.setG(g);
                return gf;

            }

        } catch (SQLException e) {

        }
        return null;

    }

    public ArrayList<Feature> getFeaturesByAccount(int gid) {
        ArrayList<Feature> features = new ArrayList<>();
        try {
            String sql = "select distinct gf.fid,gf.gid,g.gname,f.url, f.fname\n"
                    + "                  from  groupaccount ga \n"
                    + "                   left join [group] g on ga.gid = g.gid \n"
                    + "                   left join GroupFeature gf on gf.gid = g.gid\n"
                    + "                   left join Feature f on f.fid = gf.fid\n"
                    + "                    where g.gid =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, gid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Feature f = new Feature();
                f.setId(rs.getInt("fid"));
                f.setUrl(rs.getString("url"));
                f.setName(rs.getString("fname"));
                features.add(f);

            }

        } catch (SQLException e) {

        }
        return features;

    }

    public ArrayList<Feature> getFeatures() {
        ArrayList<Feature> features = new ArrayList<>();
        try {
            String sql = "SELECT [fid]\n"
                    + "      ,[url]\n"
                    + "      ,[fname]\n"
                    + "  FROM [Feature]";
            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Feature f = new Feature();
                f.setId(rs.getInt("fid"));
                f.setUrl(rs.getString("url"));
                f.setName(rs.getString("fname"));
                features.add(f);

            }

        } catch (SQLException e) {

        }
        return features;

    }

    public void update(Group g) {
        try {
            connection.setAutoCommit(false);

            //query delete data from table Student_Certificate
            String sql_delete_GroupFeature = "DELETE FROM [GroupFeature]\n"
                    + "      WHERE gid = ?";
            PreparedStatement stm_delete = connection.prepareStatement(sql_delete_GroupFeature);
            stm_delete.setInt(1, g.getGid());
            stm_delete.executeUpdate();
            //query to re-insert data in Student_Certificate
            for (GroupFeature gf : g.getGf()) {
                String sql_insert_sc = "INSERT INTO [GroupFeature]\n"
                        + "           ([gid]\n"
                        + "           ,[fid])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?)";
                PreparedStatement stm_insert_sc = connection.prepareStatement(sql_insert_sc);
                stm_insert_sc.setInt(1, gf.getG().getGid());
                stm_insert_sc.setInt(2, gf.getF().getId());
                stm_insert_sc.executeUpdate();
            }

            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(DecentraliseDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        DecentraliseDBContext db = new DecentraliseDBContext();
        GroupFeature allFeatures = db.getAllFeatures(1);
        System.out.println(allFeatures);

    }

}
