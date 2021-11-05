/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import dal.AccountDBContext;
import dal.DecentraliseDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class InforController extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = (String) request.getSession().getAttribute("username");
        String pass = (String) request.getSession().getAttribute("pass");
        String passcurrent = request.getParameter("passcurrent");
        String newpass = request.getParameter("newpass");
        String repass = request.getParameter("repass");
        DecentraliseDBContext decenDB = new DecentraliseDBContext();
        Account allAccountByUser = decenDB.getAllAccountByUser(username);
        request.setAttribute("userAccount", allAccountByUser);
        if (!pass.equals(passcurrent)) {
            request.setAttribute("mess", "Pass current invalid!");
            
        } else {
            if (!newpass.equals(repass)) {
                request.setAttribute("mess", "Re-pass not equal!");
            } else {
                AccountDBContext accountDB = new AccountDBContext();
                accountDB.updatePass(newpass, username);
                request.setAttribute("mess", "Change password successfull!");
            }
        }
        request.setAttribute("passcurrent", passcurrent);
        request.setAttribute("userAccount", allAccountByUser);
        request.getRequestDispatcher("/view/customer/Infor.jsp").forward(request, response);

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
