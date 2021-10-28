<%-- 
    Document   : NewsEdit
    Created on : Oct 26, 2021, 12:08:40 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>JSP Page</title>
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
                                <label>News Id</label>
                                <input value="${newsById.id}" type="text" class="form-control" readonly>
                            </div>
                            <div class="form-group">
                                <label>News Title</label>
                                <input value="${newsById.title}" type="email" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <img height="150px" width="200px" src="../images/${newsById.image}"/>
                               
                                <input style="margin-top: 10px;" value="${newsById.image}" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>News WriteDate</label>
                                <input value="${newsById.writeDate}" type="date" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>News Desciption</label>
                                <input value="${newsById.desciption}" type="text" class="form-control" required>
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
