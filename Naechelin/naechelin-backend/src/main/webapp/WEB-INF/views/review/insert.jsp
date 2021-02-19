<%--
  Created by IntelliJ IDEA.
  User: jeongyeong-an
  Date: 2020/08/17
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form method="post" action="/review/1">
<input type="text" placeholder="prosandcons" id="reviewPac" name="reviewPac"/>
<input type="text" placeholder="rating" id="reviewRating" name="reviewRating"/>
<input type="text" placeholder="writer" id="writer" name="writer"/>
<button type="submit">제출</button>
</form>
</body>
</html>
