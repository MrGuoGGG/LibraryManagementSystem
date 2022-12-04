package com.gyx.web;

import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteSUserServlet")
public class DeleteSUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取StudentService对象
        StudentService studentService=new StudentService();
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //接收参数
        String sid = request.getParameter("sid");
        //调用方法
        studentService.deleteSUser(sid);
        //跳转到selectAllSUserServlet
        request.getRequestDispatcher("/selectAllSUserServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
