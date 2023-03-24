package com.example.sof3011_demo.db.servlet;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.repository.KhachHangRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "KhachHangServlet", value = {
        "/khach-hang/hien-thi",
        "/khach-hang/add",
        "/khach-hang/detail",
        "/khach-hang/update"
})
public class KhachHangServlet extends HttpServlet {

    private KhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<KhachHang> listKhachHang = khachHangRepository.getAll();
        request.setAttribute("listKhachHang", listKhachHang);
        request.getRequestDispatcher("/view/khach-hang/hien-thi.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
