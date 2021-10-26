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
import model.Image;

/**
 *
 * @author ADMIN
 */
public class ImageDBContext extends DBContext {

    public ArrayList<Image> getTours(String tcode) {
        ArrayList<Image> images = new ArrayList<>();
        try {
            String sql = "select id,img\n"
                    + "from [Image] where tourCode = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, tcode);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Image i = new Image();
                i.setId(rs.getInt("id"));
                i.setImg(rs.getString("img"));
                images.add(i);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return images;
    }
}
