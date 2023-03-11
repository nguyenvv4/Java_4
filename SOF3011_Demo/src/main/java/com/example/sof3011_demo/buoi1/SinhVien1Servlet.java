package com.example.sof3011_demo.buoi1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SinhVien1Servlet", value = "/SinhVien1Servlet")
public class SinhVien1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien(1, "Nguyen Van A", 1, "Ha Noi"));
        listSinhVien.add(new SinhVien(2, "Nguyen Thi B", 0, "Thai Nguyen"));
        request.setAttribute("listSinhVien",listSinhVien);
        request.getRequestDispatcher("/view/SinhVien.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
