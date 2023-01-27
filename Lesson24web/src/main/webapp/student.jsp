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

<% ArrayList users = (ArrayList) request.getAttribute("students"); %>
<tr>
    <td><%=(Student) users.get(0)%>
    </td>
</tr>

<c:forEach items="${list}" var="s">
    <tr align="center">
        <td>${s}</td>
        <td>${s.getFirstName()}</td>
        <td>${s.getLastName()}</td>
        <td>${s.getAge() }</td>
    </tr>
</c:forEach>
</body>
</html>
