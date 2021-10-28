<%-- 
    Document   : News
    Created on : Oct 23, 2021, 4:04:46 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>
    </head>
    <body>
    <jsp:include page="../home/Header.jsp"></jsp:include>
        <section id="pack" class="packages">
            <div class="container">
                <div class="gallary-header text-center">
                    <h2>
                        News 
                    </h2>
                    

                </div><!--/.gallery-header-->
                <div class="packages-content">
                    <div class="row">
                        <c:forEach var="n" items="${news}">
                            <div class="col-md-4 col-sm-6">
                                <div class="single-package-item">
                                    <img src="../images/${n.image}" alt="package-place">
                                    <div class="single-package-item-txt">
                                        <h3>${n.title}</h3><br>
                                        <div class="packages-review">
                                            <p>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <span>2544 review</span>
                                            </p>
                                        </div><!--/.packages-review-->
                                        <div class="about-btn">
                                            <a href="newsDetailControl?nid=${n.id}" class="about-view packages-btn">
                                                details
                                            </a>
                                        </div><!--/.about-btn-->
                                    </div><!--/.single-package-item-txt-->
                                </div><!--/.single-package-item-->

                            </div><!--/.col-->
                        </c:forEach>

                    </div><!--/.row-->
                </div><!--/.packages-content-->
            </div><!--/.container-->

        </section><!--/.packages-->
        <!--packages end-->
        
        <jsp:include page="../home/Footer.jsp"></jsp:include>
        <jsp:include page="../link/LinkJS.jsp"></jsp:include>
      
    </body>
</html>
