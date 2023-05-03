<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <title>Product</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="libs.jsp"/>
<br>
<h2>${nameCategory}</h2><br>
<div class="container-fluid">
    <c:if test="${not empty products}">
    <c:forEach items="${products}" var="product">
    <div class="row">
        <div class="col-lg-1" style="background-color:white;">
            <a href="${contextPath}/product?productId=${product.getId()}">
                <img src="${contextPath}/images/${product.getImageName()}" style="width:550px;height:500px"
                     alt="${product.getImageName()}" class="responsive"></a></div>
        <div class="col" style="background-color:white;">
            <p><b class="font-italic">Модель:</b> ${product.getName()}</p>
            <p><b class="font-italic">Описание:</b> ${product.getDescription()}</p>
            <p><b class="font-italic">Цена:</b> ${product.getPrice()} руб.</p>
        </div>
        </c:forEach>
        </c:if>
    </div>
</body>
</html>