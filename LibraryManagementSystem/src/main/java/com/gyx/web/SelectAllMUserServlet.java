package com.gyx.web;

import com.gyx.pojo.Book;
import com.gyx.pojo.M_User;
import com.gyx.service.BookService;
import com.gyx.service.ManagerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllMUserServlet")
public class SelectAllMUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用ManagerService完成查询
        ManagerService managerService = new ManagerService();
        List<M_User> musers = managerService.selectAllMUsers();
        //测试
        System.out.println(musers);
        //2.将查询结果mUsers保存到request域中
        request.setAttribute("musers", musers);
        //3.转发到manageMUser.jsp
        request.getRequestDispatcher("/manageMUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
