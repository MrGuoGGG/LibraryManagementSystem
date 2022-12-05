package com.gyx.web;

import com.gyx.service.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myBorrowInformationServlet")
public class MyBorrowInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取BookService对象
        BookService bookService=new BookService();
        //调用方法查看自己的借书信息

        //将结果存到request域中

        //跳转到myBorrowInformation.jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
