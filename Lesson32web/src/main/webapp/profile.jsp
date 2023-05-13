<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Cabinet</title>
    <meta charset="utf-8">
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
    <link rel="stylesheet" href="styles/profile.css">
</head>
<body>
<br>
<h3 class="text-center">Добро пожаловать, <b class="font-italic">${username.getName()}</b>!</h3>
<p class="text-center">Ваш пароль: <b class="font-italic">${username.getPassword()}</b></p>
<h3 class="text-center">История заказов:</h3>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:if test="${not empty myProducts}">
    <c:forEach items="${myProducts}" var="myProduct">
        <div class="container-fluid">
            <div class="row">
                <div class="col" style="background-color:white;height: auto;max-width: 200px">
                    <img src="${contextPath}/images/${myProduct.getImageName()}"
                         alt="${myProduct.getImageName()}" class="mx-auto d-block"
                         style="max-height: 100px;width: auto">
                </div>
            </div>
            <div class="col" style="background-color:white;">
                <p><b class="font-italic">Модель:</b> ${myProduct.getName()}</p>
                    <%--                <p><b class="font-italic">Описание:</b> ${myProduct.getDescription()}</p>--%>
                <p><b class="font-italic">Цена:</b> ${myProduct.getPrice()} руб.</p>
                <form method="post" accept-charset="UTF-8" action="${pageContext.request.contextPath}/eshop?command=cart-post">
                    <input type="hidden" value="${myProduct.getId()}" name="id"/>
                    <input type="hidden" value="${myProduct.getImageName()}" name="imageName"/>
                    <input type="hidden" value="${myProduct.getName()}" name="name"/>
                    <input type="hidden" value="${myProduct.getDescription()}" name="description"/>
                    <input type="hidden" value="${myProduct.getPrice()}" name="price"/>
                    <input type="hidden" value="${myProduct.getCategoryId()}" name="categoryId"/>
                </form>
            </div>
        </div>
    </c:forEach>
</c:if>
<button onclick="window.location.href = '<c:url value="/eshop?command=logout"/>';" class="buttonQuit">
    <i class="fa fa-sign-out fa-lg" aria-hidden="true"></i> Выйти
</button>
</body>
</html>