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
public class SanPhamNongNghihep extends SanPham {

    private static final int HE_SO = 500;

    private int hanDung;
    private float giaHienTai;

    public int getHanDung() {
        return hanDung;
    }

    public void setHanDung(int hanDung) {
        this.hanDung = hanDung;
    }

    public float getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(float giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap han su dung , gia hien tai : ");
        setHanDung(new Scanner(System.in).nextInt());
        setGiaHienTai(new Scanner(System.in).nextFloat());
    }

    @Override
    public float getGiaBan() {
        return getGiaHienTai() + getHanDung() * HE_SO;
    }

    @Override
    public String toString() {
        return super.toString() + " - SanPhamNongNghihep{" + "hanDung=" + hanDung + ", giaHienTai=" + giaHienTai + '}';
    }

}
