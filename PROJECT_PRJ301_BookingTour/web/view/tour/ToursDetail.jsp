<%-- 
    Document   : ToursDetail
    Created on : Oct 23, 2021, 9:34:25 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>



    </head>
    <body>
        <jsp:include page="../home/Header.jsp"></jsp:include>
            <form action="booktour">
                <div class="container mt-5 mb-5">
                    <div class="card">
                        <div class="row g-0">
                            <div class="col-md-6 border-end">
                                <div class="d-flex flex-column justify-content-center">
                                     <div class="main_image"> <img src="../images/${tourByCode.img}" id="main_product_image" width="350"> </div>
                                <div class="thumbnail_images">

                                    <ul id="thumbnail">
                                        <c:forEach var="i" items="${tourByCode.imgs}">                                     
                                            <li><img onclick="changeImage(this)" src="../images/${i.img}" width="70"></li>
                                            </c:forEach>
                                    </ul>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="p-3 right-side">
                                <div class="d-flex justify-content-between align-items-center">
                                    <h3>${tourByCode.tourName}</h3>
                                </div>
                                <div class="mt-2 pr-3 content">

                                    <h5>Tour Code: ${tourByCode.tourCode}</h5> <input type="hidden" name="tcode" value="${tourByCode.tourCode}" />
                                    <br>
                                    <h5>Duration: ${tourByCode.dateTime} </h5>
                                    <br>
                                    <h5> StartDate ${tourByCode.startDate} - EndDate: ${tourByCode.endDate} </h5>
                                    <br>
                                    <h5>Vehicle: ${tourByCode.vehicle}</h5>
                                </div>
                                <h2 style="color: red">${tourByCode.tourPrice}$</h2>

                                <div class="buttons d-flex flex-row mt-5 gap-3"> 
                                    <button type="submit" class="btn btn-dark">Book Tour</button> </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <div class="container">
            <div class="row">                                    
                <div class="col-md-12">
                    <ul class="menu-items" style="font-size: 30px;">
                        <li role="presentation">
                            <a style="font-size: 20px;" href="#hotels" aria-controls="hotels" role="tab" data-toggle="tab">
                                <i class="fa fa-building"></i>
                                Schedule
                            </a>
                        </li>
                    </ul>
                    <div style="width:100%; border-top:1px solid silver">
                        <p style="padding:15px; font-size: 16px; ">
                            ${tourByCode.schedule}
                        </p>

                    </div>
                </div>	
                        <div class="col-md-12">
                    <ul class="menu-items" style="font-size: 30px;">
                        <li role="presentation">
                            <a style="font-size: 20px;" href="#flights" aria-controls="flights" role="tab" data-toggle="tab">
                                <i class="fa fa-plane"></i>
                                Desciption
                            </a>
                        </li>
                    </ul>
                    <div style="width:100%; border-top:1px solid silver">
                        <p style="padding:15px; font-size: 16px; ">
                            ${tourByCode.description}
                        </p>

                    </div>
                </div>	
            </div>
        </div>      



        <style>
            .container{
                background-color: white;
            }
            ul > li{margin-right:25px;font-weight:lighter;cursor:pointer}
            li.active{border-bottom:3px solid silver;}

            .item-photo{display:flex;justify-content:center;align-items:center;border-right:1px solid #f6f6f6;}
            .menu-items{list-style-type:none;font-size:11px;display:inline-flex;margin-bottom:0;margin-top:20px}
            .btn-success{width:100%;border-radius:0;}
            .section{width:100%;margin-left:-15px;padding:2px;padding-left:15px;padding-right:15px;background:#f8f9f9}
            .title-price{margin-top:30px;margin-bottom:0;color:black}
            .title-attr{margin-top:0;margin-bottom:0;color:black;}
            .btn-minus{cursor:pointer;font-size:7px;display:flex;align-items:center;padding:5px;padding-left:10px;padding-right:10px;border:1px solid gray;border-radius:2px;border-right:0;}
            .btn-plus{cursor:pointer;font-size:7px;display:flex;align-items:center;padding:5px;padding-left:10px;padding-right:10px;border:1px solid gray;border-radius:2px;border-left:0;}
            div.section > div {width:100%;display:inline-flex;}
            div.section > div > input {margin:0;padding-left:5px;font-size:10px;padding-right:5px;max-width:18%;text-align:center;}
            .attr,.attr2{cursor:pointer;margin-right:5px;height:20px;font-size:10px;padding:2px;border:1px solid gray;border-radius:2px;}
            .attr.active,.attr2.active{ border:1px solid orange;}

            @media (max-width: 426px) {
                .container {margin-top:0px !important;}
                .container > .row{padding:0 !important;}
                .container > .row > .col-xs-12.col-sm-5{
                    padding-right:0 ;    
                }
                .container > .row > .col-xs-12.col-sm-9 > div > p{
                    padding-left:0 !important;
                    padding-right:0 !important;
                }
                .container > .row > .col-xs-12.col-sm-9 > div > ul{
                    padding-left:10px !important;

                }            
                .section{width:104%;}
                .menu-items{padding-left:0;}
            }
        </style>
        <script>
            $(document).ready(function () {
                //-- Click on detail
                $("ul.menu-items > li").on("click", function () {
                    $("ul.menu-items > li").removeClass("active");
                    $(this).addClass("active");
                })

                $(".attr,.attr2").on("click", function () {
                    var clase = $(this).attr("class");

                    $("." + clase).removeClass("active");
                    $(this).addClass("active");
                })

                //-- Click on QUANTITY
                $(".btn-minus").on("click", function () {
                    var now = $(".section > div > input").val();
                    if ($.isNumeric(now)) {
                        if (parseInt(now) - 1 > 0) {
                            now--;
                        }
                        $(".section > div > input").val(now);
                    } else {
                        $(".section > div > input").val("1");
                    }
                })
                $(".btn-plus").on("click", function () {
                    var now = $(".section > div > input").val();
                    if ($.isNumeric(now)) {
                        $(".section > div > input").val(parseInt(now) + 1);
                    } else {
                        $(".section > div > input").val("1");
                    }
                })
            })
        </script>                    



        <style>
            body {
                background-color: #ecedee
            }

            .card {
                border: none;
                overflow: hidden
            }

            .thumbnail_images ul {
                list-style: none;
                justify-content: center;
                display: flex;
                align-items: center;
                margin-top: 10px
            }

            .thumbnail_images ul li {
                margin: 5px;
                padding: 10px;
                border: 2px solid #eee;
                cursor: pointer;
                transition: all 0.5s
            }

            .thumbnail_images ul li:hover {
                border: 2px solid #000
            }

            .main_image {
                display: flex;
                justify-content: center;
                align-items: center;
                border-bottom: 1px solid #eee;
                height: 400px;
                width: 100%;
                overflow: hidden
            }

            .heart {
                height: 29px;
                width: 29px;
                background-color: #eaeaea;
                border-radius: 50%;
                display: flex;
                justify-content: center;
                align-items: center
            }

            .content p {
                font-size: 12px
            }

            .ratings span {
                font-size: 14px;
                margin-left: 12px
            }

            .colors {
                margin-top: 5px
            }

            .colors ul {
                list-style: none;
                display: flex;
                padding-left: 0px
            }

            .colors ul li {
                height: 20px;
                width: 20px;
                display: flex;
                border-radius: 50%;
                margin-right: 10px;
                cursor: pointer
            }

            .colors ul li:nth-child(1) {
                background-color: #6c704d
            }

            .colors ul li:nth-child(2) {
                background-color: #96918b
            }

            .colors ul li:nth-child(3) {
                background-color: #68778e
            }

            .colors ul li:nth-child(4) {
                background-color: #263f55
            }

            .colors ul li:nth-child(5) {
                background-color: black
            }

            .right-side {
                position: relative
            }

            .search-option {
                position: absolute;
                background-color: #000;
                overflow: hidden;
                align-items: center;
                color: #fff;
                width: 200px;
                height: 200px;
                border-radius: 49% 51% 50% 50% / 68% 69% 31% 32%;
                left: 30%;
                bottom: -250px;
                transition: all 0.5s;
                cursor: pointer
            }

            .search-option .first-search {
                position: absolute;
                top: 20px;
                left: 90px;
                font-size: 20px;
                opacity: 1000
            }

            .search-option .inputs {
                opacity: 0;
                transition: all 0.5s ease;
                transition-delay: 0.5s;
                position: relative
            }

            .search-option .inputs input {
                position: absolute;
                top: 200px;
                left: 30px;
                padding-left: 20px;
                background-color: transparent;
                width: 300px;
                border: none;
                color: #fff;
                border-bottom: 1px solid #eee;
                transition: all 0.5s;
                z-index: 10
            }

            .search-option .inputs input:focus {
                box-shadow: none;
                outline: none;
                z-index: 10
            }

            .search-option:hover {
                border-radius: 0px;
                width: 100%;
                left: 0px
            }

            .search-option:hover .inputs {
                opacity: 1
            }

            .search-option:hover .first-search {
                left: 27px;
                top: 25px;
                font-size: 15px
            }

            .search-option:hover .inputs input {
                top: 20px
            }

            .search-option .share {
                position: absolute;
                right: 20px;
                top: 22px
            }

            .buttons .btn {
                height: 50px;
                width: 150px;
                border-radius: 0px !important
            }
        </style>

        <script>
            function changeImage(element) {

                var main_prodcut_image = document.getElementById('main_product_image');
                main_prodcut_image.src = element.src;


            }
        </script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <jsp:include page="../home/Footer.jsp"></jsp:include>
        <jsp:include page="../link/LinkJS.jsp"></jsp:include>





    </body>
</html>
