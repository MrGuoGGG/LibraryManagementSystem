package com.gyx.web;

import com.gyx.pojo.S_User;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllSUserServlet")
public class SelectAllSUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取StudentService对象
        StudentService studentService = new StudentService();
        //调用studentService完成查询
        List<S_User> sUsers = studentService.selectAllSUser();
        //将查询结果sUser保存到request域中
        request.setAttribute("sUser",sUsers);
        //转发到manageSUser.jsp
        request.getRequestDispatcher("/manageSUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
