<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.8.3.min.js"></script>
</head>
<body>
<s:form id="form1">
    <s:textfield name="username"></s:textfield>
    <s:token></s:token>
</s:form>
<button onclick="submit()">submit</button>
<script>
    function submit() {
        $.ajax({
            url: '/ajaxToken/submit.action',
            data: $("#form1").serialize(),
            success: function (data) {
                console.log(data);
            }
        });
    }
</script>
</body>
</html>
