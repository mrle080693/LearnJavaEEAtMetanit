<%-- Директивы JSP (JSP Directive) --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.time.LocalDateTime" %>
<%@ page import="com.mrle.learnjavaeeatmetanit.servlet.FirstServlet" %>

<%-- Объявления JSP (JSP Declaration) --%>
<%!
    private int square(int input) {
        return input * input;
    }

    private double difference(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
%>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>First</title>
</head>
<body>
<h1>First JSP</h1>
<p>
    <%-- Выражения JSP (JSP Expression) --%>
    <%= square(3) %>
    <%= difference(3, 2) %>
</p>
<p>
    <%-- Скриплет JSP (JSP Scriplet) --%>
    <%
        for (int i = 0; i <= 3; i++) {
            square(2);
            difference(5, 3);
        }
    %>
</p>
<br>
</body>
</html>
