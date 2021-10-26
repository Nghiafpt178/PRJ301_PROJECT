package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Crud_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"../../assets/AdminCss/Crud.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-lg\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-8\"><h2>Employee <b>Details</b></h2></div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus\"></i> Add New</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Department</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("                                <th>Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>John Doe</td>\n");
      out.write("                                <td>Administration</td>\n");
      out.write("                                <td>(171) 555-2222</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                                    <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                                    <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Peter Parker</td>\n");
      out.write("                                <td>Customer Service</td>\n");
      out.write("                                <td>(313) 555-5735</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                                    <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                                    <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Fran Wilson</td>\n");
      out.write("                                <td>Human Resources</td>\n");
      out.write("                                <td>(503) 555-9931</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                                    <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                                    <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>      \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                var actions = $(\"table td:last-child\").html();\n");
      out.write("                // Append table with add row form on add new button click\n");
      out.write("                $(\".add-new\").click(function () {\n");
      out.write("                    $(this).attr(\"disabled\", \"disabled\");\n");
      out.write("                    var index = $(\"table tbody tr:last-child\").index();\n");
      out.write("                    var row = '<tr>' +\n");
      out.write("                            '<td><input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\"></td>' +\n");
      out.write("                            '<td><input type=\"text\" class=\"form-control\" name=\"department\" id=\"department\"></td>' +\n");
      out.write("                            '<td><input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\"></td>' +\n");
      out.write("                            '<td>' + actions + '</td>' +\n");
      out.write("                            '</tr>';\n");
      out.write("                    $(\"table\").append(row);\n");
      out.write("                    $(\"table tbody tr\").eq(index + 1).find(\".add, .edit\").toggle();\n");
      out.write("                    $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                });\n");
      out.write("                // Add row on add button click\n");
      out.write("                $(document).on(\"click\", \".add\", function () {\n");
      out.write("                    var empty = false;\n");
      out.write("                    var input = $(this).parents(\"tr\").find('input[type=\"text\"]');\n");
      out.write("                    input.each(function () {\n");
      out.write("                        if (!$(this).val()) {\n");
      out.write("                            $(this).addClass(\"error\");\n");
      out.write("                            empty = true;\n");
      out.write("                        } else {\n");
      out.write("                            $(this).removeClass(\"error\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                    $(this).parents(\"tr\").find(\".error\").first().focus();\n");
      out.write("                    if (!empty) {\n");
      out.write("                        input.each(function () {\n");
      out.write("                            $(this).parent(\"td\").html($(this).val());\n");
      out.write("                        });\n");
      out.write("                        $(this).parents(\"tr\").find(\".add, .edit\").toggle();\n");
      out.write("                        $(\".add-new\").removeAttr(\"disabled\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                // Edit row on edit button click\n");
      out.write("                $(document).on(\"click\", \".edit\", function () {\n");
      out.write("                    $(this).parents(\"tr\").find(\"td:not(:last-child)\").each(function () {\n");
      out.write("                        $(this).html('<input type=\"text\" class=\"form-control\" value=\"' + $(this).text() + '\">');\n");
      out.write("                    });\n");
      out.write("                    $(this).parents(\"tr\").find(\".add, .edit\").toggle();\n");
      out.write("                    $(\".add-new\").attr(\"disabled\", \"disabled\");\n");
      out.write("                });\n");
      out.write("                // Delete row on delete button click\n");
      out.write("                $(document).on(\"click\", \".delete\", function () {\n");
      out.write("                    $(this).parents(\"tr\").remove();\n");
      out.write("                    $(\".add-new\").removeAttr(\"disabled\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
