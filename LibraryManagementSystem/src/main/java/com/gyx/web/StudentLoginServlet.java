package com.gyx.web;

import com.gyx.pojo.M_User;
import com.gyx.pojo.S_User;
import com.gyx.service.ManagerService;
import com.gyx.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/studentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建StudentService
        StudentService studentService = new StudentService();

        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");

        //接收参数
        String sid = request.getParameter("studentid");
        String spassword = request.getParameter("studentpassword");

        //测试
        System.out.println(sid);
        System.out.println(spassword);

        //调用studentService进行查询
        S_User sUser = studentService.selectBySidAndSpassword(sid, spassword);

        //测试
        System.out.println(sUser);

        //如果查询到的结果为空，则证明输入的学号或学生密码错误
        if (sUser == null) {

            //存储错误信息到request
            request.setAttribute("login_msg", "用户名或密码错误");

            //跳转到studentlogin.jsp
            request.getRequestDispatcher("/studentLogin.jsp").forward(request, response);

        } else {

            //将登陆成功的sUser存储到request域中
            HttpSession session = request.getSession();
            session.setAttribute("sUser", sUser);

            //跳转到borrowBookServlet
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/borrowBookServlet");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}


