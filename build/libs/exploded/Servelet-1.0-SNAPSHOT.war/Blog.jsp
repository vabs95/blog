<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%
        if(session.getAttribute("username")==null)
            response.sendRedirect("Login.html");

    %>

    <title>Blog</title>
</head>
<body>

<form name="frm1" action="Blog2" method="post">
    <table align="center">
        <tr>
            <td>Blog Id</td>
            <td><input type="text" name="blog_id" placeholder="Blog Id" required></td>
        </tr>

        <tr>
            <td>Content</td>
            <td><textarea rows="10" cols="32" name="blogcontent" required></textarea></td>
        </tr>

        <tr>
            <td><input type="submit" name="blog_submit" value="Save"></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>
