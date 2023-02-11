<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/add.css">
    <title>Login form</title>
</head>
<div class="container">
    <form class="container-form" method="post" action="login" accept-charset="UTF-8">
        <h2 class="form-signin-heading">Please login</h2>
        <input type="text" class="form-control" name="email" placeholder="Email Address" required="" autofocus=""/>
        <input type="password" class="form-control" name="pass" placeholder="Password" required=""/>
        <button class="buttons" type="submit">Login</button>
    </form>

</div>
</html>