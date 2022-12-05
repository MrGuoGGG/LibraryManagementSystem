package com.gyx.web;

import com.gyx.pojo.M_User;
import com.gyx.pojo.S_User;
import com.gyx.service.ManagerService;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/studentRegisterServlet")
public class StudentRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.调用StudentService
        StudentService studentService=new StudentService();
        //2.接收参数
        String sid = request.getParameter("sid");
        String sname = request.getParameter("sname");
        String spassword = request.getParameter("spassword");
        //3.封装对象
        S_User sUser=new S_User();
        sUser.setSid(sid);
        sUser.setSname(sname);
        sUser.setSpassword(spassword);
        //4.完成添加操作
        studentService.addSUser(sUser);
        //5.将结果存储到request域中
        request.setAttribute("sUser",sUser);
        //6.转发到学生登录界面
        request.getRequestDispatcher("/studentLogin.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
