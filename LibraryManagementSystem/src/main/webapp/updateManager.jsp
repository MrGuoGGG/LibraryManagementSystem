<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更新管理员信息</title>
</head>
<body>
<form action="<c:url value="/updateManagerServlet"/>" method="post">
  工号：<input name="mid" value="${mUser.mid}"><br>
  管理员姓名：<input name="mname" value="${mUser.mname}"><br>
  管理员密码：<input name="mpassword" value=${mUser.mpassword}><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
