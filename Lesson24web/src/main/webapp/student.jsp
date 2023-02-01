<%@ page import="by.tms.model.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 27.01.2023
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="crud" class="by.tms.utils.CRUDUtils" scope="request"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    <c:forEach items="${sessionScope.students}" var="s">
        <tr align="center">
            <td>${s.id}</td>
            <td>${s.firstName}</td>
            <td>${s.lastName}</td>
            <td>${s.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
