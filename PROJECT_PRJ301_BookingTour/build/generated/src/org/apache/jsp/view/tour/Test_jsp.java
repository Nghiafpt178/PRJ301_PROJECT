package org.apache.jsp.view.tour;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-4 item-photo\">\n");
      out.write("                    <img style=\"max-width:100%;\" src=\"https://ak1.ostkcdn.com/images/products/8818677/Samsung-Galaxy-S4-I337-16GB-AT-T-Unlocked-GSM-Android-Cell-Phone-85e3430e-6981-4252-a984-245862302c78_600.jpg\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-5\" style=\"border:0px solid gray\">\n");
      out.write("                    <!-- Datos del vendedor y titulo del producto -->\n");
      out.write("                    <h3>Samsung Galaxy S4 I337 16GB 4G LTE Unlocked GSM Android Cell Phone</h3>    \n");
      out.write("                    <h5 style=\"color:#337ab7\">vendido por <a href=\"#\">Samsung</a> · <small style=\"color:#337ab7\">(5054 ventas)</small></h5>\n");
      out.write("\n");
      out.write("                    <!-- Precios -->\n");
      out.write("                    <h6 class=\"title-price\"><small>PRECIO OFERTA</small></h6>\n");
      out.write("                    <h3 style=\"margin-top:0px;\">U$S 399</h3>\n");
      out.write("\n");
      out.write("                    <!-- Detalles especificos del producto -->\n");
      out.write("                    <div class=\"section\">\n");
      out.write("                        <h6 class=\"title-attr\" style=\"margin-top:15px;\" ><small>COLOR</small></h6>                    \n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"attr\" style=\"width:25px;background:#5a5a5a;\"></div>\n");
      out.write("                            <div class=\"attr\" style=\"width:25px;background:white;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"section\" style=\"padding-bottom:5px;\">\n");
      out.write("                        <h6 class=\"title-attr\"><small>CAPACIDAD</small></h6>                    \n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"attr2\">16 GB</div>\n");
      out.write("                            <div class=\"attr2\">32 GB</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"section\" style=\"padding-bottom:20px;\">\n");
      out.write("                        <h6 class=\"title-attr\"><small>CANTIDAD</small></h6>                    \n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"btn-minus\"><span class=\"glyphicon glyphicon-minus\"></span></div>\n");
      out.write("                            <input value=\"1\" />\n");
      out.write("                            <div class=\"btn-plus\"><span class=\"glyphicon glyphicon-plus\"></span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                \n");
      out.write("\n");
      out.write("                    <!-- Botones de compra -->\n");
      out.write("                    <div class=\"section\" style=\"padding-bottom:20px;\">\n");
      out.write("                        <button class=\"btn btn-success\"><span style=\"margin-right:20px\" class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> Agregar al carro</button>\n");
      out.write("                        <h6><a href=\"#\"><span class=\"glyphicon glyphicon-heart-empty\" style=\"cursor:pointer;\"></span> Agregar a lista de deseos</a></h6>\n");
      out.write("                    </div>                                        \n");
      out.write("                </div>                              \n");
      out.write("\n");
      out.write("                <div class=\"col-xs-9\">\n");
      out.write("                    <ul class=\"menu-items\">\n");
      out.write("                        <li class=\"active\">Detalle del producto</li>\n");
      out.write("                        <li>Garantía</li>\n");
      out.write("                        <li>Vendedor</li>\n");
      out.write("                        <li>Envío</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div style=\"width:100%;border-top:1px solid silver\">\n");
      out.write("                        <p style=\"padding:15px;\">\n");
      out.write("                            <small>\n");
      out.write("                                Stay connected either on the phone or the Web with the Galaxy S4 I337 from Samsung. With 16 GB of memory and a 4G connection, this phone stores precious photos and video and lets you upload them to a cloud or social network at blinding-fast speed. With a 17-hour operating life from one charge, this phone allows you keep in touch even on the go. \n");
      out.write("\n");
      out.write("                                With its built-in photo editor, the Galaxy S4 allows you to edit photos with the touch of a finger, eliminating extraneous background items. Usable with most carriers, this smartphone is the perfect companion for work or entertainment.\n");
      out.write("                            </small>\n");
      out.write("                        </p>\n");
      out.write("                        <small>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Super AMOLED capacitive touchscreen display with 16M colors</li>\n");
      out.write("                                <li>Available on GSM, AT T, T-Mobile and other carriers</li>\n");
      out.write("                                <li>Compatible with GSM 850 / 900 / 1800; HSDPA 850 / 1900 / 2100 LTE; 700 MHz Class 17 / 1700 / 2100 networks</li>\n");
      out.write("                                <li>MicroUSB and USB connectivity</li>\n");
      out.write("                                <li>Interfaces with Wi-Fi 802.11 a/b/g/n/ac, dual band and Bluetooth</li>\n");
      out.write("                                <li>Wi-Fi hotspot to keep other devices online when a connection is not available</li>\n");
      out.write("                                <li>SMS, MMS, email, Push Mail, IM and RSS messaging</li>\n");
      out.write("                                <li>Front-facing camera features autofocus, an LED flash, dual video call capability and a sharp 4128 x 3096 pixel picture</li>\n");
      out.write("                                <li>Features 16 GB memory and 2 GB RAM</li>\n");
      out.write("                                <li>Upgradeable Jelly Bean v4.2.2 to Jelly Bean v4.3 Android OS</li>\n");
      out.write("                                <li>17 hours of talk time, 350 hours standby time on one charge</li>\n");
      out.write("                                <li>Available in white or black</li>\n");
      out.write("                                <li>Model I337</li>\n");
      out.write("                                <li>Package includes phone, charger, battery and user manual</li>\n");
      out.write("                                <li>Phone is 5.38 inches high x 2.75 inches wide x 0.13 inches deep and weighs a mere 4.59 oz </li>\n");
      out.write("                            </ul>  \n");
      out.write("                        </small>\n");
      out.write("                    </div>\n");
      out.write("                </div>\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <style>\n");
      out.write("            ul > li{margin-right:25px;font-weight:lighter;cursor:pointer}\n");
      out.write("            li.active{border-bottom:3px solid silver;}\n");
      out.write("\n");
      out.write("            .item-photo{display:flex;justify-content:center;align-items:center;border-right:1px solid #f6f6f6;}\n");
      out.write("            .menu-items{list-style-type:none;font-size:11px;display:inline-flex;margin-bottom:0;margin-top:20px}\n");
      out.write("            .btn-success{width:100%;border-radius:0;}\n");
      out.write("            .section{width:100%;margin-left:-15px;padding:2px;padding-left:15px;padding-right:15px;background:#f8f9f9}\n");
      out.write("            .title-price{margin-top:30px;margin-bottom:0;color:black}\n");
      out.write("            .title-attr{margin-top:0;margin-bottom:0;color:black;}\n");
      out.write("            .btn-minus{cursor:pointer;font-size:7px;display:flex;align-items:center;padding:5px;padding-left:10px;padding-right:10px;border:1px solid gray;border-radius:2px;border-right:0;}\n");
      out.write("            .btn-plus{cursor:pointer;font-size:7px;display:flex;align-items:center;padding:5px;padding-left:10px;padding-right:10px;border:1px solid gray;border-radius:2px;border-left:0;}\n");
      out.write("            div.section > div {width:100%;display:inline-flex;}\n");
      out.write("            div.section > div > input {margin:0;padding-left:5px;font-size:10px;padding-right:5px;max-width:18%;text-align:center;}\n");
      out.write("            .attr,.attr2{cursor:pointer;margin-right:5px;height:20px;font-size:10px;padding:2px;border:1px solid gray;border-radius:2px;}\n");
      out.write("            .attr.active,.attr2.active{ border:1px solid orange;}\n");
      out.write("\n");
      out.write("            @media (max-width: 426px) {\n");
      out.write("                .container {margin-top:0px !important;}\n");
      out.write("                .container > .row{padding:0 !important;}\n");
      out.write("                .container > .row > .col-xs-12.col-sm-5{\n");
      out.write("                    padding-right:0 ;    \n");
      out.write("                }\n");
      out.write("                .container > .row > .col-xs-12.col-sm-9 > div > p{\n");
      out.write("                    padding-left:0 !important;\n");
      out.write("                    padding-right:0 !important;\n");
      out.write("                }\n");
      out.write("                .container > .row > .col-xs-12.col-sm-9 > div > ul{\n");
      out.write("                    padding-left:10px !important;\n");
      out.write("\n");
      out.write("                }            \n");
      out.write("                .section{width:104%;}\n");
      out.write("                .menu-items{padding-left:0;}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                //-- Click on detail\n");
      out.write("                $(\"ul.menu-items > li\").on(\"click\", function () {\n");
      out.write("                    $(\"ul.menu-items > li\").removeClass(\"active\");\n");
      out.write("                    $(this).addClass(\"active\");\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                $(\".attr,.attr2\").on(\"click\", function () {\n");
      out.write("                    var clase = $(this).attr(\"class\");\n");
      out.write("\n");
      out.write("                    $(\".\" + clase).removeClass(\"active\");\n");
      out.write("                    $(this).addClass(\"active\");\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                //-- Click on QUANTITY\n");
      out.write("                $(\".btn-minus\").on(\"click\", function () {\n");
      out.write("                    var now = $(\".section > div > input\").val();\n");
      out.write("                    if ($.isNumeric(now)) {\n");
      out.write("                        if (parseInt(now) - 1 > 0) {\n");
      out.write("                            now--;\n");
      out.write("                        }\n");
      out.write("                        $(\".section > div > input\").val(now);\n");
      out.write("                    } else {\n");
      out.write("                        $(\".section > div > input\").val(\"1\");\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("                $(\".btn-plus\").on(\"click\", function () {\n");
      out.write("                    var now = $(\".section > div > input\").val();\n");
      out.write("                    if ($.isNumeric(now)) {\n");
      out.write("                        $(\".section > div > input\").val(parseInt(now) + 1);\n");
      out.write("                    } else {\n");
      out.write("                        $(\".section > div > input\").val(\"1\");\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("\n");
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
