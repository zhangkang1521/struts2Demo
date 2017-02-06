<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>convert</title>
</head>
<body>
<s:form action="test1" namespace="/convert" validate="true">
    <s:textfield name="username" label="username"></s:textfield>
    <s:textfield name="age" label="age"></s:textfield>
    <s:textfield name="birthday" label="birthday"></s:textfield>
    <%--<s:textfield name="user" label="user"></s:textfield>--%>
    <s:textfield name="user.userName" label="用户名"></s:textfield>
    <s:textfield name="user.password" label="密码"></s:textfield>
    <s:submit></s:submit>
</s:form>
</body>
</html>
