<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : header
    Created on : Oct 23, 2021, 1:16:44 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Book Tour</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto topnav">
                    <li class="nav-item active">
                        <a class="nav-link" href="homeControl">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="toursControl">Tours</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="newsControl">News</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact</a>
                    </li>
                    <c:if test="${account == null}">
                        <li class="nav-item">
                            <a class="nav-link btn btn-primary text-white" type="button" href="login" >Login</a>                  
                        </li>
                    </c:if>           

                    <c:if test="${account != null}">
                        <li class="nav-item">
                            <a class="nav-link btn btn-danger text-white" type="button" href="#">Hello: ${account.username}</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link btn btn-danger text-white" type="button" href="logout">Logout</a>
                        </li>
                        
                    </c:if>


                </ul>
            </div>


        </nav>


        <style>
            .topnav a:hover {
                border-bottom: 3px solid red;
            }


        </style>
    </body>
</html>
