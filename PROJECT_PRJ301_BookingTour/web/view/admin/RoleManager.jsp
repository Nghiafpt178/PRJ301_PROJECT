<%-- 
    Document   : RoleManager
    Created on : Nov 5, 2021, 8:28:16 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../assets/AdminCss/style.css" rel="stylesheet" type="text/css"/>
        <script src="../assets/js/admin.js" type="text/javascript"></script>

        <title>JSP Page</title>
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
                                                    <h2>Manager <b>Role</b></h2>
                                                </div>

                                            </div>
                                        </div>
                                        <form action="userManager" method="POST">
                                            <table class="table table-striped table-hover">
                                                <thead>
                                                    <tr>                       
                                                        <th>ID</th>
                                                        <th>Role</th>  
                                                        <th>Permission list</th>
                                                        <th>Action</th>                                             

                                                    </tr>
                                                </thead>
                                                <tbody>

                                                <c:forEach var="g" items="${groups}">
                                                    <tr>
                                                        <td>
                                                            ${g.gid} 
                                                        </td>
                                                        <td>
                                                            ${g.gname}

                                                        </td>
                                                        <td>
                                                            <c:forEach var="gf" items="${g.features}">   
                                                                <c:if test="${gf.name != null}">
                                                                    <button style="margin-top: 10px;" type="button" class="btn btn-primary btn-xs">${gf.name}</button>

                                                                    
                                                                </c:if>
                                                                <c:if test="${gf.name == null}">
                                                                    No permision
                                                                </c:if>
                                                            </c:forEach>                                                              

                                                        </td>
                                                        <td>
                                                            <a href="editRole?rid=${g.gid} " ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>    


                                                        </td>

                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                        </table>
                                    </form>



                                </div>
                            </div>        
                        </div>





                        </nav>

                        </body>
                        </html>
