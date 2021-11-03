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
import model.BookTours_Status;
import model.Booktour;

/**
 *
 * @author ADMIN
 */
public class EditTourBookedController extends BaseRequiredAuthenController {

   

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int bid = Integer.parseInt(request.getParameter("bid"));
        TourDBContext tourDB = new TourDBContext();
        Booktour toursBooked = tourDB.getToursBookedById(bid);
        request.setAttribute("toursBooked", toursBooked);
        ArrayList<BookTours_Status> bTours_Status = tourDB.getBTours_Status();
        request.setAttribute("bTours_Status", bTours_Status);
        
        request.getRequestDispatcher("/view/admin/EditTourBooked.jsp").forward(request, response);
    }

  
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String requestType = request.getParameter("requestType");
        if (requestType != null) {
            if (requestType.equalsIgnoreCase("Cancel")) {
                response.sendRedirect("toursBooked");
            } else {
                int sid = Integer.parseInt(request.getParameter("sid"));
                int bid = Integer.parseInt(request.getParameter("bid"));
                TourDBContext tourDB = new TourDBContext();
                Booktour b = new Booktour();
                b.setbTourId(bid);
                b.setStatus(sid);
                tourDB.updateStatus(b);
                response.sendRedirect("toursBooked");
            }
        }
        
        
    }

    

}
