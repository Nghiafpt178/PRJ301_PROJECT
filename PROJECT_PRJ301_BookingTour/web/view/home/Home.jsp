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

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="../assets/css/home.css" rel="stylesheet" type="text/css"/>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>

        </head>

        <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <!--Card-->
            <form name="myForm" action="toursControl" method="POST" onsubmit="return validateForm()" required>
                <div class="card shadow mb-5 bg-white rounded" style="margin-top: 100px; ">
                    <!--Card-Body-->
                    <div class="card-body">
                        <!--Card-Title-->
                        <p class="card-title text-center shadow mb-5 rounded">Search Tour</p>
                        <div class="icons text-center">
                            <i class="fa fa-plane fa-2x" aria-hidden="true"></i>
                            <i class="fa fa-taxi fa-2x" aria-hidden="true"></i>
                            <i class="fa fa-train fa-2x" aria-hidden="true"></i> </div>                 
                        <!--Second Row-->
                        <div class="row">
                            <div class="col-sm-12"> 
                                <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive">Tour Name</span>
                                <input class="form-control"  name="tname" type="text" placeholder="Tour Name..">
                            </div>

                        </div>
                        <!--Third Row-->
                        <div class="row">
                            <div class="col-sm-4">
                                <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive">Check-in</span>
                                <input class="form-control" style="height: 40px; width: 250px;" name="startDate" type="date" > 
                            </div>
                            <div class="col-sm-4">
                                <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive">Check-out</span>
                                <input class="form-control" style="height: 40px; width: 250px;" name="endDate" type="date" > 
                            </div>
                            <div class="col-sm-4">
                                <span class="form-label" style="font-weight: bold; font-size: 20px; font-family: cursive">Tour type</span>
                                <select class="form-control" style="height: 40px; width: 250px;" name="tid">
                                    <option value="-1">All</option>
                                <c:forEach var="t" items="${toursType}">                                   
                                    <option value="${t.id}">${t.name}</option>
                                </c:forEach> 
                            </select>
                        </div>

                    </div>

                </div> 
                <input class="btn btn-success btn-block float-right mt-5" type="submit" value="Search" />

            </div>
        </div>
    </form>

    <script>
        function validateForm() {
            var tname = document.forms["myForm"]["tname"].value;
            var startDate = document.forms["myForm"]["startDate"].value;
            var endDate = document.forms["myForm"]["endDate"].value;
            var tourType = document.forms["myForm"]["tid"].value;


            if (tname === "" && startDate === "" && endDate === "" && tourType ==="") {
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
                                            <img src="../images/${th.img}" alt="portfolio image"/>
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
                                <img src="../images/${td.img}" alt="package-place">
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
                                        <img src="../images/${ln.image}" alt="blog-img">
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
