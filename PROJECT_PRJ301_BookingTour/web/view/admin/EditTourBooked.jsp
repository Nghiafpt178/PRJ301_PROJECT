<%-- 
    Document   : EditTourBooked
    Created on : Nov 1, 2021, 12:47:51 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <form action="editTourBooked" method="POST">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Tour Booked</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Tour Booked ID</label>
                                <br>
                                ${toursBooked.bTourId} <input type="hidden" name="bid" value="${toursBooked.bTourId}" />
                            </div>
                            <div class="form-group">
                                <label>Customer info</label>  
                                <br>
                                Full name: ${toursBooked.fullname}
                                <br>
                                Phone: ${toursBooked.phone}
                                <br>
                                Email: ${toursBooked.email}
                                <br>
                                Address: ${toursBooked.address}
                                <br>
                                Require: ${toursBooked.require}
                            </div>
                            <hr>
                            <div class="form-group">
                                <label>Tour Info</label>
                                Tour name: ${toursBooked.tour.tourName}
                                <br>
                                Tour price: ${toursBooked.tour.tourPrice}
                                <br>
                                Check-in: ${toursBooked.tour.startDate}
                                <br>
                                Check-out: ${toursBooked.tour.endDate}
                                <br>
                                NumberGuests: ${toursBooked.tour.numberGuests}
                            </div>
                            <div class="form-group">
                                <select style="height: 40px; background: #2cdbb5" name="sid">
                                    <c:forEach var="bs" items="${bTours_Status}">
                                        <option value="${bs.id}">${bs.status_name}</option>   
                                    </c:forEach>
                                </select>  
                            </div>

                        </div>
                        <div class="modal-footer">
                            <input type="submit" name="requestType" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" name="requestType" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
