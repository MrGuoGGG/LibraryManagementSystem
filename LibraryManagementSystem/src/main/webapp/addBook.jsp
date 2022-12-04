<%--
  Created by IntelliJ IDEA.
  User: 16040
  Date: 2022/12/3
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新书</title>
</head>
<body>
<h3>添加新书</h3>
<form action="/addBookServlet" method="post">
    索书号：<input name="bid"><br>
    书籍名称：<input name="bname"><br>
    作者：<input name="bauthor"><br>
    语言：<input name="blanguage"><br>
    图书状态：<input name="bstatus"><br>
    <input type="submit" value="提交">
    <input type="button" value="返回上一级" id="back">
</form>
<script>
    document.getElementById("back").onclick=function (){
        location.href="/selectAllBooksServlet";
    }
</script>
</body>
</html>
