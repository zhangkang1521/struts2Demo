<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="/token/submit.action">
        <s:textfield name="username"></s:textfield>
        <s:token></s:token>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
