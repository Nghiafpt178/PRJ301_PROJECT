/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.AccountDBContext;
import dal.DecentraliseDBContext;
import java.io.IOException;
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
public class UserManagerController extends BaseRequiredAuthenController {
    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DecentraliseDBContext decen = new DecentraliseDBContext();
        ArrayList<Group> groups = decen.getGroups();
        request.setAttribute("groups", groups);
        ArrayList<Account> allAccount = decen.getAllAccount();
        request.setAttribute("allAccount", allAccount);
        
        request.getRequestDispatcher("/view/admin/UserManager.jsp").forward(request, response);
        
    }
    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
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
