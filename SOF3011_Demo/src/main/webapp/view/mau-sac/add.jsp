<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 08/04/2023
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
            crossorigin="anonymous"
    />
</head>
<body>
<p>Day la trang admin</p>
<form action="#" method="post">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">id</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="id"><br>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Ma</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="ma"><br>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Ten</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="ten"><br>
        </div>
    </div>
   
    <button type="submit">Them</button>
</form>
<table class="table">
    <tr>
        <td>ID</td>
        <td>Ma</td>
        <td>Ten</td>
    </tr>

    <tbody>
    <c:forEach var="mau" items="${list}">
        <tr>
            <td>${mau.id}</td>
            <td>${mau.ma}</td>
            <td>${mau.ten}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
