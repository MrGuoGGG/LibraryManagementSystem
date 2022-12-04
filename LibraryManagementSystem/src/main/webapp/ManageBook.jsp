<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>图书管理</title>
</head>
<body>
  <h1>尊敬的管理员：${mUser.mname},欢迎您</h1>
  <input type="button" value="添加书籍" id="addBook">
  <input type="button" value="管理员账户管理" id="manageManager">
  <input type="button" value="读者信息管理" id="manageReader">
<%--  <input type="button" value="我的" id="myInformation">--%>
  <input type="button" value="退出登录" id="quit">
  <hr>
  <table border="1" cellspacing="0" width="80%" style="margin: auto">
    <tr>
      <th>索书号</th>
      <th>书名</th>
      <th>作者</th>
      <th>语言</th>
      <th>状态</th>
    </tr>

      <c:forEach items="${books}" var="book" varStatus="status">
        <tr align="center">
          <td>${book.bid}</td>
          <td>${book.bname}</td>
          <td>${book.bauthor}</td>
          <td>${book.blanguage}</td>
          <td>${book.bstatus}</td>
          <td><a href="/selectByBidServlet?bid=${book.bid}">修改信息</a> <a href="/deleteBookServlet?bid=${book.bid}">删除该书</a> </td>
        </tr>
    </c:forEach>
  </table>

  <script>
    document.getElementById("addBook").onclick=function (){
      location.href="/addBook.jsp";
    }
  </script>
  <script>
    document.getElementById("manageManager").onclick=function (){
      location.href="/selectAllMUserServlet";
    }
  </script>
  <script>
    document.getElementById("manageReader").onclick=function (){
      location.href="/selectAllSUserServlet";
    }
  </script>
  <script>
    document.getElementById("quit").onclick=function (){
      location.href="/managerLogin.jsp";
    }
  </script>
<%--  <script>--%>
<%--    document.getElementById("myInformation").onclick=function (){--%>
<%--      location.href="/selectMyManagerInformationServlet";--%>
<%--    }--%>
<%--  </script>--%>
</body>
</html>
