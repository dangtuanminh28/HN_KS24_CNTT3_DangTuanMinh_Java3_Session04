<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/9/2026
  Time: 8:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Bài 4</title>
<style>
  .result-box { border: 1px solid #333; padding: 20px; background-color: #f9f9f9; }
  .highlight { color: black; font-weight: bold; }
</style>
</head>
<body>
<h1>Bài 4</h1>
<div class="result-box">
  <p>Trạng thái: <span class="highlight">${msg}</span></p>
  <hr>
  <p>Danh mục đang xem: <span class="highlight">${cat}</span></p>
  <p>Số lượng hiển thị tối đa: <span class="highlight">${lim}</span> món ăn</p>
</div>
<br>
<a href="<c:url value='/'/>">Quay lại</a>
</body>
</html>
