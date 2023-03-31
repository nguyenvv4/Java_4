package com.example.sof3011_demo.join.repository;

import com.example.sof3011_demo.db.util.HibernateUtil;
import com.example.sof3011_demo.join.entity.ChiTietSP;
import com.example.sof3011_demo.join.entity.SanPham1;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class ChiTietSPRepository {

    public ArrayList<ChiTietSP> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("FROM ChiTietSP ");
        ArrayList<ChiTietSP> list = (ArrayList<ChiTietSP>) query.getResultList();
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ChiTietSP> list = new ChiTietSPRepository().getList();

        for (ChiTietSP ctsp: list){
            System.out.println(ctsp.getId() +" - "+ ctsp.getSanPham().getTen());
        }
    }
}
