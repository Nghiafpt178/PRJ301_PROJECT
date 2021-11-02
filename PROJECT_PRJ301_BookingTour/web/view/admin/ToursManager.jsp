<%-- 
    Document   : ToursManager
    Created on : Oct 26, 2021, 11:46:37 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../assets/js/paggerTourManager.js" type="text/javascript"></script>
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
                                                    <h2>Manage <b>Tours</b></h2>
                                                </div>
                                                <div class="col-sm-6">
                                                    <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Tours</span></a>

                                                </div>
                                            </div>
                                        </div>
                                        <table class="table table-striped table-hover">
                                            <thead>
                                                <tr>                       
                                                    <th >Tour Code</th>
                                                    <th style="width: 200px;">Tour name</th>
                                                    <th style="width: 200px;">Image</th>
                                                    <th style="width: 200px;">Tour Info</th>

                                                    <th>Tour Type</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="t" items="${tours}"> 
                                                <tr>

                                                    <td>${t.tourCode}</td>
                                                    <td>${t.tourName}</td>
                                                    <td><img width="150px;" height="150px;" src="../images/${t.img}" alt="package-place"> </td>
                                                    <td>
                                                        *NumberGuests:${t.numberGuests}  
                                                        <br>
                                                        *Vehicle:${t.vehicle}
                                                        <br>
                                                        *Price: ${t.tourPrice}
                                                    </td>

                                                    <td>                                                                          
                                                        <select name="type">
                                                            <c:forEach var="tp" items="${toursType}">   
                                                                <option ${(tp.id == t.tourType)?"selected":""} value="${tp.id}">${tp.name}</option>  
                                                            </c:forEach>
                                                        </select>

                                                    </td>
                                                    <td>
                                                        <a href="editTours?tcode=${t.tourCode}" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>                                                                                                                                                                                               
                                                        <a href="deleteTourController?tourcode=${t.tourCode}"  class="delete" ><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a> 

                                                        

                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>

                                    <div id="paggerBottom" class="col-12 pagger" style="margin-left: 40%;">

                                    </div>
                                    <script>
                                        
                                        createPagger('paggerBottom',${requestScope.pageIndex}, 2,${requestScope.totalPage});
                                    </script> 

                                </div>
                            </div>        
                        </div>
                        <!-- Edit Modal HTML -->
                        <div id="addEmployeeModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="addToursController" method="POST">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Add Tours</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">					
                                            <div class="form-group">
                                                <label>Tour Code</label>
                                                <input type="text" name="code" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour name</label>
                                                <input type="text" name="name" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Image</label>
                                                <textarea class="form-control" name="img" required></textarea>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Price</label>
                                                <input type="number" name="price" class="form-control" required>
                                            </div>

                                            <div class="form-group">
                                                <label>Tour NumberGuests</label>
                                                <input type="text" name="numberGuests" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Check-in</label>
                                                <input type="date" name="checkin" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Check-out</label>
                                                <input type="date" name="checkout" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Duration</label>
                                                <input type="text" name="duration" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Vehicle</label>
                                                <input type="text" name="vehicle" class="form-control" required>
                                            </div>                       
                                            <div class="form-group">
                                                <label>Tour Description</label>
                                                <input type="text" name="descrip" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Schedule</label>
                                                <input type="text" name="schedule" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Type</label>                                                                       
                                                <select name="ttype">
                                                    <c:forEach var="t" items="${toursType}">  
                                                        <option value="${t.id}" >${t.name}</option>  
                                                    </c:forEach>
                                                </select>

                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <input type="submit" name="requestType" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                            <input type="submit" name="requestType" class="btn btn-success" value="Add">


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
                                    <form>
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
