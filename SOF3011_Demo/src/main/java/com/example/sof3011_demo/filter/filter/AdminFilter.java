package com.example.sof3011_demo.filter.filter;

import com.example.sof3011_demo.filter.entity.AccountRole;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

// Sau khi login add được role vào trong session bắt đầu chặn các request trỏ vào /admin
// để kiểm tra xem người dùng đó có quyền vào addmin hay không?
// chọn new - filterFile
@WebFilter("/admin")
public class AdminFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;

        // Lấy Role của Người đăng nhập
        HttpSession session = req.getSession();
        // Kiểm tra có phải role Admin
        if (session.getAttribute("role") == null) {
            response.getWriter().append("Bạn không có quyền admin");
        } else if (session.getAttribute("role") == AccountRole.ADMIN) {
            chain.doFilter(request, response); // đi tiếp
        } else { // Không đúng cho về
            response.getWriter().append("Bạn khong có quyền admin");
        }
    }
}
