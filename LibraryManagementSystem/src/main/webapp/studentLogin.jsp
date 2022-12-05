<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/5
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生登录</title>
    <link href="css/login.css" rel="stylesheet">
</head>
<body>
<div id="loginDiv">
    <form action="/studentLoginServlet" method="post" id="form">
        <h1 id="loginMsg">学生登录</h1>
        <div id="errorMsg">${register_msg} ${login_msg}</div>
        <p>学号:<input id="studentid" name="studentid" type="text" value="${sUser.sid}"></p>

        <p>密码:<input id="studentpassword" name="studentpassword" type="password" value="${sUser.spassword}"></p>

        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="studentRegister.jsp">没有账号？点击注册</a>
        </div>
    </form>
</div>
</body>
</html>
