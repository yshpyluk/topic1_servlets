<%--
  Created by IntelliJ IDEA.
  User: yshpyluk
  Date: 3/18/17
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String triggerGame = request.getAttribute("triggerGame").toString();
%>
    <h2>Game progress:</h2>
    <p><%= triggerGame%></p>
</body>
</html>
