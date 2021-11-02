<%-- 
    Document   : UserManager
    Created on : Oct 30, 2021, 9:41:10 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../assets/AdminCss/style.css" rel="stylesheet" type="text/css"/>
        <script src="../assets/js/admin.js" type="text/javascript"></script>
    </head>
    <body>

        <jsp:include page="Admin.jsp"></jsp:include>

            <!-- navbar -->
            <nav class="navbar navbar-expand-md  navbar-light">
                <button class="navbar-toggler ml-auto mb-2 bg-light" type="button" data-toggle="collapse" data-target="#myNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>


                <div class="collapse navbar-collapse " id="myNavbar">
                    <div class="container-fluid">
                    <jsp:include page="TopLeft.jsp"></jsp:include>

                        <div class="col-md-12" style="margin-top: 50px;">


                            <div class="container-xl" style="margin-left: 250px;">
                                <div class="table-responsive">
                                    <div class="table-wrapper">
                                        <div class="table-title">
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <h2>Manage <b>User</b></h2>
                                                </div>

                                            </div>
                                        </div>
                                        <form action="userManager" method="POST">
                                            <table class="table table-striped table-hover">
                                                <thead>
                                                    <tr>                       
                                                        <th>Username</th>
                                                        <th>Role</th>


                                                        <th>Action</th> 


                                                    </tr>
                                                </thead>
                                                <tbody>

                                                <c:forEach var="a" items="${allAccount}">
                                                    <tr>
                                                        <td>
                                                            ${a.username} <input type="hidden" name="username" value="${a.username}" />
                                                        </td>
                                                        <td>
                                                            ${a.group.gname}

                                                        </td>



                                                        <td>
                                                            <a href="editUser?user=${a.username}" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>    


                                                        </td>

                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                        </table>
                                    </form>


                                    <div class="clearfix">
                                        <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                                        <ul class="pagination">
                                            <li class="page-item disabled"><a href="#">Previous</a></li>
                                            <li class="page-item"><a href="#" class="page-link">1</a></li>
                                            <li class="page-item"><a href="#" class="page-link">2</a></li>
                                            <li class="page-item active"><a href="#" class="page-link">3</a></li>
                                            <li class="page-item"><a href="#" class="page-link">4</a></li>
                                            <li class="page-item"><a href="#" class="page-link">5</a></li>
                                            <li class="page-item"><a href="#" class="page-link">Next</a></li>
                                        </ul>
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
