package com.example.sof3011_demo.buoi1;

public class Nguoi {

    private Integer id;

    private String diaChi;

    private String ten;

    private Integer trangThai;

    public Nguoi() {
    }

    public Nguoi(Integer id, String diaChi, String ten, Integer trangThai) {
        this.id = id;
        this.diaChi = diaChi;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
