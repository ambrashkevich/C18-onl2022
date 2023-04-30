<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <title>product</title>
    <jsp:include page="libs.jsp"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<br>
<h2>Product</h2><br>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:if test="${not empty oneProduct}">
    <div class="container-fluid">
        <h2 class="text-center">${oneProduct.getName()}</h2><br>
        <img class="mx-auto d-block" style="height:auto; max-width: 400px;"
             src="${contextPath}/images/${oneProduct.getImageName()}"
             alt="${oneProduct.getImageName()}">
        <br>
        <div class="container">
            <h2>Информация о продукте:</h2>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th class="text-center" style="vertical-align: middle">Описание</th>
                    <th class="text-center" style="vertical-align: middle">Цена, руб.</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${oneProduct.getDescription()}</td>
                    <td class="text-center" style="vertical-align: middle">${oneProduct.getPrice()}</td>
                </tr>
                </tbody>
            </table>
        </div>
        <br>
        <form method="post" action="${pageContext.request.contextPath}/cart">
            <input type="hidden" value="${oneProduct.getId()}" name="id"/>
            <input type="hidden" value="${oneProduct.getImageName()}" name="imageName"/>
            <input type="hidden" value="${oneProduct.getName()}" name="name"/>
            <input type="hidden" value="${oneProduct.getDescription()}" name="description"/>
            <input type="hidden" value="${oneProduct.getPrice()}" name="price"/>
            <input type="hidden" value="${oneProduct.getCategoryId()}" name="categoryId"/>
            <button type="submit" value="Купить" name="action" class="buttonAddProduct"><i
                    class="fa fa-cart-plus fa-lg"></i> Купить
            </button>
            <br>
        </form>
    </div>
</c:if>

</body>
</html>