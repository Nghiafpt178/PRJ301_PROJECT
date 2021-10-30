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
import model.Booktour;

/**
 *
 * @author ADMIN
 */
public class ToursBookedManager extends BaseRequiredAuthenController {

    

   
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        TourDBContext tourDB = new TourDBContext();
        ArrayList<Booktour> toursBooked = tourDB.getToursBooked();
        request.setAttribute("toursBooked", toursBooked);
        
        request.getRequestDispatcher("/view/admin/ToursBookedManager.jsp").forward(request, response);
        
    }

  
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  

}
