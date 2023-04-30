<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login form example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="row">
        <%--    Put elements in the center of page
        offset-md-4 - смещение на 4 колонки вправо--%>
        <div class="col-md-8 offset-md-4">
            <h2>Login</h2>
            <p>Please, enter your credentials</p>
            <form method="post" action="${contextPath}/home" class="needs-validation" novalidate>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control w-25" id="username" placeholder="Enter username" name="username"
                           required>
                    <div class="invalid-feedback">Username should be entered!</div>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="text" class="form-control w-25" id="password" placeholder="Enter password" name="password"
                           required>
                    <div class="invalid-feedback">Password should be entered!</div>
                </div>
                <button id="loginBtn" type="submit" class="btn btn-primary">Login</button>
            </form>
        </div>
    </div>
</div>
<script>
  // Disable form submissions if there are invalid fields
  (function () {
    'use strict';
    window.addEventListener('load', function () {
      // Get the forms we want to add validation styles to
      var forms = document.getElementsByClassName('needs-validation');
      // Loop over them and prevent submission
      var validation = Array.prototype.filter.call(forms, function (form) {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }
          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  })();
  //Disable submit button if all fields are empty
  document.getElementById('loginBtn').disabled = true;
  document.getElementById('username').addEventListener('keyup', e => {
    //Check for the input's value
    document.getElementById('loginBtn').disabled = e.target.value === "";
  });
  document.getElementById('password').addEventListener('keyup', e => {
    //Check for the input's value
    if (e.target.value === "") {
      document.getElementById('loginBtn').disabled = true;
    } else {
      document.getElementById('loginBtn').disabled = false;
    }
  });
</script>
</body>
</html>