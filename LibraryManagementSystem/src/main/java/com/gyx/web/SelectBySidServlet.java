package com.gyx.web;

import com.gyx.pojo.S_User;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectBySidServlet")
public class SelectBySidServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //获取StudentService对象
        StudentService studentService = new StudentService();
        //获取参数
        String sid = request.getParameter("sid");
        //调用方法
        S_User sUser = studentService.selectBySid(sid);
        //将结果保存到request域中
        request.setAttribute("sUser",sUser);
        //跳转到updateStudent.jsp
        request.getRequestDispatcher("updateStudent.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
