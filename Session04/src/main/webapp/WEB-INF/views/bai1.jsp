<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/8/2026
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Bài 1</title>
    <style>
    </style>
</head>
<body>

<h1>Bài 1</h1>
<div class="container">
    <div class="card">
        <h2>Bài 1</h2>
        <div>
            ${orderMessage}
        </div>
        <br>
        <a href="<c:url value='/bai1/orders?action=orders'/>" class="btn">Xem chi tiết đơn hàng</a>
    </div>

</div>

</body>
</html>