<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/4
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生账号管理</title>
</head>
<body>
<input type="button" value="添加新读者" id="addSUser">
<input type="button" value="返回上一级" id="back">
<hr>
<table border="1" cellspacing="0" width="80%" style="margin: auto">
  <tr>
    <th>学号</th>
    <th>学生姓名</th>
    <th>学生密码</th>
  </tr>

  <c:forEach items="${sUser}" var="suser" varStatus="status">
    <tr align="center">
      <td>${suser.sid}</td>
      <td>${suser.sname}</td>
      <td>${suser.spassword}</td>
      <td><a href="/selectBySidServlet?sid=${suser.sid}">修改读者账户信息</a> <a href="/deleteSUserServlet?sid=${suser.sid}">删除该读者账号</a> </td>
    </tr>
  </c:forEach>
</table>

<script>
  document.getElementById("addSUser").onclick=function (){
    location.href="/addStudent.jsp";
  }
</script>
<script>
  document.getElementById("back").onclick=function (){
    location.href="/selectAllBooksServlet";
  }
</script>
</body>
</html>
