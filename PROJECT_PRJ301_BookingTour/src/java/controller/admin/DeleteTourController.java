/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.TourDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class DeleteTourController extends BaseRequiredAuthenController {

   protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tcode = request.getParameter("tourcode");
        TourDBContext tourDB = new TourDBContext();
        tourDB.deleteTours(tcode);
        response.sendRedirect("ToursManager");
    }
    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }


}
