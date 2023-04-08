package com.example.sof3011_demo.filter.repository;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.util.HibernateUtil;
import com.example.sof3011_demo.filter.entity.MauSac;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class MauSacRepository {

    public ArrayList<MauSac> getAll() {
        ArrayList<MauSac> list = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from MauSac ");
            list = (ArrayList<MauSac>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
}
