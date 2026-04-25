<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <% 
            String user=(String)session.getAttribute("user");
            if(user==null){
                response.sendRedirect("login.html");
            }
        %>
        <h1>Hello Welcome To Home Page</h1>
        <a href="LogoutServlet">Logout</a>
    </body>
</html>
