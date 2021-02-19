<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script>
        $(document).ready(function ()
        {
            //jQuery 는 여기에..
            $('.btnDelete').bindClickDelete();
        })
    </script>
</head>
<body>
<c:forEach var="lineVO" items="${lineList}">
    <div>
        <span>
                <a href="line/${lineVO.lineId}">${lineVO}</a>
        </span>
        <span>
            <form:form action="line/${lineVO.lineId}" method="DELETE">
                <button type="submit">삭제</button>
            </form:form>
        </span>
    </div>
</c:forEach>

<button onclick="location.href='line/add'">라인 등록</button>

</body>
</html>