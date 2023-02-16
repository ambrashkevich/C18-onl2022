<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Categories</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
                <a class="nav-link active" aria-current="page" href="#">Главная</a>
                <a class="nav-link" href="#">Пользователь</a>
                <a class="nav-link" href="#">Корзина</a>
            </div>
        </div>
    </div>
</nav>
</div>
</nav>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="categories" value="${sessionScope.get('categories')}"/>
<h2>Popular categories</h2>
<c:out value="${sessionScope.get('categories')}"/>

<div class="container-fluid">
    <c:if test="${not empty categories}">
        <div class="row">
            <c:forEach items="${categories}" var="category">
                <%-- w-25 настройка определяет ширину карты (25% от ширины родительского элемента, т.е. строки)
                Больше информации вот здесь https://getbootstrap.com/docs/4.1/utilities/sizing/
                m-1 означает внешинй отступ (margin) со всех 4 сторон.
                Измеряется специальной переменной $spacer, значение по умолчанию у которой
                равно 1rem (16px в большинстве браузеров).
                1 = $spacer * .25 = 16 * 0.25 = 4px--%>
                <div class="card w-25 m-1" type="category">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/category?name=${category.getName()}">${category.getName()}</a>
                        <img class="card-img" style="width:150px;height:120px"
                             src="${contextPath}/images/${category.getImageName()}" alt="Card image">

                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</div>
</body>
</html>