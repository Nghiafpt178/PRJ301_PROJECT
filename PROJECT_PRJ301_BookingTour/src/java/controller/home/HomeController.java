/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import dal.NewsDBContext;
import dal.TourDBContext;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.News;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class HomeController extends HttpServlet {



    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TourDBContext  tourDB = new TourDBContext();
        ArrayList<Tour> toursHot = tourDB.getToursByTitle(1);
        request.setAttribute("toursHot", toursHot);
        
         ArrayList<Tour> toursDiscount = tourDB.getToursByTitle(2);
        request.setAttribute("toursDiscount", toursDiscount);
        
        NewsDBContext lastNew = new NewsDBContext();
        ArrayList<News> lastNews = lastNew.getLastNews();
        request.setAttribute("lastNews", lastNews);
        
        Account account = (Account)request.getSession().getAttribute("acc");
        request.setAttribute("account", account);
        request.getRequestDispatcher("/view/home/Home.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  

}
