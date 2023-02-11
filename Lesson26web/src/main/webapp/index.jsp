<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
    <style>* {
        margin: 0;
        box-sizing: border-box;
        padding: 0;
        font-family: 'Barlow', sans-serif;
    }

    body {
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background-image: url('/img/wallpaperflare.com_wallpaper.jpg');
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
    }

    .container {
        color: #fff;
        margin: 40px auto;
        background-color: rgba(255, 255, 255, 0.06);
        border: 1px solid rgba(255, 255, 255, 0.1);
        border-radius: 15px;
        padding: 32px;
        backdrop-filter: blur(10px);
        height: 390px;
        width: 300px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        flex-direction: column;
        gap: 10px;
    }

    .buttons {
        display: inline-block;
        text-decoration: none;
        border-radius: 15px;
        background-color: rgba(255, 255, 255, 0.1);
        border: 1px solid rgba(255, 255, 255, 0.1);
        backdrop-filter: blur(30px);
        color: rgba(255, 255, 255, 0.8);
        font-size: 14px;
        letter-spacing: 2px;
        cursor: pointer;
        text-transform: uppercase;
        outline: none;
        margin: 5px;
        padding: 10px;
    }

    .buttons:hover {
        border-color: #ffffff;
    }

    input {
        width: 100%;
        padding: 10px;
        outline: none;
        border: none;
        font-size: 15px;
        border-radius: 4px;
        background: #0000002b;
        color: white;
        transition: all 0.2s ease;
    }

    label {
        color: rgba(255, 255, 255, 0.8);
        font-size: 20px;
    }

    .container-form {
        display: flex;
        justify-content: space-between;
        align-items: center;
        flex-direction: column;
        gap: 15px;

    }</style>
</head>
<body>
<div class="container">
    <form class="container-form" method="post" action="${pageContext.request.contextPath}/add">
        <div>
            <label for="fname">First name</label><br>
            <input type="text" id="fname" name="fname"><br>
        </div>
        <div><label for="lname">Last name</label><br>
            <input type="text" id="lname" name="lname"><br>
        </div>
        <div>
            <label for="age">Age</label><br>
            <input type="text" id="age" name="age"><br>
        </div>
        <button type="submit" class="buttons">Submit</button>
    </form>
    <a href="${pageContext.request.contextPath}/home">
        <button class="buttons">Back</button>
    </a>
</div>
</body>
</html>