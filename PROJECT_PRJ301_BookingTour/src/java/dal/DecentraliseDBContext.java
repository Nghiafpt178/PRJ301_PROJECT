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
import model.Group;

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

    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> account = new ArrayList<>();
        try {
            String sql = "select distinct a.username,g.gid, g.gname\n"
                    + "                     from account a\n"
                    + "                    left join groupaccount ga on a.username = ga.username\n"
                    + "                    left join [group] g on ga.gid = g.gid \n"
                    + "                    order by a.username asc, g.gid asc";
            PreparedStatement stm = connection.prepareStatement(sql);
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
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    public static void main(String[] args) {
        DecentraliseDBContext db = new DecentraliseDBContext();
        ArrayList<Group> groups = db.getGroups();
        for (Group group : groups) {
            System.out.println(group);
        }
    }

}
