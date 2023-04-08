package com.example.sof3011_demo.filter.servlet;

import com.example.sof3011_demo.filter.entity.Account;
import com.example.sof3011_demo.filter.repository.UserRepository;
import com.example.sof3011_demo.filter.service.AuthenticationService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/login")
public class ServletLogin extends HttpServlet {

    private AuthenticationService authenticate = new AuthenticationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/mau-sac/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Gọi Service để xác thực thông tin
        Account account = authenticate
                .authenticate(username, password);
        if (account == null) { // Không hợp lệ
            response.getWriter().append("Not Allowed");
        } else { // Hợp lệ sẽ lưu thông tin vào session phục vụ cho việc filter
            HttpSession session = request.getSession();
            session.setAttribute("username", account.getUsername());
            session.setAttribute("role", account.getRole());

            //đăng nhập thành công mở trang user . Cả user lẫn admin đều được vào trang user
            response.sendRedirect("/user");
        }
    }
}
