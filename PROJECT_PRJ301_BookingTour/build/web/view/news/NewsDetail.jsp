<%-- 
    Document   : NewsDetail
    Created on : Oct 23, 2021, 9:34:17 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="../link/LinkHead.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="../home/Header.jsp"></jsp:include>
            <div class="container">
                <h1>${news.title}</h1>
            <image src="${news.image}"/>
            <p>
                ${news.desciption}
            </p>
        </div>
        <jsp:include page="../home/Footer.jsp"></jsp:include>

    </body>
</html>
