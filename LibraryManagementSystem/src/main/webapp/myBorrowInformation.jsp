<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/5
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>我的借书信息</title>
</head>
<body>
<input type="button" value="返回上一级" id="back">
<table border="1" cellspacing="0" width="80%" style="margin: auto">
  <tr>
    <th>索书号</th>
    <th>书名</th>
    <th>作者</th>
    <th>语言</th>
  </tr>

  <c:forEach items="${books}" var="book" varStatus="status">
    <tr align="center">
      <td>${book.bid}</td>
      <td>${book.bname}</td>
      <td>${book.bauthor}</td>
      <td>${book.blanguage}</td>
    </tr>
  </c:forEach>
</table>
<script>
  document.getElementById("back").onclick=function (){
    location.href="/borrowBookServlet";
  }
</script>
</body>
</html>
