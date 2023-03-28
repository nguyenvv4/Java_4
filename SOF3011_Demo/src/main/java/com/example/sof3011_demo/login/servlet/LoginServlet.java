package com.example.sof3011_demo.login.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy tên người dùng và mật khẩu từ request parameter
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra tên người dùng và mật khẩu
        if (username.equals("admin") && password.equals("admin")) {
            // Tạo HttpSession và lưu tên người dùng vào session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            System.out.println(session.getAttribute("username"));

            // Chuyển hướng đến trang chủ
            response.sendRedirect("view/khach-hang/hien-thi.jsp");
        } else {
            // Nếu tên người dùng hoặc mật khẩu không đúng, hiển thị thông báo lỗi
            request.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
            request.getRequestDispatcher("view/login/login.jsp").forward(request, response);
        }
    }
}
