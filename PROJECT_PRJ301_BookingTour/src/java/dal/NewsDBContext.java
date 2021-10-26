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

    public ArrayList<News> getNews() {
        ArrayList<News> news = new ArrayList<>();
        try {
            String sql = "select id,tital, [description], [image], writeDate\n"
                    + "from News";
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

    public static void main(String[] args) {
        NewsDBContext newDB = new NewsDBContext();
        ArrayList<News> news = newDB.getNews();
        for (News n : news) {
            System.out.println(n);
        }
    }

}
