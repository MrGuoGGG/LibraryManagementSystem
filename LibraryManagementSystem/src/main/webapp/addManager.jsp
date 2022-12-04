<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新管理员</title>
</head>
<body>
<h3>添加新管理员</h3>
<form action="/addMUserServlet" method="post">
  工号：<input name="mid"><br>
  管理员姓名：<input name="mname"><br>
  管理员密码：<input name="mpassword"><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
