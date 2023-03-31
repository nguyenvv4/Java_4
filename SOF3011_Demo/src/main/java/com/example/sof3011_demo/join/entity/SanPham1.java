package com.example.sof3011_demo.join.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "SanPham")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham1 {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "GiaBan")
    private Integer giaBan;

    @OneToMany(mappedBy = "sanPham", fetch = FetchType.LAZY)
    private List<ChiTietSP> listChiTietSanPham = new ArrayList<>();


}
