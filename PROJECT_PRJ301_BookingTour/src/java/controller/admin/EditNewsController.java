/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.NewsDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.News;

/**
 *
 * @author ADMIN
 */
public class EditNewsController extends BaseRequiredAuthenController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nid = request.getParameter("nid");
        NewsDBContext newsDB = new NewsDBContext();
        News newsById = newsDB.getNewsById(Integer.parseInt(nid));
        request.setAttribute("newsById", newsById);
        request.getRequestDispatcher("/view/admin/NewsEdit.jsp").forward(request, response);

    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
