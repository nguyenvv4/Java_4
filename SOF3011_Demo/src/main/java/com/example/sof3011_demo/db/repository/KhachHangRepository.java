package com.example.sof3011_demo.db.repository;

import com.example.sof3011_demo.db.entity.KhachHang;
import com.example.sof3011_demo.db.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

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

    public KhachHang getById(UUID id) {
        KhachHang khachHang = new KhachHang();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            Query query = session.createQuery("from KhachHang where id =: id");
//            query.setParameter("id", id);
//            khachHang= (KhachHang) query.getSingleResult();
            khachHang = session.get(KhachHang.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    public Boolean add(KhachHang khachHang) {
        Transaction transaction;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean update(KhachHang khachHang) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }



}
