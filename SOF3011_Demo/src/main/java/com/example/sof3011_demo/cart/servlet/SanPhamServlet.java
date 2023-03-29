package com.example.sof3011_demo.cart.servlet;

import com.example.sof3011_demo.cart.entity.Cart;
import com.example.sof3011_demo.cart.entity.CartItem;
import com.example.sof3011_demo.cart.entity.SanPham;
import com.example.sof3011_demo.cart.repository.SanPhamRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SanPhamServlet", value = {
        "/san-pham/hien-thi",
        "/san-pham/add",
        "/san-pham/cart",
})
public class SanPhamServlet extends HttpServlet {
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            ArrayList<SanPham> list = sanPhamRepository.getList();
            request.setAttribute("sanPhams", list);
            request.getRequestDispatcher("/view/cart/san-pham.jsp").forward(request, response);
        } else if (uri.contains("cart")) {
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");
            request.setAttribute("cart", cart);
            request.getRequestDispatcher("/view/cart/cart.jsp").forward(request, response);

        } else if (uri.contains("add")) {
            String productId = request.getParameter("product_id");
            SanPham sanPham = sanPhamRepository.getById(Integer.parseInt(productId));

            // Tạo đối tượng CartItem
            CartItem item = new CartItem();
            item.setProductId(Integer.parseInt(productId));
            item.setProductName(sanPham.getTen());
            item.setPrice(sanPham.getGiaBan());

            // Lấy giỏ hàng từ session
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");

            // Nếu giỏ hàng chưa được tạo, tạo mới nó
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }

            // Thêm sản phẩm vào giỏ hàng
            cart.addItem(item);

            // Chuyển hướng người dùng đến trang giỏ hàng
            response.sendRedirect("/san-pham/hien-thi");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
