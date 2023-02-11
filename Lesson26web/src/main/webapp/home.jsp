<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 11.02.2023
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
<div class="container">
    <h1>Navigate panel</h1>
    <div class="buttons-container">
        <a href="${pageContext.request.contextPath}/add">
            <button class="buttons">Add students</button>
        </a>
        <a href="${pageContext.request.contextPath}/students">
            <button class="buttons">Table students</button>
        </a>
    </div>
</div>
</body>
</html>
