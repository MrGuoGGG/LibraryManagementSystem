package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.pojo.M_User;
import com.gyx.service.BookService;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addMUserServlet")
public class AddMUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.调用ManagerService
        ManagerService managerService=new ManagerService();
        //2.接收参数
        String mid = request.getParameter("mid");
        String mname = request.getParameter("mname");
        String mpassword = request.getParameter("mpassword");
        //3.封装对象
        M_User mUser=new M_User();
        mUser.setMid(mid);
        mUser.setMname(mname);
        mUser.setMpassword(mpassword);
        //4.完成添加操作
        managerService.addMUser(mUser);
        //5.转发到查询所有的servlet
        request.getRequestDispatcher("/selectAllMUserServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
