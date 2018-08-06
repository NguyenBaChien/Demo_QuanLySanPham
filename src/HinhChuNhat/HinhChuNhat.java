/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HinhChuNhat;

import java.util.Scanner;


public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public int TinhDienTich(){
    return getChieuDai() * getChieuRong();
    }
    public void nhap(){
        System.out.println("Nhap chieu dai va rong : ");
        setChieuDai(new Scanner(System.in).nextInt());
        setChieuRong(new Scanner(System.in).nextInt());
    }
    public static void Hello(){
        System.out.println("Hello");
    }
    
}
