<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/1
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员登录</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv">
    <form action="/managerLoginServlet" method="post" id="form">
        <h1 id="loginMsg">管理员登录</h1>
        <div id="errorMsg">${register_msg} ${login_msg}</div>
        <p>管理员ID:<input id="managerid" name="managerid" type="text" value="${mUser.mid}"></p>

        <p>管理员密码:<input id="managerpassword" name="managerpassword" type="password" value="${mUser.mpassword}"></p>

        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="managerRegister.jsp">没有账号？点击注册</a>
        </div>
    </form>
</div>
</body>
</html>
