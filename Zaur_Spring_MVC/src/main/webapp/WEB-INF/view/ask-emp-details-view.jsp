<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee details request..</title>
</head>
<body>
<h2>Dear Employee, Pls. enter your details</h2>
<br>
<br>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name.."/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>
<%--@elvariable id="employee" type=""--%>
<form:form action="showDetails" modelAttribute="employee" method="post">
    Name <form:input path="name"/> <!--GET name-->
    <form:errors path="name"/> <!--выдает message ошибки если поле менее 2..256 символов-->
    <br><br>
    Surname <form:input path="surname"/> <!--GET surname-->
    <form:errors path="surname"/> <!--валидация на mandatory field-->
    <br><br>
    Salary <form:input path="salary"/> <!--GET salary-->
    <form:errors path="salary"/> <!--валидация на mandatory field и min и max значения-->
    <br><br>
    Department <form:select path="department">
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Humar Resources" label="HR"/>--%>
    <%--    <form:option value="Sales department" label="SALES"/>--%>
    <form:options items="${employee.departmentsList}"/>
</form:select>
    <br><br>
    Which car do you want?
    <%--    Tesla <form:radiobutton path="carBrand" value="Tesla"/>--%>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    Mercedes <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <%--    Toyota <form:radiobutton path="carBrand" value="Toyota"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrandsList}"/>
    <br><br>
    Foreign language(s)
    <%--    EN <form:checkbox path="languages" value="English"/>--%>
    <%--    RU <form:checkbox path="languages" value="Russian"/>--%>
    <%--    DE <form:checkbox path="languages" value="Deutsch"/>--%>
    <%--    FR <form:checkbox path="languages" value="French"/>--%>
    <%--    ES <form:checkbox path="languages" value="Spanish"/>--%>
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>
    Phone number:
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email:
    <form:input path="email"/>
    <form:errors path="email"/>
    <input type="submit" value="OK"/> <!--тут срабатывают сеттеры-->
    <br>
</form:form>
<button onclick="history.back()">Back</button>

</body>

</html>