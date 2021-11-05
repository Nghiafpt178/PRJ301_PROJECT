/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import dal.TourDBContext;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Booktour;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class BookTourController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tourcode = request.getParameter("tcode");
        request.getSession().setAttribute("tourcode", tourcode);
        TourDBContext tour = new TourDBContext();
        Tour toursByCode = tour.getToursByCode(tourcode);
        request.setAttribute("toursByCode", toursByCode);
        request.getRequestDispatcher("/view/tour/BookTour.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String require = request.getParameter("note");
        Booktour booktour = new Booktour();
        booktour.setFullname(fullname);
        booktour.setPhone(phone);
        booktour.setEmail(email);
        booktour.setAddress(address);
        booktour.setRequire(require);
        booktour.setStatus(1);
        String username =  (String) request.getSession().getAttribute("username");
        booktour.setUsername(username);
        String tourcode = (String) request.getSession().getAttribute("tourcode");
        TourDBContext tour = new TourDBContext();
        Tour toursByCode = tour.getToursByCode(tourcode); 
        booktour.setTour(toursByCode);
        tour.bookTour(booktour);
        request.setAttribute("mess", "Thank you for booking!");
        request.getRequestDispatcher("/view/tour/BookTour.jsp").forward(request, response);

    }
    
    

}
