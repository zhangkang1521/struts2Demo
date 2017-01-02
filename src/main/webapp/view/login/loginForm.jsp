<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <s:property value="tip"></s:property>
    <s:form action="login.action">
        <s:textfield name="username" label="用户名"></s:textfield>
        <s:textfield name="password" label="密码" type="password"></s:textfield>
        <s:submit label="登录"></s:submit>
    </s:form>
</body>
</html>
