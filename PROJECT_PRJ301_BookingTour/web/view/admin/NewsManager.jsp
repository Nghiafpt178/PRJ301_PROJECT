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

                        <style>
                            body {
                                color: #566787;
                                background: #f5f5f5;
                                font-family: 'Varela Round', sans-serif;
                                font-size: 13px;
                            }
                            .table-responsive {
                                margin: 30px 0;
                            }
                            .table-wrapper {
                                background: #fff;
                                padding: 20px 25px;
                                border-radius: 3px;
                                min-width: 1000px;
                                box-shadow: 0 1px 1px rgba(0,0,0,.05);
                            }
                            .table-title {        
                                padding-bottom: 15px;
                                background: #435d7d;
                                color: #fff;
                                padding: 16px 30px;
                                min-width: 100%;
                                margin: -20px -25px 10px;
                                border-radius: 3px 3px 0 0;
                            }
                            .table-title h2 {
                                margin: 5px 0 0;
                                font-size: 24px;
                            }
                            .table-title .btn-group {
                                float: right;
                            }
                            .table-title .btn {
                                color: #fff;
                                float: right;
                                font-size: 13px;
                                border: none;
                                min-width: 50px;
                                border-radius: 2px;
                                border: none;
                                outline: none !important;
                                margin-left: 10px;
                            }
                            .table-title .btn i {
                                float: left;
                                font-size: 21px;
                                margin-right: 5px;
                            }
                            .table-title .btn span {
                                float: left;
                                margin-top: 2px;
                            }
                            table.table tr th, table.table tr td {
                                border-color: #e9e9e9;
                                padding: 12px 15px;
                                vertical-align: middle;
                            }
                            table.table tr th:first-child {
                                width: 60px;
                            }
                            table.table tr th:last-child {
                                width: 100px;
                            }
                            table.table-striped tbody tr:nth-of-type(odd) {
                                background-color: #fcfcfc;
                            }
                            table.table-striped.table-hover tbody tr:hover {
                                background: #f5f5f5;
                            }
                            table.table th i {
                                font-size: 13px;
                                margin: 0 5px;
                                cursor: pointer;
                            }	
                            table.table td:last-child i {
                                opacity: 0.9;
                                font-size: 22px;
                                margin: 0 5px;
                            }
                            table.table td a {
                                font-weight: bold;
                                color: #566787;
                                display: inline-block;
                                text-decoration: none;
                                outline: none !important;
                            }
                            table.table td a:hover {
                                color: #2196F3;
                            }
                            table.table td a.edit {
                                color: #FFC107;
                            }
                            table.table td a.delete {
                                color: #F44336;
                            }
                            table.table td i {
                                font-size: 19px;
                            }
                            table.table .avatar {
                                border-radius: 50%;
                                vertical-align: middle;
                                margin-right: 10px;
                            }
                            .pagination {
                                float: right;
                                margin: 0 0 5px;
                            }
                            .pagination li a {
                                border: none;
                                font-size: 13px;
                                min-width: 30px;
                                min-height: 30px;
                                color: #999;
                                margin: 0 2px;
                                line-height: 30px;
                                border-radius: 2px !important;
                                text-align: center;
                                padding: 0 6px;
                            }
                            .pagination li a:hover {
                                color: #666;
                            }	
                            .pagination li.active a, .pagination li.active a.page-link {
                                background: #03A9F4;
                            }
                            .pagination li.active a:hover {        
                                background: #0397d6;
                            }
                            .pagination li.disabled i {
                                color: #ccc;
                            }
                            .pagination li i {
                                font-size: 16px;
                                padding-top: 6px
                            }
                            .hint-text {
                                float: left;
                                margin-top: 10px;
                                font-size: 13px;
                            }    
                            /* Custom checkbox */
                            .custom-checkbox {
                                position: relative;
                            }
                            .custom-checkbox input[type="checkbox"] {    
                                opacity: 0;
                                position: absolute;
                                margin: 5px 0 0 3px;
                                z-index: 9;
                            }
                            .custom-checkbox label:before{
                                width: 18px;
                                height: 18px;
                            }
                            .custom-checkbox label:before {
                                content: '';
                                margin-right: 10px;
                                display: inline-block;
                                vertical-align: text-top;
                                background: white;
                                border: 1px solid #bbb;
                                border-radius: 2px;
                                box-sizing: border-box;
                                z-index: 2;
                            }
                            .custom-checkbox input[type="checkbox"]:checked + label:after {
                                content: '';
                                position: absolute;
                                left: 6px;
                                top: 3px;
                                width: 6px;
                                height: 11px;
                                border: solid #000;
                                border-width: 0 3px 3px 0;
                                transform: inherit;
                                z-index: 3;
                                transform: rotateZ(45deg);
                            }
                            .custom-checkbox input[type="checkbox"]:checked + label:before {
                                border-color: #03A9F4;
                                background: #03A9F4;
                            }
                            .custom-checkbox input[type="checkbox"]:checked + label:after {
                                border-color: #fff;
                            }
                            .custom-checkbox input[type="checkbox"]:disabled + label:before {
                                color: #b8b8b8;
                                cursor: auto;
                                box-shadow: none;
                                background: #ddd;
                            }
                            /* Modal styles */
                            .modal .modal-dialog {
                                max-width: 400px;
                            }
                            .modal .modal-header, .modal .modal-body, .modal .modal-footer {
                                padding: 20px 30px;
                            }
                            .modal .modal-content {
                                border-radius: 3px;
                                font-size: 14px;
                            }
                            .modal .modal-footer {
                                background: #ecf0f1;
                                border-radius: 0 0 3px 3px;
                            }
                            .modal .modal-title {
                                display: inline-block;
                            }
                            .modal .form-control {
                                border-radius: 2px;
                                box-shadow: none;
                                border-color: #dddddd;
                            }
                            .modal textarea.form-control {
                                resize: vertical;
                            }
                            .modal .btn {
                                border-radius: 2px;
                                min-width: 100px;
                            }	
                            .modal form label {
                                font-weight: normal;
                            }	
                        </style>
                        <script>
                            $(document).ready(function () {
                                // Activate tooltip
                                $('[data-toggle="tooltip"]').tooltip();

                                // Select/Deselect checkboxes
                                var checkbox = $('table tbody input[type="checkbox"]');
                                $("#selectAll").click(function () {
                                    if (this.checked) {
                                        checkbox.each(function () {
                                            this.checked = true;
                                        });
                                    } else {
                                        checkbox.each(function () {
                                            this.checked = false;
                                        });
                                    }
                                });
                                checkbox.click(function () {
                                    if (!this.checked) {
                                        $("#selectAll").prop("checked", false);
                                    }
                                });
                            });
                        </script>


                        <div class="container-xl" style="margin-left: 250px;">
                            <div class="table-responsive">
                                <div class="table-wrapper">
                                    <div class="table-title">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <h2>Manage <b>News</b></h2>
                                            </div>
                                            <div class="col-sm-6">
                                                <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></a>
                                                <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
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
                                                        <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
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
                        <!-- Edit Modal HTML -->
                        <div id="addEmployeeModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form>
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Add Employee</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">					
                                            <div class="form-group">
                                                <label>Tour Code</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour name</label>
                                                <input type="email" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Image</label>
                                                <textarea class="form-control" required></textarea>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour info</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Description</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Schedule</label>
                                                <input type="text" class="form-control" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Tour Status</label>
                                                <input type="text" class="form-control" required>
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
