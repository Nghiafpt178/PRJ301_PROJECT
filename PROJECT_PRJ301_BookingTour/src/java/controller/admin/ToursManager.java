/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.TourDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class ToursManager extends BaseRequiredAuthenController {

  @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String raw_page = request.getParameter("page");
        if (raw_page == null || raw_page.length() == 0) {
            raw_page = "1";
        }
        int pageIndex = Integer.parseInt(raw_page);
        int pageSize = 5;
        TourDBContext tourDB = new TourDBContext();
        ArrayList<Tour> tours = tourDB.getToursPagging(pageSize, pageIndex);

        int count = tourDB.getRowCount();
        int totalPage = (count % pageSize == 0) ? count / pageSize : (count / pageSize) + 1;
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("tours", tours);

        ArrayList<ToursType> toursType = tourDB.getToursType();
        request.setAttribute("toursType", toursType);
        request.setAttribute("tours", tours);

        request.getRequestDispatcher("/view/admin/ToursManager.jsp").forward(request, response);
    }
    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tcode = request.getParameter("tcode");
        String tname = request.getParameter("tname");
        String timg = request.getParameter("timg");
        int tprice = Integer.parseInt(request.getParameter("tprice"));
        Date tstartDate = Date.valueOf(request.getParameter("tstartDate"));
        Date tendDate = Date.valueOf(request.getParameter("tendDate"));
        String tduration = request.getParameter("tduration");
        String tvehicle = request.getParameter("tvehicle");
        String tdescip = request.getParameter("tdescip");
        String tschedule = request.getParameter("tschedule");
        int tourType = Integer.parseInt(request.getParameter("ttype"));
        int tourNumber = Integer.parseInt(request.getParameter("tnumber"));
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
        tourDB.saveTours(t);
        response.sendRedirect("ToursManager");
        
    }

   
}
