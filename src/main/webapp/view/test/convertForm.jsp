<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>convert</title>
</head>
<body>
<s:form action="/convert/test1.action">
    <s:textfield name="age" label="age"></s:textfield>
    <s:textfield name="birthday" label="birthday"></s:textfield>
    <%--<s:textfield name="user" label="user"></s:textfield>--%>
    <s:submit></s:submit>
</s:form>
</body>
</html>
