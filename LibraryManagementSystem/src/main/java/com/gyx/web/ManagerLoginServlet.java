package com.gyx.web;

import com.gyx.pojo.M_User;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/managerLoginServlet")
public class ManagerLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建ManagerService
        ManagerService managerService=new ManagerService();

        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");

        //接收参数
        String mid = request.getParameter("managerid");
        String mpassword = request.getParameter("managerpassword");

        //测试
        System.out.println(mid);
        System.out.println(mpassword);

        //调用managerService进行查询
        M_User mUser = managerService.selectByMidAndMpassword(mid, mpassword);

        //测试
        System.out.println(mUser);

        //如果查询到的结果为空，则证明输入的管理员id或管理员密码错误
        if(mUser==null){

            //存储错误信息到request
            request.setAttribute("login_msg","用户名或密码错误");

            //跳转到managerlogin.jsp
            request.getRequestDispatcher("/managerLogin.jsp").forward(request,response);

        }else {

            //将登陆成功的mUser存储到request域中
            HttpSession session = request.getSession();
            session.setAttribute("mUser",mUser);

            //跳转到SelectAllBooksServlet
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/selectAllBooksServlet");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
