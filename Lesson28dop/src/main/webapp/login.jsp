<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="login.css">
    <title>Задача 13</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

</head>
<body>
<section class="container">
    <span class="border">
    <form>
<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link" href="#">Вход</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Регистрация</a>
  </li>
</ul>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Адрес электронной почты</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
        <div class="box">
            <ul>
          <label>Быстро, бесплатно и <br> надёжно!</label>
          <li><i class="fa fa-check"></i>Вносите изменения в <br> бронирование</li>
          <li><i class="fa fa-check"></i>Настраивайте рассылку <br> предложений</li>
        <li><i class="fa fa-check"></i>Выигрывайте время</li>
                </ul>
            </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Пароль</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="*******">
        </div>


        <div class="progress">
            <div class="progress-bar w-75" role="progressbar" aria-valuenow="75" aria-valuemin="0"
                 aria-valuemax="100"></div>
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Я хочу получать рассылку с <br> Эксклюзивными
                предложениями</label>
        </div>
        <div>
        <button type="button" class="btn btn-primary">Создать мой профиль</button>
        </div>
        <div class="upd">
        <label>Создавая аккаунт, вы соглашаетесь с нашими <u>Правилами и условиями</u> и <u> Положением о конфиденциальности</u></label>
        </div>
    </form>
      </span>

</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>