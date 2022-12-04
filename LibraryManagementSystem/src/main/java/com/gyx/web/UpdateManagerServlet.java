package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.pojo.M_User;
import com.gyx.service.BookService;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateManagerServlet")
public class UpdateManagerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.调用ManagerService
        ManagerService managerService=new ManagerService();
        //2.接受表单提交的数据，并封装为M_User对象
        String mid = request.getParameter("mid");
        String mname = request.getParameter("mname");
        String mpassword = request.getParameter("mpassword");
        //封装对象
        M_User muser=new M_User();
        muser.setMid(mid);
        muser.setMname(mname);
        muser.setMpassword(mpassword);
        //测试
        System.out.println(muser);
        //3.完成修改操作
        managerService.updateMUser(muser);
        //4.转发到查询所有的servlet
        request.getRequestDispatcher("/selectAllMUserServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
