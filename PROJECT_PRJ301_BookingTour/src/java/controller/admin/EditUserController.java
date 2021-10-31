/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.DecentraliseDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class EditUserController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DecentraliseDBContext decen = new DecentraliseDBContext();
        String user = request.getParameter("user");
        ArrayList<Group> groups = decen.getGroups();
        request.setAttribute("groups", groups);
        Account accByUser = decen.getAllAccountByUser(user);
        request.setAttribute("accByUser", accByUser);
        
        
        request.getRequestDispatcher("/view/admin/EditUser.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int gid = Integer.parseInt(request.getParameter("gid"));
        String user = request.getParameter("username");
        DecentraliseDBContext decen = new DecentraliseDBContext();
        Account a = new Account();
        a.setUsername(user);
        Group g = new Group();
        g.setGid(gid);
        a.setGroup(g);
        decen.updateAuthority(a);
        response.sendRedirect("userManager");
    }

    

}
