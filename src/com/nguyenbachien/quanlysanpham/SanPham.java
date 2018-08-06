/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyenbachien.quanlysanpham;

import java.util.Scanner;

/**
 *
 * @author TCC
 */
public abstract class SanPham implements ISanPham {

    private int ma;
    private String ten;

    public SanPham() {
    }

    public SanPham(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhapTT() {
        System.out.println("Nhap ma , ten : ");
        setMa(new Scanner(System.in).nextInt());
        setTen(new Scanner(System.in).nextLine());
    }

    @Override
    public void xuatTT() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "SanPham{" + "ma=" + ma + ", ten=" + ten + '}';
    }

}
