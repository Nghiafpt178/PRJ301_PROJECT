/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import dal.TourDBContext;
import java.io.IOException;
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
public class ToursBookedController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("uname");
        TourDBContext tourDB = new TourDBContext();
        ArrayList<Booktour> toursBookedByCustomer = tourDB.getToursBookedByCustomer(username);
        request.setAttribute("toursBookedByCustomer", toursBookedByCustomer);
        
        request.getRequestDispatcher("/view/tour/TourBooked.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
