<%-- 
    Document   : NewsDetail1
    Created on : Nov 2, 2021, 12:50:29 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../assets/css/tourDetails.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <jsp:include page="../home/Header.jsp"></jsp:include>
            <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800&display=swap" rel="stylesheet">
            <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
            <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css">
            <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css"><div class="pd-wrap">
                <form action="booktour">
                    <div class="container">
                        <div class="heading-section">
                            <h2>Tour Details</h2>
                        </div>
                        <div class="row">
                            <div class="col-md-6">

                                <div class="main_image" style="margin-left: 70px;"> 
                                    <img src="../images/${tourByCode.img}" id="main_product_image" height="300px" width="350px">
                            </div>

                            <div class="thumbnail_images" style="margin-top: 50px;">
                                <div id="thumbnail">
                                    <c:forEach var="i" items="${tourByCode.imgs}">                                     
                                        <img  height="100px" width="150px" onclick="changeImage(this)" src="../images/${i.img}" width="70">
                                    </c:forEach>
                                </div>

                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="product-dtl">
                                <div class="product-info">
                                    <div class="product-name">
                                        <h5 style="color: red">${tourByCode.tourName}</h5>
                                    </div>

                                    <div class="product-price-discount ">
                                        <h5>${tourByCode.tourPrice}$</h5>

                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-md-12">
                                        <h5 >Tour Code: ${tourByCode.tourCode}</h5> <input type="hidden" name="tcode" value="${tourByCode.tourCode}" />
                                        <br>
                                        <h5>Duration: ${tourByCode.dateTime} </h5>
                                        <br>
                                        <h5> StartDate ${tourByCode.startDate} - EndDate: ${tourByCode.endDate} </h5>
                                        <br>
                                        <h5>Vehicle: ${tourByCode.vehicle}</h5>
                                    </div>

                                </div>
                                <div class="product-count">
                                    <button type="submit" class="round-black-btn">Book Tour</button> </div>

                            </div>
                        </div>
                    </div>
                </div>
            </form>
            <div class="container">
                <div class="product-info-tabs">
                    <ul class="nav nav-tabs" id="myTab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="description-tab" data-toggle="tab" href="#description" role="tab" aria-controls="description" aria-selected="true">Description</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="description-tab" data-toggle="tab" href="#schedule" role="tab" aria-controls="description" aria-selected="true">Schedule</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="review-tab" data-toggle="tab" href="#review" role="tab" aria-controls="review" aria-selected="false">Comments(${total})</a>
                        </li>
                    </ul>
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active" id="description" role="tabpanel" aria-labelledby="description-tab">
                            ${tourByCode.description}

                        </div>
                        <div class="tab-pane fade" id="schedule" role="tabpanel" aria-labelledby="description-tab">
                            ${tourByCode.schedule}
                        </div>
                        <div class="tab-pane fade" id="review" role="tabpanel" aria-labelledby="review-tab">
                            <c:forEach var="c" items="${comments}">

                                ${c.username} <br> ${c.content}    ${c.datetime}
                                <hr>
                            </c:forEach>
                            <hr>
                            <div class="review-heading">Comment</div>

                            <form name="myForm" class="review-form" action="tourDetailControl" method="POST" onsubmit="return validateForm()">

                                <div class="form-group">
                                    <label>Your comment</label>
                                    <input type="hidden" name="tcode" value="${tourByCode.tourCode}" />
                                    <textarea name="content" class="form-control" rows="10" required></textarea>
                                </div>
                                    <input type="hidden" name="user" value="${user}" />
                                
                                <input type="submit" class="round-black-btn" value="POST"/>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>




    <script>
        function changeImage(element) {

            var main_prodcut_image = document.getElementById('main_product_image');
            main_prodcut_image.src = element.src;
        }

        function validateForm()
        {
           var user = document.forms["myForm"]["user"].value;
          
           if(user === ""){
               alert("Login to post");
               return false;
           }

        }

        $(document).ready(function () {
            var slider = $("#slider");
            var thumb = $("#thumb");
            var slidesPerPage = 4; //globaly define number of elements per page
            var syncedSecondary = true;
            slider.owlCarousel({
                items: 1,
                slideSpeed: 2000,
                nav: false,
                autoplay: false,
                dots: false,
                loop: true,
                responsiveRefreshRate: 200
            }).on('changed.owl.carousel', syncPosition);
            thumb
                    .on('initialized.owl.carousel', function () {
                        thumb.find(".owl-item").eq(0).addClass("current");
                    })
                    .owlCarousel({
                        items: slidesPerPage,
                        dots: false,
                        nav: true,
                        item: 4,
                        smartSpeed: 200,
                        slideSpeed: 500,
                        slideBy: slidesPerPage,
                        navText: ['<svg width="18px" height="18px" viewBox="0 0 11 20"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M9.554,1.001l-8.607,8.607l8.607,8.606"/></svg>', '<svg width="25px" height="25px" viewBox="0 0 11 20" version="1.1"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M1.054,18.214l8.606,-8.606l-8.606,-8.607"/></svg>'],
                        responsiveRefreshRate: 100
                    }).on('changed.owl.carousel', syncPosition2);
            function syncPosition(el) {
                var count = el.item.count - 1;
                var current = Math.round(el.item.index - (el.item.count / 2) - .5);
                if (current < 0) {
                    current = count;
                }
                if (current > count) {
                    current = 0;
                }
                thumb
                        .find(".owl-item")
                        .removeClass("current")
                        .eq(current)
                        .addClass("current");
                var onscreen = thumb.find('.owl-item.active').length - 1;
                var start = thumb.find('.owl-item.active').first().index();
                var end = thumb.find('.owl-item.active').last().index();
                if (current > end) {
                    thumb.data('owl.carousel').to(current, 100, true);
                }
                if (current < start) {
                    thumb.data('owl.carousel').to(current - onscreen, 100, true);
                }
            }
            function syncPosition2(el) {
                if (syncedSecondary) {
                    var number = el.item.index;
                    slider.data('owl.carousel').to(number, 100, true);
                }
            }
            thumb.on("click", ".owl-item", function (e) {
                e.preventDefault();
                var number = $(this).index();
                slider.data('owl.carousel').to(number, 300, true);
            });


            $(".qtyminus").on("click", function () {
                var now = $(".qty").val();
                if ($.isNumeric(now)) {
                    if (parseInt(now) - 1 > 0)
                    {
                        now--;
                    }
                    $(".qty").val(now);
                }
            })
            $(".qtyplus").on("click", function () {
                var now = $(".qty").val();
                if ($.isNumeric(now)) {
                    $(".qty").val(parseInt(now) + 1);
                }
            });
        });
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="	sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <jsp:include page="../home/Footer.jsp"></jsp:include>
</body>
</html>
