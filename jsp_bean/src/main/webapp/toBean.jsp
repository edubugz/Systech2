<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/23/2018
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>beans</title>
</head>
<body>

<% String name=  %>

<jsp:useBean id="s1" class="com.edwin.beans.student" scope="session" type="com.edwin.beans.student">
</jsp:useBean>

<%String userName = request.getParameter("name"); %>
<jsp:setProperty name="s1" property="name" param=""


</body>
</html>
