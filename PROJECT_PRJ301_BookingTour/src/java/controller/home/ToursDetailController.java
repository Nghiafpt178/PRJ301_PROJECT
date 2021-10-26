/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import dal.TourDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class ToursDetailController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String tourCode = request.getParameter("tcode");
        TourDBContext  tourDB= new TourDBContext();
        Tour tourByCode = tourDB.getToursByCode(tourCode);
        request.setAttribute("tourByCode", tourByCode);  
        
        
        request.getRequestDispatcher("/view/tour/ToursDetail.jsp").forward(request, response);
     
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
}
