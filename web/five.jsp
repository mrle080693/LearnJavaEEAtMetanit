<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Алексей
  Date: 28.02.2020
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Five</title>
</head>
<body>
<%-- EL --%>
<%-- EL ищет в контекстах и если что то не взлетело перечитай контексты --%>
<p>Name: ${name}</p>
<p>Age: ${age}</p>

<%-- JSTL --%>
<c:forEach var="user" items="${users}">
    <p>${user}</p>
</c:forEach>
</body>
</html>
