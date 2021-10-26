/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class News {
    private int id;
    private String title;
    private String desciption;
    private String image;
    private Date writeDate;

    public News() {
    }

    public News(int id, String title, String desciption, String image, Date writeDate) {
        this.id = id;
        this.title = title;
        this.desciption = desciption;
        this.image = image;
        this.writeDate = writeDate;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tital) {
        this.title = tital;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "New{" + "id=" + id + ", title=" + title + ", desciption=" + desciption + ", image=" + image + '}';
    }
    
    
}
