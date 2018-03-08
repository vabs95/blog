<%--
  Created by IntelliJ IDEA.
  User: abhishek
  Date: 27/2/18
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%
        if(session.getAttribute("username")==null)
            response.sendRedirect("Login.html");

    %>
    <title>Login Successful</title>
</head>
<body>

<p>Welcome to Administrator Page</p>
<a href="Blog.jsp">Click here to create Blog</a>

</body>
</html>