/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.NewsDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.News;

/**
 *
 * @author ADMIN
 */
public class NewsManager extends BaseRequiredAuthenController {



    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        NewsDBContext newsDB = new  NewsDBContext();
        ArrayList<News> news = newsDB.getNews();
        request.setAttribute("news", news);
        request.getRequestDispatcher("/view/admin/NewsManager.jsp").forward(request, response);
        
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
