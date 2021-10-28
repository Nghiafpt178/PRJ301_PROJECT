<%-- 
    Document   : Edit
    Created on : Oct 26, 2021, 12:23:07 AM
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
        <div id="editEmployeeModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Employee</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Tour Code</label>
                                <input value="${toursByCode.tourCode}" type="text" class="form-control" readonly>
                            </div>
                            <div class="form-group">
                                <label>Tour name</label>
                                <input value="${toursByCode.tourName}" type="email" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <img height="150px" width="200px" src="../images/${toursByCode.img}"/>
                               
                                <input style="margin-top: 10px;" value="${toursByCode.img}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tour Price</label>
                                <input value="${toursByCode.tourPrice}$" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tour Startdate</label>
                                <input value="${toursByCode.startDate}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>EndDate</label>
                                <input value="${toursByCode.endDate}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Duration</label>
                                <input value="${toursByCode.dateTime}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Vehicle</label>
                                <input value="${toursByCode.vehicle}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tour Description</label>
                                <input value="${toursByCode.description}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tour Schedule</label>
                                <input value="${toursByCode.schedule}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tour Status</label>
                                <input value="${toursByCode.status}" type="text" class="form-control" required>
                            </div>			
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
