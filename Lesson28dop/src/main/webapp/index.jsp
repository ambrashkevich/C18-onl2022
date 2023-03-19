<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Задача 13</title>
</head>
<body>
<h1>Запись на курсы</h1>
<p>
<hr>
</p>
<div>
    <form action="#" method="post">
        <p>
            <label for="name">Имя</label> <br/>
            <input type="text" id="name" name="name" placeholder="Алексей">
        </p>
        <p>
        <div><label>Язык программирования:</label></div>
        <div><input type="checkbox" name="language" value="C++"><label for="language">C++</label></div>
        <div><input type="checkbox" name="language" value="PHP"><label for="language">PHP</label></div>
        <div><input type="checkbox" name="language" value="Python"><label for="language">Python</label></div>
        </p>
        <p>
        <div><label for="info">Дополнительная информация:</label></div>
        <div><textarea id="info" cols="30" rows="3">Есть опыт программирования на C++</textarea></div>
        </p>
        <p>
        <div><label for="secret">Секретно слово:</label></div>
        <div><input type="password" id="secret"></div>
        </p>
        <p>
            <input type="reset" value="Очистить">
            <input type="submit" value="Принять">
        </p>
    </form>
</div>
</body>
</html>