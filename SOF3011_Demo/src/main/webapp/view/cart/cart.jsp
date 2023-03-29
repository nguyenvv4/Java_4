<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Giỏ hàng</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body>
<h1>Giỏ hàng</h1>
<table class="table">
    <tr>
        <th>ID</th>
        <th>Sản phẩm</th>
        <th>Số lượng</th>
        <th>Giá Bán</th>
        <th>Thành Tiền</th>
    </tr>
    <c:forEach var="items" items="${cart.items}">
        <tr>
            <td>${items.productId}</td>
            <td>${items.productName}</td>
            <td>${items.quantity}</td>
            <td>${items.price}</td>
            <td>${items.quantity *items.price}</td>
        </tr>
    </c:forEach>
</table>
<a href="/san-pham/hien-thi">Tiếp tục mua hàng</a>
</body>
</html>