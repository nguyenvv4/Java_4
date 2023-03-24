package com.example.sof3011_demo.db.repository;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class KhachHangRepository {
    // thuc hien truy van

    Session session = HibernateUtil.getFACTORY().openSession();

    public ArrayList<KhachHang> getAll() {
        Query query = session.createQuery("FROM KhachHang");
        ArrayList<KhachHang> listKhachHang = (ArrayList<KhachHang>) query.getResultList();
        return listKhachHang;
    }
    

}
