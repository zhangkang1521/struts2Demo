<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>自定义主题</title>
</head>
<body>
<div>
    <s:select list="{'a', 'b', 'c'}" theme="beauty">
    </s:select>
</div>
<div>
    <s:select list="{'A', 'B', 'C'}" theme="xhtml">
    </s:select>
</div>
</body>
</html>
