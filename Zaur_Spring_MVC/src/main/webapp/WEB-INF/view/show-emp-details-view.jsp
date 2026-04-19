<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 05.05.2023
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<!--Эта строка HTML-кода является директивой страницы JSP, которая указывает контент-тип (MIME-тип) и кодировку
символов для текущей JSP-страницы, а также язык программирования, на котором написана страница (в данном случае - Java).
#Здесь contentType="text/html;charset=UTF-8" указывает на тип контента, который будет отправлен на клиент
(в данном случае, текстовые документы в формате HTML с использованием кодировки UTF-8), а language="java" указывает,
что JSP-страница будет написана на языке программирования Java.-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Employee details</title>
</head>
<body>
<h2>Dear Employee, your are WELCOME!!!</h2>
<br>
<br>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<%--<ul> в HTML-коде является тегом для создания неупорядоченного списка. Тег <ul> обычно используется вместе с тегом
<li>, который обозначает отдельный элемент списка List item.--%>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}
<br>
<button onclick="history.back()">Back</button>
</body>
</html>
