package com.example.sof3011_demo.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
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


}