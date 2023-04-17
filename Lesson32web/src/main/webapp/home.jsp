<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Categories</title>
    <meta charset="utf-8">
</head>
<body>
<jsp:include page="header.jsp"/>
<jsp:include page="libs.jsp"/>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="categories" value="${sessionScope.get('categories')}"/>
<h2>Popular categories</h2>

<div class="container-fluid">
    <c:if test="${not empty categories}">
        <div class="row">
            <c:forEach items="${categories}" var="category">
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