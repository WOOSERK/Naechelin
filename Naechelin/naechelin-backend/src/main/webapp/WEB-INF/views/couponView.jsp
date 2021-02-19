<%@ page import="cf.naechelin.vo.CouponVO" %>
<%@ page import="java.io.ByteArrayOutputStream" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.util.Base64" %>
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
<%
    CouponVO coupon = (CouponVO)request.getAttribute("line");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(coupon.getQR(), "jpg", baos);
    baos.flush();
    byte[] imageInByteArray = baos.toByteArray();
    baos.close();
    String b64 = Base64.getEncoder().encodeToString(imageInByteArray);
%>
<img src="data:image/jpg;base64, <%=b64%>" alt="Image not found"/>
</body>
</html>