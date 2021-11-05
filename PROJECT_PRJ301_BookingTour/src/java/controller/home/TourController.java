/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import dal.TourDBContext;
import java.io.IOException;
import java.sql.Date;
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
public class TourController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_page = request.getParameter("page");
        if(raw_page == null || raw_page.length()== 0)
            raw_page = "1";
        int pageIndex = Integer.parseInt(raw_page);
        int pageSize = 6;
        TourDBContext tourDB = new TourDBContext();
        ArrayList<Tour> tours = tourDB.getToursPagging(pageSize, pageIndex);
        
        int count = tourDB.getRowCount();
        int totalPage = (count % pageSize == 0) ? count/ pageSize : (count/pageSize)+1;
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("tours", tours);
        request.getRequestDispatcher("/view/tour/Tours.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String raw_tourName = request.getParameter("tname");
        String raw_startDate = request.getParameter("startDate");
        String raw_endDate = request.getParameter("endDate");
        String raw_tid = request.getParameter("tid");
        String name = raw_tourName;
      
        if(raw_tid == null || raw_tid.length() == 0){
            raw_tid = "-1";
        }
        
        int tid = Integer.parseInt(raw_tid);
        Date starDate = (raw_startDate != null && raw_startDate.length() > 0) ? Date.valueOf(raw_startDate) : null;
        Date endDate = (raw_endDate != null && raw_endDate.length() > 0) ? Date.valueOf(raw_endDate) : null;

        TourDBContext tourDB = new TourDBContext();
        ArrayList<Tour> tours = tourDB.searchTour(name, starDate, endDate, tid);
        request.setAttribute("tours", tours);

        request.getRequestDispatcher("/view/tour/Tours.jsp").forward(request, response);

    }

}
