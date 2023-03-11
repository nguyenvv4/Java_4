<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 11/03/2023
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <td>id</td>
        <td>Ho ten</td>
        <td>Giới Tính</td>
        <td>Dia Chi</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sinhVien">
    <tr>
        <td>${sinhVien.id}</td>
        <td>${sinhVien.hoTen}</td>
        <td>${sinhVien.gioiTinh}</td>
        <td>${sinhVien.diaChi}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
