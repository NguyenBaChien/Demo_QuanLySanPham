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
public class SanPhamSo extends SanPham {
private static final int HE_SO = 1000;
    private float dungLuong;

    @Override
    public float getGiaBan() {
        return this.getDungLuong()*HE_SO; 
    }

    public float getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(float dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap dung luong : ");
        setDungLuong(new Scanner(System.in).nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + " - SanPhamSo{" + "dungLuong=" + dungLuong + '}';
    }

    @Override
    public void xuatTT() {
        super.xuatTT(); //To change body of generated methods, choose Tools | Templates.
    }

   

    

}
