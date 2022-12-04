<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/4
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员注册</title>
    <link href="css/register.css" rel="stylesheet">
</head>
<body>
<div class="form-div">
    <div class="reg-content">
        <h1>欢迎注册</h1>
        <span>已有管理员账号？</span> <a href="managerLogin.jsp">登录</a>
    </div>
    <form id="reg-form" action="/managerRegisterServlet" method="post">

        <table>
            <tr>
                <td>管理员ID</td>
                <td class="inputs">
                    <input name="mid" type="text" id="mid">
                    <br>
                </td>

            </tr>

            <tr>
                <td>管理员姓名</td>
                <td class="inputs">
                    <input name="mname" type="text" id="mname">
                    <br>
                </td>

            </tr>

            <tr>
                <td>管理员密码</td>
                <td class="inputs">
                    <input name="mpassword" type="password" id="mpassword">
                    <br>
                </td>
            </tr>
        </table>

        <div class="buttons">
            <input value="注 册" type="submit" id="reg_btn">
        </div>
        <br class="clear">
    </form>
</div>
</body>
</html>
