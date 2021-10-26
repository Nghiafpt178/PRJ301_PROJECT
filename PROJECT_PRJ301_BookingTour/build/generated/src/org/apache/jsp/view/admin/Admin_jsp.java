package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:300, 400,700|Inconsolata:400,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- local  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"../../assets/AdminCss/Admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- navbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-md  navbar-light\">\n");
      out.write("            <button class=\"navbar-toggler ml-auto mb-2 bg-light\" type=\"button\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"myNavbar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- sidebar navbar -->\n");
      out.write("                        <div class=\"col-lg-3 col-xl-2 col-md-4 sidebar fixed-top\">\n");
      out.write("                            <a href=\"#\" class=\"navbar-brand text-white d-block mx-auto text-center mb-4 bottom-border pb-2\">\n");
      out.write("                                CodeAdmin\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <img src=\"https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80\" width=\"50\"height=\"50\" alt=\"nice\" class=\"rounded-circle mr-3\">\n");
      out.write("                            <a href=\"#\" class=\"text-white \">Bode Maegsn </a>\n");
      out.write("                            <div class=\"border-bottom pb-3\"></div>\n");
      out.write("                            <ul class=\"navbar-nav flex-column mt-4\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 current\"> <i class=\"fa fa-home text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Dashboard\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-user text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Profile\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-envelope text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Inbox\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-shopping-cart text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Sales\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-table text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Analytics\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fas fa-table text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Charts\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-table text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Tables\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-wrench text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Settings\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link text-light p-3 mb-2 sidebar-link\"> <i class=\"fa fa-file text-light fa-lg mr-3\" aria-hidden=\"true\"></i> Documentation\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end sidebar -->\n");
      out.write("\n");
      out.write("                        <!--  top nav-->\n");
      out.write("                        <div class=\"col-lg-9 col-xl-10 col-md-8 ml-auto bg-dark fixed-top py-2 top-navbar\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <h4 class=\"text-light text-uppercase mb-0\">Dashboard</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-5\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"id=\"search-input\" placeholder=\"Search here\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-light\"id=\"search-button\"><i class=\"fa fa-search text-danger\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <ul class=\"navbar-nav\">\n");
      out.write("                                        <li class=\"nav-item icon-parent\">\n");
      out.write("                                            <a href=\"#\" class=\"nav-link icon-bullet \"><i class=\"fa fa-comments text-muted fa-lg\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item icon-parent\">\n");
      out.write("                                            <a href=\"#\" class=\"nav-link icon-bullet\"><i class=\"fa fa-bell text-muted fa-lg\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item ml-md-auto \">\n");
      out.write("                                            <a href=\"#\" class=\"nav-link \"><i class=\"fa fa-sign-out text-danger fa-lg\"></i></a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end nav -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <!-- local -->\n");
      out.write("        <script type=\"text/javascript \" src=\"script.js \"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js \"></script>\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js \" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo \" crossorigin=\"anonymous \"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js \" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1 \" crossorigin=\"anonymous \"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js \" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM \" crossorigin=\"anonymous \"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
