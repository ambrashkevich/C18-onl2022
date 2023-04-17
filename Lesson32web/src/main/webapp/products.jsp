<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Categories</title>
    <meta charset="utf-8">
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="products" value="${sessionScope.get('products')}"/>
<h2>Products</h2>

<div class="container-fluid">
    <c:if test="${not empty products}">
        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="card w-25 m-1" type="category">
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/category?name=${product.getName()}">${product.getName()}</a>
                        <img class="card-img" style="width:150px;height:120px"
                             src="${contextPath}/images/${product.getImageName()}" alt="Card image">
                        <h5>Description: </h5>
                        <p>${product.getDescription()}</p>
                        <h5>Price: ${product.getPrice()}$</h5>
                        <p><c:out value="${contextPath}"/></p>
                        <button name="product" value="${product.getId()}" type="submit" class="btn btn-primary">Add to Cart</button>
                        <button type="button" class="btn btn-successs">Buy Now</button>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</div>
</body>
</html>