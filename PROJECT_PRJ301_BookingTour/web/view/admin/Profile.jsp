<%-- 
    Document   : Profile
    Created on : Nov 3, 2021, 3:33:35 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>

        <hr>
        <div class="container bootstrap snippet">
            <div class="row">
                <div class="col-sm-10"><h1>${userAccount.username}</h1></div>
                
            </div>
            <div class="row">
                <div class="col-sm-3"><!--left col-->


                    <div class="text-center">
                        <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar">
                        <h6>${userAccount.username}</h6>
                       
                    </div></hr><br>




                    <ul class="list-group">
                        <li class="list-group-item text-muted">Role <i class="fa fa-dashboard fa-1x"></i></li>
                        <li class="list-group-item text-right"><span class="pull-left"><strong>${userAccount.group.gname}</strong></span></li>
                        
                    </ul> 


                </div><!--/col-3-->
                <div class="col-sm-9">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
                        
                    </ul>
                    

                    <div class="tab-content">
                        <div class="tab-pane active" id="home">
                           
                            <form class="form" action="profile" id="registrationForm">
                                <div class="form-group">
                                    <c:if test="${passcurrent != null}">
                                    <p class="text-danger">${mess}</p>
                                    </c:if>

                                    <div class="col-xs-12">
                                        <label for="first_name"><h4>Username</h4></label>
                                        <input type="text" class="form-control" name="first_name" id="first_name" value="${userAccount.username}" readonly >
                                    </div>
                                </div>
                                <div class="form-group">

                                   
                                </div>

                                <div class="form-group">

                                    <div class="col-xs-12">
                                        <label for="pass"><h4>Change password</h4></label>
                                        <input type="text" class="form-control" name="passcurrent" id="phone" placeholder="Password now" >
                                    </div>
                                </div>

           
                                <div class="form-group">

                                    <div class="col-xs-6">
                                        <label for="password"><h4>New Password</h4></label>
                                        <input type="password" class="form-control" name="newpass" id="password" placeholder="New password" >
                                    </div>
                                </div>
                                <div class="form-group">

                                    <div class="col-xs-6">
                                        <label for="password2"><h4>Verify</h4></label>
                                        <input type="password" class="form-control" name="repass" id="password2" placeholder="Re-enter new password" title="enter your password2.">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <br>
                                        <button class="btn btn-lg btn-success" type="submit"><i class="glyphicon glyphicon-ok-sign"></i> Save</button>
                                        <button class="btn btn-lg" type="reset"><i class="glyphicon glyphicon-repeat"></i> Reset</button>
                                    </div>
                                </div>
                            </form>

                            <hr>

                        </div><!--/tab-pane-->
                      

                    </div><!--/tab-pane-->
                </div><!--/tab-content-->

            </div><!--/col-9-->
        </div><!--/row-->

        <script>
            $(document).ready(function () {


                var readURL = function (input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            $('.avatar').attr('src', e.target.result);
                        }

                        reader.readAsDataURL(input.files[0]);
                    }
                }


                $(".file-upload").on('change', function () {
                    readURL(this);
                });
            });
        </script>
    </body>
</html>
