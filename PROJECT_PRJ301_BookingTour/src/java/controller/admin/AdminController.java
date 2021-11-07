/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class AdminController extends BaseRequiredAuthenController {

    

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         DecentraliseDBContext decenDB = new DecentraliseDBContext();
        int row_Acc = decenDB.getRowCount();
        request.setAttribute("totalAcc", row_Acc);
        TourDBContext tourDB = new TourDBContext();
        int total_Tour = tourDB.getRowCount();
        request.setAttribute("totalTour", total_Tour);
        NewsDBContext newDB = new NewsDBContext();
        int totalNews = newDB.getRowCount();
        request.setAttribute("totalNews", totalNews);
        int totalComment = decenDB.getRowCountComment();
        request.setAttribute("totalComment", totalComment);
        int totalTourBooked = tourDB.getRowCountBooked();
        request.setAttribute("totalTourBooked", totalTourBooked);
        request.getRequestDispatcher("../view/admin/DashBoard.jsp").forward(request, response);
    }

  
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
