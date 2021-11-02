<%-- 
    Document   : NewsManager
    Created on : Oct 26, 2021, 11:45:39 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
       
        <script src="../assets/js/paggerNewsManager.js" type="text/javascript"></script>
        <link href="../assets/css/pagger.css" rel="stylesheet" type="text/css"/>
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
                                                    <h2>Manage <b>News</b></h2>
                                                </div>
                                                <div class="col-sm-6">
                                                    <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add News</span></a>

                                                </div>
                                            </div>
                                        </div>
                                        <table class="table table-striped table-hover">
                                            <thead>
                                                <tr>                       
                                                    <th >News ID</th>
                                                    <th style="width: 200px;">News Title</th>
                                                    <th style="width: 200px;">News Image</th>
                                                    <th style="width: 200px;">News WriteDate</th>


                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="n" items="${news}"> 
                                                <tr>

                                                    <td>${n.id}</td>
                                                    <td>${n.title}</td>
                                                    <td><img width="150px;" height="150px;" src="../images/${n.image}" alt="package-place"> </td>
                                                    <td>
                                                        ${n.writeDate}
                                                    </td>

                                                    <td>
                                                        <a href="editNewsController?nid=${n.id}" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                                        <a href="deleteNews?nid=${n.id}" class="delete"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                    <div id="paggerBottom" class="col-12 pagger" style="margin-left: 40%;">

                                    </div>
                                    <script>
                                       
                                        createPaggerNews('paggerBottom',${requestScope.pageIndex}, 2,${requestScope.totalPage});
                                    </script> 
                                </div>
                            </div>        
                        </div>
                        <!-- Edit Modal HTML -->
                        <div id="addEmployeeModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="addNews" method="POST">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Add News</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">					
                                            <div class="form-group">
                                                <label>News ID</label>
                                                <input type="text" name="id" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>News Title</label>
                                                <input type="text" name="title" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>News desciption</label>
                                                <textarea class="form-control" name="descrip" required></textarea>
                                            </div>
                                            <div class="form-group">
                                                <label>News Image</label>
                                                <input type="text" name="img" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>News WriteDate</label>
                                                <input type="date" name="writeDate" class="form-control" required>
                                            </div>

                                        </div>
                                        <div class="modal-footer">
                                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                            <input type="submit" class="btn btn-success" value="Add">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- Edit Modal HTML -->

                        <!-- Delete Modal HTML -->
                        <div id="deleteEmployeeModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form >
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Delete Employee</h4>

                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">					
                                            <p>Are you sure you want to delete these Records?</p>
                                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                                        </div>
                                        <div class="modal-footer">
                                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                            <input type="submit" class="btn btn-danger" value="Delete">
                                        </div>
                                    </form>
                                </div>
                            </div>
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
