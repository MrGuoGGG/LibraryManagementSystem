package com.gyx.web;

import com.gyx.service.BookService;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteMUserServlet")
public class DeleteMUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagerService managerService=new ManagerService();
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.接收mid
        String mid = request.getParameter("mid");
        //2.调用service删除
        managerService.deleteMUser(mid);
        //3.转发到selectAllBooksServlet
        request.getRequestDispatcher("/selectAllMUserServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
