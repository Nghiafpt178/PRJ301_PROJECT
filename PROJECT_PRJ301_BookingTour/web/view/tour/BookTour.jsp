<%-- 
    Document   : BookTour
    Created on : Oct 16, 2021, 12:48:26 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>
        <link href="../assets/css/bookTour.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
        <jsp:include page="../home/Header.jsp"></jsp:include>

            <div id="booking" class="section">
                <div class="section-center">
                    <div class="container">
                        <div class="row">
                            <div class="booking-form">
                                <div class="form-header">
                                    <h1>Make your reservation</h1>
                                </div>
                                <form action="booktour" method="POST">
                                    <div class="form-group"> <input class="form-control" required name="name" type="text" placeholder="Your name.."> <span class="form-label">Destination</span> </div>                                                           
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group"> <input required class="form-control" name="address" type="text" placeholder="Enter your address"> <span class="form-label">Email</span> </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group"> <input required class="form-control" name="phone" type="text" placeholder="Enter you Phone"> <span class="form-label">Phone</span> </div>
                                        </div>
                                    </div>
                                    <div class="form-group"> <input required="" class="form-control" name="email" type="text" placeholder="Your email.."> <span class="form-label">Destination</span> </div>
                                    <div class="form-group"> <input required="" class="form-control" name="note" type="text" placeholder="Note.."> <span class="form-label">Destination</span> </div>
                                    <div class="form-btn"> <button class="submit-btn">Book Now</button> </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            
        <jsp:include page="../home/Footer.jsp"></jsp:include>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
