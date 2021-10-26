/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.ImageDBContext;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Tour {

    private String tourCode;
    private String tourName;
    private int tourPrice;
    private int numberGuests;
    private Date startDate;
    private Date endDate;
    private String dateTime;
    private String schedule;
    private String description;
    private String vehicle;
    private int status;
    private String img;
    private ArrayList<Image> imgs = new ArrayList<>();

    public Tour() {
    }

    public ArrayList<Image> getImgs() {
        ImageDBContext imgDB = new ImageDBContext();
        ArrayList<Image> imgs = imgDB.getTours(tourCode);
        return imgs;
    }

    public void setImgs(ArrayList<Image> imgs) {
        this.imgs = imgs;
    }

    public Tour(String tourCode, String tourName, int tourPrice, int numberGuests,
            Date startDate, Date endDate, String dateTime, String schedule, String description,
            String vehicle, int status, String img) {
        this.tourCode = tourCode;
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        this.numberGuests = numberGuests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateTime = dateTime;
        this.schedule = schedule;
        this.description = description;
        this.vehicle = vehicle;
        this.status = status;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tour{" + "tourCode=" + tourCode + ", tourName=" + tourName + ", tourPrice=" + tourPrice + ", numberGuests=" + numberGuests + ", startDate=" + startDate + ", endDate=" + endDate + ", dateTime=" + dateTime + ", schedule=" + schedule + ", description=" + description + ", vehicle=" + vehicle + ", status=" + status + ", img=" + img + '}';
    }

}
