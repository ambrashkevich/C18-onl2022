<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 11.04.2023
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cabinet</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="styles/cabinet.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
                <a class="nav-link" href="cart.jsp">Cart</a>
                <a class="nav-link" href="cabinet.jsp">Profile</a>
            </div>
        </div>
    </div>

</nav>
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
</body>
</html>
