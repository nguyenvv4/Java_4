package com.example.sof3011_demo.join.repository;

import com.example.sof3011_demo.db.util.HibernateUtil;
import com.example.sof3011_demo.join.entity.ChiTietSP;
import com.example.sof3011_demo.join.entity.SanPham1;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class SanPhamRepository {

    public ArrayList<SanPham1> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("FROM SanPham1 ");
        ArrayList<SanPham1> sanPhams = (ArrayList<SanPham1>) query.getResultList();
        return sanPhams;
    }

    public SanPham1 getById(Integer id) {
        Session session = HibernateUtil.getFACTORY().openSession();
        SanPham1 sanPham = new SanPham1();
        sanPham = session.get(SanPham1.class, id);
        return sanPham;
    }

    public static void main(String[] args) {
        ArrayList<SanPham1> list = new SanPhamRepository().getList();
        for (SanPham1 sp : list) {
            System.out.println(sp.getTen() + " - " + sp.getListChiTietSanPham().size());
        }
    }
}
