<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/4
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改读者账户信息</title>
</head>
<body>
<form action="<c:url value="/updateStudentServlet"/>" method="post">
    学号：<input name="sid" value="${sUser.sid}"><br>
    学生姓名：<input name="sname" value="${sUser.sname}"><br>
    学生密码：<input name="spassword" value=${sUser.spassword}><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
