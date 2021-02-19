<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script>
        $(document).ready(function () {
            //jQuery 는 여기에..
        })
    </script>
</head>
<body>
<form:form modelAttribute="lineCommand">
    <form:input type="number" path="storeFirst"/>
    <form:input type="number" path="storeSecond"/>
    <form:input type="number" path="storeThird"/>
    <button type="submit">제출</button>
</form:form>
</body>
</html>