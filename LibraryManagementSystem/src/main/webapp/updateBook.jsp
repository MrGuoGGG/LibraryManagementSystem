<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更新书籍信息</title>
</head>
<body>
<form action="<c:url value="/updateBookServlet"/>" method="post">
  索书号：<input name="bid" value="${book.bid}"><br>
  书籍名称：<input name="bname" value="${book.bname}"><br>
  作者：<input name="bauthor" value=${book.bauthor}><br>
  语言：<input name="blanguage" value=${book.blanguage}><br>
  图书状态：<input name="bstatus" value=${book.bstatus}><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
