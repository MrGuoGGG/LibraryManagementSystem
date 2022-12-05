package com.gyx.web;

import com.gyx.service.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateBookStatus2Servlet")
public class UpdateBookStatus2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService=new BookService();
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.接收bid
        String bid = request.getParameter("bid");
        //2.调用service修改status状态
        bookService.returnBook(bid);
        //3.转发到borrowBookServlet
        request.getRequestDispatcher("/borrowBookServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
