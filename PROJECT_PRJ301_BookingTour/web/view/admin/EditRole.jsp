<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : EditRole
    Created on : Nov 6, 2021, 12:43:29 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>

        <form class="form-horizontal" action="editRole" method="POST">
            <fieldset>

                <!-- Form Name -->
                <legend>Edit User Role</legend>


                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="rolename">User Role Name</label>  
                    <div class="col-md-4">
                        <h4 style="color: red">${allFeatures.g.gname}</h4>
                        <input id="rolename" name="roleId" type="hidden" value="${allFeatures.g.gid}" class="form-control input-md" readonly>

                    </div>
                </div>

                <!-- Multiple Checkboxes -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="permissions">Role Permissions</label>
                    <div class="col-md-4">
                        <c:forEach var="f" items="${features}">
                            <div class="checkbox">
                                <label for="permissions-0">
                                    <input type="checkbox" 
                                           <c:forEach items="${allFeatures.g.features}" var="gf">
                                               ${(gf.id == f.id)?"checked=\"checked\"":"" }
                                           </c:forEach>
                                           name="permissions" value="${f.id}" id="permissions-0" value="1">
                                    ${f.name}
                                </label>
                            </div>
                        </c:forEach>


                    </div>
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="savebutton"></label>
                    <div class="col-md-4">
                        <button id="savebutton" name="savebutton" class="btn btn-success">Save</button>
                    </div>
                </div>

            </fieldset>
        </form>

    </body>
</html>
