<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/4
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新读者</title>
</head>
<body>
<h3>添加新读者</h3>
<form action="/addSUserServlet" method="post">
  学号：<input name="sid"><br>
  学生姓名：<input name="sname"><br>
  学生密码：<input name="spassword"><br>
  <input type="submit" value="提交">
</body>
</html>
