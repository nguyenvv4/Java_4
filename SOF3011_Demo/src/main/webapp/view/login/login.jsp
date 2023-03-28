<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
<h1>Đăng nhập</h1>
<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<p style="color: red;"><%= error %>
</p>
<% } %>
<form action="/login" method="POST">
    <label>Tên đăng nhập:</label>
    <input type="text" name="username"/>
    <br/>
    <label>Mật khẩu:</label>
    <input type="password" name="password"/>
    <br/>
    <input type="submit" value="Đăng nhập"/>
</form>
</body>
</html>
