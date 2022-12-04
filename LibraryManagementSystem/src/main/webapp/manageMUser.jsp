<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员账户管理</title>
</head>
<body>
<input type="button" value="添加新管理员" id="addBook">
<input type="button" value="返回上一级" id="back">
<hr>
<table border="1" cellspacing="0" width="80%" style="margin: auto">
  <tr>
    <th>工号</th>
    <th>管理员姓名</th>
    <th>管理员密码</th>
  </tr>

  <c:forEach items="${musers}" var="muser" varStatus="status">
    <tr align="center">
      <td>${muser.mid}</td>
      <td>${muser.mname}</td>
      <td>${muser.mpassword}</td>
      <td><a href="/selectByMidServlet?mid=${muser.mid}">修改账户信息</a> <a href="/deleteMUserServlet?mid=${muser.mid}">删除该管理员</a> </td>
    </tr>
  </c:forEach>
</table>

<script>
  document.getElementById("addBook").onclick=function (){
    location.href="/addManager.jsp";
  }
</script>
<script>
  document.getElementById("back").onclick=function (){
    location.href="/selectAllBooksServlet";
  }
</script>
</body>
</html>
