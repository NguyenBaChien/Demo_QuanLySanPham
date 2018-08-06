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
public class SanPhamCongNghiep extends SanPham {

    private static final int HE_SO = 1000;
    private int thoiGianBaoHanh;
    private float giaXuatXuong;

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public float getGiaXuatXuong() {
        return giaXuatXuong;
    }

    public void setGiaXuatXuong(float giaXuatXuong) {
        this.giaXuatXuong = giaXuatXuong;
    }

    @Override
    public void nhapTT() {
        super.nhapTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap thoi gian bao hanh, gia xuat xuong");
        setThoiGianBaoHanh(new Scanner(System.in).nextInt());
        setGiaXuatXuong(new Scanner(System.in).nextFloat());
    }

    @Override
    public float getGiaBan() {
        return getGiaXuatXuong() + getThoiGianBaoHanh() * HE_SO;
    }

    @Override
    public String toString() {
        return super.toString() + " - SanPhamCongNghiep{" + "thoiGianBaoHanh=" + thoiGianBaoHanh + ", giaXuatXuong=" + giaXuatXuong + '}';
    }

}
