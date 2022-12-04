package com.gyx.web;

import com.gyx.pojo.M_User;
import com.gyx.pojo.S_User;
import com.gyx.service.ManagerService;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.获取StudentService对象
        StudentService studentService=new StudentService();
        //2.接受表单提交的数据，并封装为S_User对象
        String sid = request.getParameter("sid");
        String sname = request.getParameter("sname");
        String spassword = request.getParameter("spassword");
        //封装对象
        S_User sUser=new S_User();
        sUser.setSid(sid);
        sUser.setSname(sname);
        sUser.setSpassword(spassword);
        //测试
        System.out.println(sUser);
        //3.调用方法完成修改操作
        studentService.updateSUser(sUser);
        //4.转发到查询所有的servlet
        request.getRequestDispatcher("/selectAllSUserServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
