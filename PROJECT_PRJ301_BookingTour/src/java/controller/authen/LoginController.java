/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authen;

import dal.AccountDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class LoginController extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie arr[] = request.getCookies();
        if (arr != null) {
            for (Cookie c : arr) {
                if (c.getName().equals("user")) {
                    request.setAttribute("username", c.getValue());
                }
                if (c.getName().equals("pass")) {
                    request.setAttribute("password", c.getValue());
                }
            }
        }

        request.getRequestDispatcher("../view/authen/Login.jsp").forward(request, response);

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String remember = request.getParameter("remember");
        AccountDBContext accountDB = new AccountDBContext();
        Account account = accountDB.getAccount(user, pass);
        if(account == null){
            request.setAttribute("mess", "Wrong username or password");
            request.getRequestDispatcher("../view/authen/Login.jsp").forward(request, response);
            
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
            session.setAttribute("username", user);
            
            
            Cookie u = new Cookie("user", user);
            Cookie p = new Cookie("pass", pass);
            u.setMaxAge(60);
            if(remember != null){
                p.setMaxAge(60);
            }else{
                p.setMaxAge(0);
            }
            response.addCookie(u);
            response.addCookie(p);
           
            response.sendRedirect("homeControl");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
