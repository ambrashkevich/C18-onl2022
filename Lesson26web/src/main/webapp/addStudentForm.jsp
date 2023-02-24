<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/general.css">
</head>
<body>
<div class="containers">
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