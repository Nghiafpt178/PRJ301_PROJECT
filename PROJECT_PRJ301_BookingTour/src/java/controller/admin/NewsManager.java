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
        String raw_page = request.getParameter("page");
        if(raw_page == null || raw_page.length() == 0)
            raw_page = "1";
        int pageIndex = Integer.parseInt(raw_page);
        int pageSize = 3;
        NewsDBContext newDB = new NewsDBContext();
        ArrayList<News> newsPagging = newDB.getNewsPagging(pageSize, pageIndex);
        
        int count = newDB.getRowCount();
        int totalPage = (count % pageSize == 0)? count/pageSize: (count/pageSize)+1;
        
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("news", newsPagging);
        request.getRequestDispatcher("/view/admin/NewsManager.jsp").forward(request, response);
        
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
