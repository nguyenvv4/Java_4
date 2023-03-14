package com.example.sof3011_demo.fix.servlet;

import com.example.sof3011_demo.fix.entity.SinhVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SinhVienController", value = {"/sinh-vien/hien-thi",// GET
        "/sinh-vien/add", // POST
        "/sinh-vien/detail"})
public class SinhVienServlet extends HttpServlet {
    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienServlet() {
        list.add(new SinhVien(1, "Nguyen Van A", "Ha Noi", 1));
        list.add(new SinhVien(2, "Nguyen Van B", "Ha Noi", 0));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<SinhVien> list = hienthi();
        request.setAttribute("listSinhVien", list);
        request.getRequestDispatcher("/view/sinh-vien.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Integer status = Integer.parseInt(request.getParameter("status"));
        SinhVien sinhVien = new SinhVien(id, name, address, status);
        list.add(sinhVien);
        response.sendRedirect("/sinh-vien/hien-thi");
    }

    private ArrayList<SinhVien> hienthi() {
        return list;
    }

    private SinhVien detail(int id) {
        for (SinhVien sv : list) {
            if (id == sv.getId()) {
                return sv;
            }
        }
        return null;

    }
}
