<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
    <meta charset="utf-8">
    <jsp:include page="header.jsp"/>
    <jsp:include page="libs.jsp"/>
</head>
<body>
<section class="h-100" style="background-color: #eee;">
    <div class="container h-100 py-5">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-10">

                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h3 class="fw-normal mb-0 text-black">Shopping Cart</h3>
                    <div>
                        <p class="mb-0"><span class="text-muted">Sort by:</span> <a href="#!" class="text-body">price <i
                                class="fas fa-angle-down mt-1"></i></a></p>
                    </div>
                </div>
                <div class="card rounded-3 mb-4">
                    <c:forEach items="${sessionScope.products}" var="product">
                        <div class="card-body p-4">
                            <div class="row d-flex justify-content-between align-items-center">
                                <div class="col-md-2 col-lg-2 col-xl-2">
                                    <img class="card-img" style="width:150px;height:120px"
                                         src="${contextPath}/images/${product.getImageName()}" alt="Card image">
                                </div>

                                <div class="col-md-3 col-lg-3 col-xl-3">
                                    <p class="lead fw-normal mb-2">${product.getName()}</p>
                                    <p><span class="text-muted">Category:${product.getCategoryName()} </span></p>
                                </div>
                                <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                                    <button class="btn btn-link px-2"
                                            onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
                                        <i class="fas fa-minus"></i>
                                    </button>

                                    <input id="form1" min="0" name="quantity" value="2" type="number"
                                           class="form-control form-control-sm"/>

                                    <button class="btn btn-link px-2"
                                            onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
                                        <i class="fas fa-plus"></i>
                                    </button>
                                </div>
                                <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                                    <h5 class="mb-0">${product.getPrice()}$</h5>
                                </div>
                                <div class="col-md-1 col-lg-1 col-xl-1 text-end">
                                    <a href="#!" class="text-danger"><i class="fas fa-trash fa-lg"></i></a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <div class="card mb-4">
                    <div class="card-body p-4 d-flex flex-row">
                        <div class="form-outline flex-fill">
                            <input type="text" id="form1" class="form-control form-control-lg"/>
                            <label class="form-label" for="form1">Discound code</label>
                        </div>
                        <button type="button" class="btn btn-outline-warning btn-lg ms-3">Apply</button>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">
                        <button type="button" class="btn btn-warning btn-block btn-lg">Proceed to Pay</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
