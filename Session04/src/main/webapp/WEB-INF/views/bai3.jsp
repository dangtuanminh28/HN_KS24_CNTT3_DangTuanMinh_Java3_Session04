<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/9/2026
  Time: 8:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bai3</title>
</head>
<body>
<div>
  <h2>Bài </h2>
  <div style="border: 1px solid white; padding: 20px;">
    <p>${message}</p>
    <p>Mã ID lấy từ URL là: ${orderId}</p>
  </div>
  <a href="<c:url value='/'/>">Quay lại trang chủ</a>
</div>
</body>
</html>
