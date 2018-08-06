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
public class Menu {

    public int HienMenu() {
        System.out.println("1. Nhap ");
        System.out.println("2. Hien ");
        System.out.println("3. Gia Lon Nhat ");
        System.out.println("4. Thoat ");
        int luachon = new Scanner(System.in).nextInt();

        return luachon;
    }

    public int HienChonLoaiSanPham() {
        System.out.println("1. San Pham So");
        System.out.println("2. San Pham Cong Nghiep");
        System.out.println("3. San Pham Nong Nghiep");
        int luachon = new Scanner(System.in).nextInt();

        if (luachon > 3 || luachon < 0) {
            return HienChonLoaiSanPham();
        }
        return luachon;
    }

//    public void ChayNgayDi() {
//        QLSP qlsp = new QLSP();
//        ISanPham[] listSanPham = null;
//        int luaChon = HienMenu();
//        while (true) {
//            switch (luaChon) {
//                case 1:
//                    listSanPham = TaoDanhSachSanPham();
//                    for (int i = 0; i < listSanPham.length; i++) {
//                        listSanPham[i] = qlsp.TaoSanPham(HienChonLoaiSanPham());
//                        listSanPham[i].nhapTT();
//                        //qlsp.NhapThongTinSanPham(listSanPham);
//                    }  //System.exit(0);
//                    break;
//                case 2:
//                    qlsp.HienThongTinSanPham(listSanPham);
//                    break;
//                case 3:
//                    ISanPham TimGiaLonNhat = qlsp.GiaBanLonNhat(listSanPham);
//                    System.out.println("San pham voi gia ban lon nhat : " + TimGiaLonNhat);
//                    break;
//                case 4:
//                    System.out.println("Thoat khoi chuong trinh...");
//                    System.exit(0);// thoat hoan toan chuong trinh...
//                //break;
//                default:
//                    System.out.println("Ban da nhap sai, xin moi nhap lai...");
//            }
//            break;
//        }
//
//    }
    public void ChayNgayDi() {
        QLSP qlsp = new QLSP();
        ISanPham[] listSanPham = null;
        int luachon;
        do {
            System.out.println("Nhap lua chon: ");
            luachon = HienMenu();

            switch (luachon) {

                case 1:
                    listSanPham = TaoDanhSachSanPham();
                    for (int i = 0; i < listSanPham.length; i++) {
                        listSanPham[i] = qlsp.TaoSanPham(HienChonLoaiSanPham());
                        if (listSanPham[i] != null) {
                            listSanPham[i].nhapTT();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 2:
                case 3:
                case 4:
                    break;

            }
        } while (luachon != 4);
    }

    public ISanPham[] TaoDanhSachSanPham() {
        int soLuong = 0;
        ISanPham[] listSanPham = null;
        System.out.println("Nhap so luong san pham : ");
        soLuong = new Scanner(System.in).nextInt();
        if (soLuong <= 0) {
            System.out.println("Nhap vao so phan tu lon hon 0");
            return TaoDanhSachSanPham();
        }
        listSanPham = new ISanPham[soLuong];
        return listSanPham;
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.ChayNgayDi();

    }

}
