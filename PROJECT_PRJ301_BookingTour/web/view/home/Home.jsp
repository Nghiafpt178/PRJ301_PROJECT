<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : home
    Created on : Oct 23, 2021, 1:09:03 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js"  lang="en">
    <head>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>

        </head>

        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div id="myCarousel" class="carousel slide border" data-ride="carousel">
                <div class="carousel-inner">

                    <div class="carousel-item active">
                        <img class="d-block w-100" src="../assets/image/slider_2.png" alt="Leopard">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="../assets/image/slider_2.png" alt="Cat">
                    </div>

                </div>
                <!-- Controls -->
                <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>

            </div>
            <form name="myForm" action="toursControl" method="POST" onsubmit="return validateForm()" required>
                <div class= "container-fluid" style="margin: 60px;" >
                    <div class= "row">
                        <div class ="col-3">
                            <div class="form-header">
                                <div class="form-group">
                                    <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive">Tour Name</span>
                                    <input class="form-control" style="height: 40px; width: 250px;" name="tname" type="text" placeholder="Tour Name..">
                                </div>
                            </div>
                        </div>
                        <div class ="col-3">
                            <div class="form-header">
                                <div class="form-group">
                                    <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive"">Start Date</span>
                                    <input class="form-control" style="height: 40px; width: 250px;" name="startDate" type="date" >
                                </div>
                            </div>
                        </div>
                        <div class ="col-3">
                            <div class="form-header">
                                <div class="form-group">
                                    <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive"">End Date</span>
                                    <input class="form-control" style="height: 40px; width: 250px;" name="endDate" type="date" >
                                </div>
                            </div>
                        </div>
                       
                        <div class ="col-2">
                            <div class="form-header">
                                <div class="col" style="margin-top: 20px">
                                    <input class="btn btn-success btn-block" style="height: 40px; width: 250px;" type="submit" value="Search" />

                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </form>
            <script>
                function validateForm() {
                    var tname = document.forms["myForm"]["tname"].value;
                    var startDate = document.forms["myForm"]["startDate"].value;
                    var endDate = document.forms["myForm"]["endDate"].value;
                    var duration = document.forms["myForm"]["duration"].value;
                    var member = document.forms["myForm"]["member"].value;
                    if (tname === "" && startDate === "" && endDate === ""&& duration === ""&& member === "") {
                        alert("Please input at least one!");
                        return false;
                    }
                }

            </script>



            <!--galley start-->
            <section id="gallery" class="gallery">
                <div class="container">
                    <div class="gallery-details">
                        <div class="gallary-header text-center">
                            <h2>
                                Tour Hot
                            </h2>

                        </div><!--/.gallery-header-->

                        <div class="gallery-box">
                            <div class="gallery-content">
                                <div class="filtr-container">
                                    <div class="row"> 
                                    <c:forEach  var="th" items="${toursHot}">
                                        <div class="col-md-3">
                                            <div class="filtr-item">
                                                <img src="${th.img}" alt="portfolio image"/>
                                                <div class="item-title" >
                                                    <a style="font-size: 15px"href="tourDetailControl?tcode=${th.tourCode}">
                                                        ${th.tourName}
                                                    </a>

                                                </div><!-- /.item-title -->
                                            </div><!-- /.filtr-item -->
                                        </div><!-- /.col -->
                                    </c:forEach>
                                </div><!-- /.filtr-container-->


                            </div><!-- /.gallery-content -->
                        </div><!--/.galley-box-->
                    </div><!--/.gallery-details-->


                </div><!--/.container-->

        </section><!--/.gallery-->
        <!--gallery end-->



        <!--packages start-->
        <section id="pack" class="packages">
            <div class="container">
                <div class="gallary-header text-center">
                    <h2>
                        Tour discount
                    </h2>

                </div><!--/.gallery-header-->
                <div class="packages-content">
                    <div class="row">
                        <c:forEach var="td" items="${toursDiscount}">

                            <div class="col-md-4 col-sm-6">
                                <div class="single-package-item">
                                    <img src="${td.img}" alt="package-place">
                                    <div class="single-package-item-txt">
                                        <h3>${td.tourName}</h3><br>
                                        <h3>${td.tourPrice}$</h3>

                                        <div class="about-btn">
                                            <a href="tourDetailControl?tcode=${td.tourCode}" class="about-view packages-btn">
                                                Details
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




        <!--blog start-->
        <section id="blog" class="blog">
            <div class="container">
                <div class="blog-details">
                    <div class="gallary-header text-center">
                        <h2>
                            Trending News
                        </h2>

                    </div><!--/.gallery-header-->
                    <div class="blog-content">
                        <div class="row">
                            <c:forEach var="ln" items="${lastNews}">

                                <div class="col-sm-4 col-md-4">
                                    <div class="thumbnail">
                                        <h2>trending news <span>${ln.writeDate}</span></h2>
                                        <div class="thumbnail-img">
                                            <img src="${ln.image}" alt="blog-img">
                                            <div class="thumbnail-img-overlay"></div><!--/.thumbnail-img-overlay-->

                                        </div><!--/.thumbnail-img-->

                                        <div class="caption">
                                            <div class="blog-txt">
                                                <h3>
                                                    <a href="#">
                                                        ${ln.title}
                                                    </a>
                                                </h3>

                                                <a href="newsDetailControl?nid=${ln.id}">Read More</a>
                                            </div><!--/.blog-txt-->
                                        </div><!--/.caption-->
                                    </div><!--/.thumbnail-->

                                </div><!--/.col-->

                            </c:forEach>



                        </div><!--/.row-->
                    </div><!--/.blog-content-->
                </div><!--/.blog-details-->
            </div><!--/.container-->

        </section><!--/.blog-->
        <!--blog end-->


        

        <jsp:include page="Footer.jsp"></jsp:include>


        <jsp:include page="../link/LinkJS.jsp"></jsp:include>



    </body>
</html>
