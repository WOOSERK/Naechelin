<%--
  Created by IntelliJ IDEA.
  User: jeongyeong-an
  Date: 2020/08/17
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% %>
<html>
<head>
    <title>Title</title>
    <script src="resources/jquery-3.5.0.min.js"></script>
    <script>
        $(document).ready(function () {

        })
    </script>
</head>
<body>
<c:forEach var="list" items="${list}">
    ${list.storeId} :  ${list.reviewPac} :  ${list.reviewRating} <input type="button" id="delete${list.storeId}" value="삭제" param-value="${list}" /><br>
</c:forEach>
</body>
</html>
