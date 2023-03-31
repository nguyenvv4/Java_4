package com.example.sof3011_demo.join.entity;

import com.example.sof3011_demo.cart.entity.SanPham;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "ChiTietSP")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NamBH")
    private Integer namBH;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap")
    private Integer giaNhap;

    @Column(name = "GiaBan")
    private Integer giaBan;

    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham1 sanPham;
}
