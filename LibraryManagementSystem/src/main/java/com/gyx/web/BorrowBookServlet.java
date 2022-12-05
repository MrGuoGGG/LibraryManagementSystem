package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.service.BookService;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/borrowBookServlet")
public class BorrowBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建BookService
        BookService bookService=new BookService();

        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");

        //调用方法
        List<Book> books = bookService.selectAllBooks();

        //将查询结果books保存到request域中
        request.setAttribute("books",books);

        //转发到borrowBook.jsp
        request.getRequestDispatcher("/borrowBook.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
