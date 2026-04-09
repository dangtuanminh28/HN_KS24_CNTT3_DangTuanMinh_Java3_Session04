<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/9/2026
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 2</title>
</head>
<body>
<h2>Loại thực đơn: ${categoryName}</h2>
<p>${menuContent}</p>
<br>
<a href="<c:url value='/'/>">Quay lại</a>
</body>
</html>
