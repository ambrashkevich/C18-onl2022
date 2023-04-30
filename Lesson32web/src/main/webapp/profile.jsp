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
<br>
<h3 class="text-center">Добро пожаловать, <b class="font-italic">${username.getName()}</b>!</h3>
<p class="text-center">Ваш пароль: <b class="font-italic">${username.getPassword()}</b></p>
<button onclick="window.location.href = 'logout';" class="buttonQuit">
    <i class="fa fa-sign-out fa-lg" aria-hidden="true"></i> Выйти
</button>
</body>
</html>
