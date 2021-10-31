/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import controller.authen.BaseRequiredAuthenController;
import dal.NewsDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.News;

/**
 *
 * @author ADMIN
 */
public class AddNewsController extends BaseRequiredAuthenController{

  

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }


    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String descrip = request.getParameter("descrip");
        String img = request.getParameter("img");
        String writeDate = request.getParameter("writeDate");
        
        News n = new News();
        n.setId(Integer.parseInt(id));
        n.setTitle(title);
        n.setDesciption(descrip);
        n.setImage(img);
        n.setWriteDate(Date.valueOf(writeDate));
        NewsDBContext newsDB = new NewsDBContext();
        newsDB.addNews(n);
        response.sendRedirect("newsManager");
        
       
    }

  

  
    

}
