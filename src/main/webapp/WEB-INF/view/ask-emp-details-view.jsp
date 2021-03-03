<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: boss13
  Date: 01.03.2021
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask details</title>
<%--    <style>--%>
<%--        error {color: red}--%>
<%--    </style>--%>
</head>
<body>

<h2>Dear Employee, please enter your details</h2>
<br>
<br>

<form:form  action="showDetails" modelAttribute="employee" method="post">
    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: red"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname" cssStyle="color: red"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: red"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departmens}"/>

<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>


    </form:select>
    <br><br>
    Which car do you want
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi<form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    Mercedes-Benz<form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>

    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>

<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="Francias"/>--%>

    <br><br>
    PhoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber" cssStyle="color: red"/>

    <br><br>
    E-mail <form:input path="email"/>
    <form:errors path="email" cssStyle="color: red"/>

    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
