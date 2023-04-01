<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Регистрация</title>
    <link rel="stylesheet" type="text/css" href="styles/style.css">
    <script type="text/javascript" src="scripts/script.js"></script>
</head>
<body>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="container">
    <form id="registrationForm" method="post" action="${pageContext.request.contextPath}/sign-up"
          onsubmit="return validateForm()">
        <div id="registrationLbl">
            <label>Регистрация</label>
        </div>
        <input id="name" type="text" placeholder="Имя" name="newUsrName" oninput="validateName()"><br/>
        <span id="nameError" style="display: none;">*Поле 'Имя' не заполнено!</span>
        <div id="brthDateLbl">
            <label>Дата рождения</label>
        </div>
        <select id="brthDays" name="brthDay">
            <c:forEach var="i" begin="1" end="31">
                <c:if test="${i > 0 && i <= 9}">
                    <option value="0${i}">0${i}</option>
                </c:if>
                <c:if test="${i > 9}">
                    <option value="${i}">${i}</option>
                </c:if>
            </c:forEach>
        </select>
        <select id="brthMonths" name="brthMonth">
            <c:forEach var="i" begin="1" end="12">
                <c:if test="${i > 0 && i <= 9}">
                    <option value="0${i}">0${i}</option>
                </c:if>
                <c:if test="${i > 9}">
                    <option value="${i}">${i}</option>
                </c:if>
            </c:forEach>
        </select>
        <select id="brthYears" name="brthYear" oninput="validateBrthday()">
            <c:forEach var="i" begin="1900" end="2018">
                <option value="${i}">${i}</option>
            </c:forEach>
        </select>
        <span id="brthErr" style="display: none;">*Возрастное ограничение: 16 лет и старше!</span>
        <input id="surname" type="text" placeholder="Фамилия" name="newUsrSurname" oninput="validateSurname()"><br/>
        <span id="surnameError" style="display: none;">*Поле 'Фамилия' не заполнено!</span>
        <input id="email" type="text" placeholder="Email" name="newUsrEmail" oninput="validateEmail()"><br/>
        <span id="emailError" style="display: none;">*Поле 'Email' не заполнено!</span>
        <span id="validationErr" style="display: none;">*Неверный формат email адреса!</span>
        <input id="password" type="text" placeholder="Пароль" name="newUsrPass" oninput="validatePass()"><br/>
        <span id="passwordError" style="display: none;">*Поле 'Пароль' не заполнено!</span>
        <input id="repeatPswd" type="text" placeholder="Повторите пароль" name="repeatPass"
               oninput="validateRepeatPass()"><br/>
        <span id="repeatPassError" style="display: none;">*Поле 'Повторите пароль' не заполнено!</span>
        <span id="matchingError" style="display: none;">*Пароли не совпадают!</span>
        <div id="lower">
            <button id="regFormSignUpBtn" type="submit">Зарегистрироваться</button>
            <br/>
        </div>
    </form>
</div>
</body>
</html>