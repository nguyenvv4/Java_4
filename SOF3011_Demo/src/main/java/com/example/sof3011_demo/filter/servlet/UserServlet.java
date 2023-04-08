package com.example.sof3011_demo.filter.servlet;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.repository.KhachHangRepository;
import com.example.sof3011_demo.filter.entity.MauSac;
import com.example.sof3011_demo.filter.repository.MauSacRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private MauSacRepository mauSacRepository = new MauSacRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<MauSac> list = mauSacRepository.getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/view/mau-sac/hien-thi.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
