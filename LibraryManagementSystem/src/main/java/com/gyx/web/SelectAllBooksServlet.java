package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.service.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllBooksServlet")
public class SelectAllBooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用BookService完成查询
        BookService bookService=new BookService();
        List<Book> books = bookService.selectAllBooks();
        //2.将查询结果books保存到request域中
        request.setAttribute("books",books);
        //3.转发到ManageBook.jsp
        request.getRequestDispatcher("/ManageBook.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
