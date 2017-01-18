<html>
<head>
    <title>servlet集成freemarker</title>
</head>
<body>
    <div>hello,${key}</div>
    <ul>
        <#list nameList as name>
            <li>${name}</li>
        </#list>
    </ul>

</body>
</html>