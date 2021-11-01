/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authen;

import dal.AccountDBContext;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Group;

/**
 *
 * @author ADMIN
 */
public class SignUpController extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String user = request.getParameter("user");
       String pass = request.getParameter("pass");
       String repass = request.getParameter("repass");
       if(!pass.equals(repass)){
           response.sendRedirect("login");
       }else{
           AccountDBContext account = new AccountDBContext();
           Account a = account.checkAccountExist(user);
           if(a == null){
               account.insertAccount(user, pass);
               account.insertGroup(3, user);
               response.sendRedirect("homeControl");
           }else{
               response.sendRedirect("login");
           }
       }
       
       
       
    }

   

}
