<%--
  Created by IntelliJ IDEA.
  User: Алексей
  Date: 28.02.2020
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fourth</title>
</head>
<body>
<p>Name: <%= request.getParameter("name") %>
</p>
<p>Age: <%= request.getParameter("age") %>
</p>
</body>
</html>
