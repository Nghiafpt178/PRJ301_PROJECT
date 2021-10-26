<%-- 
    Document   : TopLeft
    Created on : Oct 26, 2021, 11:49:46 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="row">
                        <!-- sidebar navbar -->
                        <div class="col-lg-3 col-xl-2 col-md-4 sidebar fixed-top">
                            <a href="#" class="navbar-brand text-white d-block mx-auto text-center mb-4 bottom-border pb-2">
                                CodeAdmin
                            </a>

                            <img src="https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80" width="50"height="50" alt="nice" class="rounded-circle mr-3">
                            <a href="#" class="text-white ">Bode Maegsn </a>
                            <div class="border-bottom pb-3"></div>
                            <ul class="navbar-nav flex-column mt-4">
                                <li class="nav-item">
                                    <a href="AdminController" class="nav-link text-light p-3 mb-2 current"> <i class="fa fa-home text-light fa-lg mr-3" aria-hidden="true"></i> Dashboard
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="#" class="nav-link text-light p-3 mb-2 sidebar-link"> <i class="fa fa-user text-light fa-lg mr-3" aria-hidden="true"></i> Profile
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="ToursManager" class="nav-link text-light p-3 mb-2 sidebar-link"> <i class='bx bxs-data'></i> Tours Manager
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="newsManager" class="nav-link text-light p-3 mb-2 sidebar-link"> <i class='bx bxs-data'></i> News Manager
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="toursBooked" class="nav-link text-light p-3 mb-2 sidebar-link"> <i class='bx bxs-data'></i>Tour Booked Manager
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="#" class="nav-link text-light p-3 mb-2 sidebar-link"> <i class='bx bxs-data'></i> User Manager
                                    </a>
                                </li>

                            </ul>
                        </div>
                        <!-- end sidebar -->

                        <!--  top nav-->
                        <div class="col-lg-9 col-xl-10 col-md-8 ml-auto bg-dark fixed-top py-2 top-navbar">
                            <div class="row align-items-center">
                                <div class="col-md-4">
                                    <h4 class="text-light text-uppercase mb-0">Dashboard</h4>
                                </div>
                                <div class="col-md-5">
                                    <form>
                                        <div class="input-group">
                                            <input type="text" class="form-control"id="search-input" placeholder="Search here">
                                            <button type="button" class="btn btn-light"id="search-button"><i class="fa fa-search text-danger"></i></button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col-md-3">
                                    <ul class="navbar-nav">
                                        <li class="nav-item icon-parent">
                                            <a href="#" class="nav-link icon-bullet "><i class="fa fa-comments text-muted fa-lg"></i></a>
                                        </li>
                                        <li class="nav-item icon-parent">
                                            <a href="#" class="nav-link icon-bullet"><i class="fa fa-bell text-muted fa-lg"></i></a>
                                        </li>
                                        <li class="nav-item ml-md-auto ">
                                            <a href="#" class="nav-link "><i class="fa fa-sign-out text-danger fa-lg"></i></a>
                                        </li>
                                    </ul>

                                </div>

                            </div>
                        </div>

                        <!-- end nav -->
                    </div>
    </body>
</html>
