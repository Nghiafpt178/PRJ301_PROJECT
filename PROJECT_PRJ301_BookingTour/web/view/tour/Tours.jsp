<%-- 
    Document   : Tours
    Created on : Oct 23, 2021, 4:05:03 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../assets/js/pagger.js" type="text/javascript"></script>
        <link href="../assets/css/pagger.css" rel="stylesheet" type="text/css"/>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>

        </head>
        <body>
        <jsp:include page="../home/Header.jsp"></jsp:include>

            <section id="pack" class="packages">
                <div class="container">
                    <div class="gallary-header text-center">
                        <h2>
                            Tour 
                        </h2>

                    </div><!--/.gallery-header-->
                    <div class="packages-content">

                        <div class="row">
                        <c:forEach var="td" items="${tours}">


                            <div class="col-sm-3">
                                <div class="single-package-item">
                                    <img src="../images/${td.img}" alt="package-place">
                                    <div class="single-package-item-txt">
                                        <h3>${td.tourName}</h3><br>
                                        <h3>${td.tourPrice}$</h3>
                                        <div class="packages-para">
                                            <p>
                                                <span>
                                                    <i class="fa fa-angle-right"></i> ${td.dateTime}
                                                </span>

                                            </p>
                                            <p>
                                                <span>
                                                    <i class="fa fa-angle-right"></i>  ${td.vehicle}
                                                </span>

                                            </p>
                                        </div><!--/.packages-para-->
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
                                            <a href="tourDetailControl?tcode=${td.tourCode}" class="btn btn-success btn-block">Detail</a>

                                        </div><!--/.about-btn-->
                                    </div><!--/.single-package-item-txt-->
                                </div><!--/.single-package-item-->

                            </div><!--/.col-->

                        </c:forEach>
                    </div><!--/.row-->

                </div><!--/.packages-content-->
            </div><!--/.container-->

        </section><!--/.packages-->
        <div id="paggerBottom" class="col-12 pagger" style="margin-left: 40%;">
           
        </div>
        <script>
            createPagger('paggerBottom',${requestScope.pageIndex}, 2,${requestScope.totalPage});
        </script> 
        <!--packages end-->

        <a style="margin-bottom: 50px;"></a>





        <jsp:include page="../home/Footer.jsp"></jsp:include>
        <jsp:include page="../link/LinkJS.jsp"></jsp:include>

    </body>
</html>
