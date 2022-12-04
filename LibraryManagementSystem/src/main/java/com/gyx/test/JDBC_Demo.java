package com.gyx.test;

import com.gyx.pojo.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Demo {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("org.postgresql.Driver");

        //2.获取连接
        String url="jdbc:postgresql://123.249.71.167:26000/demo";
        String username="joe";
        String password="Bigdata@123";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("数据库连接成功!");

        //3.定义sql
        String sql="select * from books";

        //4.获取sql执行对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.执行sql
        ResultSet resultSet = preparedStatement.executeQuery();

        //6.创建集合
        List<Book> list=new ArrayList<>();

        //7.显示结果
        while (resultSet.next()){
            Book book = new Book();
            String bid=resultSet.getString("bid");
            String bname=resultSet.getString("bname");
            String bauthor = resultSet.getString("bauthor");
            String blanguage = resultSet.getString("blanguage");
            String bstatus = resultSet.getString("bstatus");
            book.setBid(bid);
            book.setBname(bname);
            book.setBauthor(bauthor);
            book.setBlanguage(blanguage);
            book.setBstatus(bstatus);
            list.add(book);
        }
        System.out.println(list);

        //8.释放资源
        connection.close();
    }
}
