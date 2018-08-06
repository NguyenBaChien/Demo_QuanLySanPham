/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyenbachien.quanlysanpham;

/**
 *
 * @author TCC
 */
public class QLSP {

    public SanPham TaoSanPham(int loai) {
        switch (loai) {
            case 1:
                return new SanPhamSo();
            case 2:
                return new SanPhamCongNghiep();
            case 3:
                return new SanPhamNongNghihep();
            default:
                return null;
        }
    }

    public void NhapThongTinSanPham(ISanPham[] listSanPham) {
        if (listSanPham != null) {
            for (ISanPham iSanPham : listSanPham) {
                if (iSanPham != null) {
                    iSanPham.nhapTT();
                } else {
                    System.out.println("San Pham Khong Hop Le.");
                }
            }
        }
    }

    public void HienThongTinSanPham(ISanPham[] listSanPham) {
        if (listSanPham != null) {
            for (ISanPham iSanPham : listSanPham) {
                if (iSanPham != null) {
                    iSanPham.xuatTT();
                } else {
                    System.out.println("San Pham Khong Hop Le.  ");
                }
            }
        }
    }

    public ISanPham GiaBanLonNhat(ISanPham[] listSanPham) {
        ISanPham isp = null;
        if (listSanPham != null) {
            for (ISanPham iSanPham : listSanPham) {
                if (iSanPham == null) {
                    continue;
                }
                if (isp == null || isp.getGiaBan() > iSanPham.getGiaBan()) {
                    isp = iSanPham;
                }
            }
        }
        return isp;
    }

}
