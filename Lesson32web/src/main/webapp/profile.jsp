<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Cabinet</title>
    <meta charset="utf-8">
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
    <link rel="stylesheet" href="styles/profile.css">
</head>
<body>
<h1>Привет, ${sessionScope.name} </h1>
<hr>
<div class="container">
    <div class="row">
        <div class="col">
            <h2>Name: ${sessionScope.name}</h2>
        </div>
        <div class="col">
            <h2>Surname: ${sessionScope.surname}</h2>
        </div>
        <div class="col">
            <h2>Date of Birth: ${sessionScope.brthday}</h2>
        </div>
        <div class="col">
            <h2>Email: ${sessionScope.email}</h2>
        </div>
    </div>
</div>
<hr>
<h2>История заказов</h2>
<hr>
</body>
</html>
