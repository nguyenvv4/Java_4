<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 29/03/2023
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>San Pham</title>
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
        <td>Ma</td>
        <td>Ten</td>
        <td>Gia Ban</td>
        <td>Action</td>
    </tr>
    </thead>
    <c:forEach items="${sanPhams}" var="sanPham">
        <tbody>
        <td>${sanPham.id}</td>
        <td>${sanPham.ma}</td>
        <td>${sanPham.ten}</td>
        <td>${sanPham.giaBan}</td>
        <td>
            <a href="/san-pham/add?product_id=${sanPham.id}">add to cart</a>
        </td>
        </tbody>
    </c:forEach>
</table>
<a href="/san-pham/cart"> Giỏ hàng</a>

</body>
</html>
