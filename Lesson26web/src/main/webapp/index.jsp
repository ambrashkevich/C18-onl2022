<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Students</title>
    <link rel="stylesheet" href="">
</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:out value="${path}"/>
<div class="wrapper">
    <form method="post" action="${pageContext.request.contextPath}/add">
        <label for="fname">First name:</label><br>
        <input type="text" id="fname" name="fname"><br>
        <label for="lname">Last name:</label><br>
        <input type="text" id="lname" name="lname"><br>
        <label for="age">Age:</label><br>
        <input type="text" id="age" name="age"><br>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>