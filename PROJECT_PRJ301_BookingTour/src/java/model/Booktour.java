/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Booktour {
    private int bTourId;
    private Tour tour;
    private String username;
    private String fullname;
    private String phone;
    private String email;
    private String address;
    private String require;
    private int status;
    

    public Booktour() {
    }

    public Booktour(int bTourId, Tour tour, String username, String fullname,
            String phone, String email, String address, String require, int status) {
        this.bTourId = bTourId;
        this.tour = tour;
        this.username = username;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.require = require;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    

    public int getbTourId() {
        return bTourId;
    }

    public void setbTourId(int bTourId) {
        this.bTourId = bTourId;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    @Override
    public String toString() {
        return "Booktour{" + "bTourId=" + bTourId + ", tour=" + tour + ", username=" + username + ", fullname=" + fullname + ", phone=" + phone + ", email=" + email + ", address=" + address + ", require=" + require + ", status=" + status + '}';
    }
    
    
    
    
}
