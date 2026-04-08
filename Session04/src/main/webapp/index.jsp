<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Session04" %></h1>
<br/>
<a href="bai1/orders">Bài 1</a>
<p><b>Bài 2:</b>
  <br>
  <a href="<c:url value='/bai2/menu?category=man'/>">Thực đơn Mặn</a> |
  <a href="<c:url value='/bai2/menu'/>"> Thực đơn mặc định</a>
</p>
<br>
<h2>Bài 3</h2>
<a href="<c:url value='/bai3/orders/5'/>">Xem đơn hàng số 5</a> |
<a href="<c:url value='/bai3/orders/99'/>">Xem đơn hàng số 99</a>

<div>
  <h2>Bài 4</h2>
  <a href="<c:url value='/bai4/products?category=Man&limit=15'/>">Test limit = 15</a>
  <br>
  <a href="<c:url value='/bai4/products?category=Chay&limit=abc'/>">Test limit = abc</a>
</div>
</body>
</html>