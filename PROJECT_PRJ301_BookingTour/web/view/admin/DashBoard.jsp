<%-- 
    Document   : Admin
    Created on : Oct 25, 2021, 9:55:14 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans:300, 400,700|Inconsolata:400,700" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <!-- local  -->
        <link rel="stylesheet" href="style.css">

        <link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">
        <link rel="stylesheet" href="fonts/fontawesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">


        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="../assets/AdminCss/Admin.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/AdminCss/Crud.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

        <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>

    </head>
    <body>


        <!-- navbar -->
        <nav class="navbar navbar-expand-md  navbar-light">
            <button class="navbar-toggler ml-auto mb-2 bg-light" type="button" data-toggle="collapse" data-target="#myNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>


            <div class="collapse navbar-collapse " id="myNavbar">
                <div class="container-fluid">
                    <jsp:include page="TopLeft.jsp"></jsp:include>


                </div>
            </div>

            <div class= "row" style="margin-top: 100px; margin-right: 200px; margin-left: 300px;">
                <div class ="col-6 col-sm-6 col-md-4 ">
                    <div class="card card-inverse card-success">
                        <div class="card-block bg-success">
                            <div class="rotate">
                                
                                <i class='bx bxs-data fa-5x' ></i>
                            </div>
                            <a href="ToursManager" style="color: white"><h6  class="text-uppercase">Tours Manager</h6></a>
                            <h1 class="display-1">${totalTour}</h1>
                        </div>
                    </div>
                </div>
                <div class ="col-6 col-sm-6 col-md-4 ">
                    <div class="card card-inverse card-danger">
                        <div class="card-block bg-danger">
                            <div class="rotate">
                                <i class='bx bxs-data fa-5x' ></i>
                            </div>
                            <a href="newsManager" style="color: white"><h6  class="text-uppercase">News Manager</h6></a>
                            <h1 class="display-1">${totalNews}</h1>
                        </div>
                    </div>
                </div>
                <div class ="col-6 col-sm-6 col-md-4">
                    <div class="card card-inverse card-info">
                        <div class="card-block bg-info">
                            <div class="rotate">
                                <i class='bx bxs-data fa-5x' ></i>
                            </div>
                            <a href="toursBooked" style="color: white"><h6  class="text-uppercase">Tour Booked Manager</h6></a>
                            <h1 class="display-1">${totalTourBooked}</h1>
                        </div>
                    </div>
                </div>
                <div class ="col-6 col-sm-6 col-md-4">
                    <div class="card card-inverse card-warning">
                            <div class="card-block bg-warning">
                                <div class="rotate">
                                    <i class='bx bxs-user-check fa-5x' ></i>
                                </div>
                                <a href="userManager" style="color: white"><h6  class="text-uppercase">User Manager</h6></a>
                                <h1 class="display-1">${totalAcc}</h1>
                            </div>
                        </div>
                </div>
                 <div class ="col-6 col-sm-6 col-md-4">
                    <div class="card card-inverse card-warning">
                            <div class="card-block bg-warning">
                                <div class="rotate">
                                    <i class='bx bxs-comment fa-5x' ></i>
                                </div>
                                <a href="userManager" style="color: white"><h6  class="text-uppercase">Comment Manager</h6></a>
                                <h1 class="display-1">${totalComment}</h1>
                            </div>
                        </div>
                </div>
                 <div class ="col-6 col-sm-6 col-md-4">
                    <div class="card card-inverse card-warning">
                            <div class="card-block bg-warning">
                                <div class="rotate">
                                    <i class='bx bxs-lock fa-5x' ></i>
                                </div>
                                <a href="roleController" style="color: white"><h6  class="text-uppercase">Role Manager</h6></a>
                                <h1 class="display-1">36</h1>
                            </div>
                        </div>
                </div>
               


            </div>





        </nav>


        <!-- local -->
        <script type="text/javascript " src="script.js "></script>
        <script src="js/bootstrap.min.js "></script>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js " integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo " crossorigin="anonymous "></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js " integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1 " crossorigin="anonymous "></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js " integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM " crossorigin="anonymous "></script>
    </body>
</html>
