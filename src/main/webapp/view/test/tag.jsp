<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="/my-tags" %>
<html>
<head>
    <title>test tag</title>
</head>
<body>
<!-- http://www.runoob.com/jsp/jsp-custom-tags.html -->
<my:hello></my:hello>
<my:loop counts="3">
    <p>hello</p>
</my:loop>
<my:display type="aa">body </my:display> end!
</body>
</html>
