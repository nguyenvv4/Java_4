package com.example.sof3011_demo.cart.repository;

import com.example.sof3011_demo.cart.entity.SanPham;
import com.example.sof3011_demo.db.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class SanPhamRepository {

    public ArrayList<SanPham> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("FROM SanPham ");
        ArrayList<SanPham> sanPhams = (ArrayList<SanPham>) query.getResultList();
        return sanPhams;
    }

    public SanPham getById(Integer id) {
        Session session = HibernateUtil.getFACTORY().openSession();
        SanPham sanPham = new SanPham();
        sanPham = session.get(SanPham.class, id);
        return sanPham;
    }
}
