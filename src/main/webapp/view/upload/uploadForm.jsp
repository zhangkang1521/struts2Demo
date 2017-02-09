<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>upload form</title>
</head>
<body>
<s:actionerror></s:actionerror>
<s:form action="upload" enctype="multipart/form-data">
    <s:textfield label="标题" name="title"></s:textfield>
    <s:file name="file1" label="文件1"></s:file>
    <s:submit value="上传"></s:submit>
</s:form>
</body>
</html>
