/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.AccountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class LoginAdminController extends HttpServlet {

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/view/admin/Login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String remember = request.getParameter("remember");
        AccountDBContext accountDB = new AccountDBContext();
        Account account = accountDB.getAccount(user, pass);
        if (account == null) {
            request.setAttribute("mess", "Wrong username or password");
            request.getRequestDispatcher("../view/admin/Login.jsp").forward(request, response);

        } else {
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
            session.setAttribute("username", user);
            response.sendRedirect("AdminController");
        }
        
    }

    

}
