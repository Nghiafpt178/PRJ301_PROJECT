/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import controller.authen.BaseRequiredAuthenController;
import dal.DecentraliseDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Feature;
import model.Group;
import model.GroupFeature;

/**
 *
 * @author ADMIN
 */
public class EditRoleController extends BaseRequiredAuthenController {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditRoleController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditRoleController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int rid = Integer.parseInt(request.getParameter("rid"));
        DecentraliseDBContext decenDB = new DecentraliseDBContext();
        ArrayList<Feature> features = decenDB.getFeatures();
        request.setAttribute("features", features);
        GroupFeature allFeatures = decenDB.getAllFeatures(rid);
        request.setAttribute("allFeatures", allFeatures);
        request.getRequestDispatcher("/view/admin/EditRole.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int rid = Integer.parseInt(request.getParameter("roleId"));
        String[] permissions = request.getParameterValues("permissions");
        Group g = new Group();
        if (permissions != null) {
            for (String permission : permissions) {
                GroupFeature gf = new GroupFeature();
                g.setGid(rid);
                Feature f = new Feature();
                f.setId(Integer.parseInt(permission));
                gf.setG(g);
                gf.setF(f);
                g.getGf().add(gf);

            }

        }
        DecentraliseDBContext decenDB = new DecentraliseDBContext();
        decenDB.update(g);
        response.sendRedirect("roleController");

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
