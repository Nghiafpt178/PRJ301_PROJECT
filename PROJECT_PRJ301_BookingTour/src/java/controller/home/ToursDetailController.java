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
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = (String) request.getSession().getAttribute("username");
        String tourCode = request.getParameter("tcode");
        TourDBContext tourDB = new TourDBContext();
        Tour tourByCode = tourDB.getToursByCode(tourCode);
        request.setAttribute("tourByCode", tourByCode);
         CommentDBContext commentDB = new CommentDBContext();
        int total = commentDB.countComment(tourCode);
        ArrayList<Comment> comments = commentDB.getComments(tourCode);
        request.setAttribute("comments", comments);
        request.setAttribute("user", username);
        request.setAttribute("total", total);
        Comment c = new Comment();
        String content = request.getParameter("content");

        c.setTourCode(tourCode);
        c.setUsername(username);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        c.setDatetime(dtf.format(now));
        c.setContent(content);
        CommentDBContext cDB = new CommentDBContext();
        cDB.insertComment(c);

        request.getRequestDispatcher("/view/tour/ToursDetail.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

       
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
    
}
