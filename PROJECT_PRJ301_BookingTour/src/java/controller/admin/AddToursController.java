/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.TourDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class AddToursController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tcode = request.getParameter("code");
        String tname = request.getParameter("name");
        String timg = request.getParameter("img");
        int tprice = Integer.parseInt(request.getParameter("price"));
        Date tstartDate = Date.valueOf(request.getParameter("checkin"));
        Date tendDate = Date.valueOf(request.getParameter("checkout"));
        String tduration = request.getParameter("duration");
        String tvehicle = request.getParameter("vehicle");
        String tdescip = request.getParameter("descrip");
        String tschedule = request.getParameter("schedule");
        int tourType = Integer.parseInt(request.getParameter("ttype"));
        int tourNumber = Integer.parseInt(request.getParameter("numberGuests"));
        Tour t = new Tour();
        t.setTourCode(tcode);
        t.setTourName(tname);
        t.setImg(timg);
        t.setTourPrice(tprice);
        t.setStartDate(tstartDate);
        t.setEndDate(tendDate);
        t.setDateTime(tduration);
        t.setVehicle(tvehicle);
        t.setDescription(tdescip);
        t.setSchedule(tschedule);
        t.setTourType(tourType);
        t.setNumberGuests(tourNumber);
        TourDBContext tourDB = new TourDBContext();
        tourDB.addTours(t);
        response.sendRedirect("ToursManager");
    }

}
