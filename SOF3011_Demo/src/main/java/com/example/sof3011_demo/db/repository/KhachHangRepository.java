package com.example.sof3011_demo.db.repository;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class KhachHangRepository {
    // thuc hien truy van

    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from KhachHang ");
            listKhachHang = (ArrayList<KhachHang>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKhachHang;

    }

    public static void main(String[] args) {
        ArrayList<KhachHang> list = new KhachHangRepository().getAll();
        for (KhachHang kh : list) {
            System.out.println(kh.toString());
        }
    }

}
