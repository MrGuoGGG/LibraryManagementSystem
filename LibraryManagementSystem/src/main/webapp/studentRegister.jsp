<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/5
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>学生注册</title>
  <link href="css/register.css" rel="stylesheet">
</head>
<body>
<div class="form-div">
  <div class="reg-content">
    <h1>欢迎注册</h1>
    <span>已有管理员账号？</span> <a href="studentLogin.jsp">登录</a>
  </div>
  <form id="reg-form" action="/studentRegisterServlet" method="post">

    <table>
      <tr>
        <td>学号</td>
        <td class="inputs">
          <input name="sid" type="text" id="sid">
          <br>
        </td>

      </tr>

      <tr>
        <td>学生姓名</td>
        <td class="inputs">
          <input name="sname" type="text" id="sname">
          <br>
        </td>

      </tr>

      <tr>
        <td>学生密码</td>
        <td class="inputs">
          <input name="spassword" type="password" id="spassword">
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
