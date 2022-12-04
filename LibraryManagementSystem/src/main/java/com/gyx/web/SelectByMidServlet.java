package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.pojo.M_User;
import com.gyx.service.BookService;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectByMidServlet")
public class SelectByMidServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ManagerService managerService=new ManagerService();
        //处理POST请求中文乱码问题
        request.setCharacterEncoding("utf-8");
        //1.接收mid
        String mid = request.getParameter("mid");
        //2.调用service查询
        M_User mUser = managerService.selectByMid(mid);
        //测试
        System.out.println(mUser);
        //3.将mUser存储到request域中
        request.setAttribute("mUser",mUser);
        //4.转发到updateManager.jsp
        request.getRequestDispatcher("/updateManager.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
