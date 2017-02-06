<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/test.s?action=upload" method="post" enctype="multipart/form-data">
    <input type="text" name="title">
    <input type="file" name="file1">
    <input type="submit" value="提交">
</form>
</body>
</html>
