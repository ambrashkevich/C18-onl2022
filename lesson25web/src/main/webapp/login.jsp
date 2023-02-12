<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 01.02.2023
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Login form</title>
</head>
<%--<body>--%>
<%--<form method="post" action="login" accept-charset="UTF-8">--%>
<%--    Email id: <input type="text" name="email"><br>--%>
<%--    Password: <input type="password" name="pass"><br>--%>
<%--    <input type="submit" value="login">--%>
<%--</form>--%>
<%--</body>--%>
<div class="wrapper">
    <form class="form-signin" method="post" action="login" accept-charset="UTF-8">
        <h2 class="form-signin-heading">Please login</h2>
        <input type="text" class="form-control" name="email" placeholder="Email Address" required="" autofocus=""/>
        <input type="password" class="form-control" name="pass" placeholder="Password" required=""/>
        <label class="checkbox">
            <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
    </form>
</div>
</html>