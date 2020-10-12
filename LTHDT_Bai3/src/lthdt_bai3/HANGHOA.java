/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt_bai3;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class HANGHOA {
    private String maHH;
    private String tenH;
    private  int soL;
    private float donG;

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) {
        this.tenH = tenH;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public float getDonG() {
        return donG;
    }

    public void setDonG(float donG) {
        this.donG = donG;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng hóa:");
        this.maHH=sc.nextLine();
        System.out.println("Nhập tên hàng hóa:");
        this.tenH=sc.nextLine();
        System.out.println("Nhập số lượng:");
        this.soL=sc.nextInt();
        System.out.println("Nhập đơn giá:");
        this.donG=sc.nextFloat();
    }
    public void xuat() {
        System.out.println("Mã hàng hóa:"+this.maHH);
        System.out.println("Tên hàng hóa:"+this.tenH);
        System.out.println("Số lượng:"+this.soL);
        System.out.println("Đơn giá:"+this.donG);
        
    }
    public float tinhTien() {
        return this.soL*this.donG;
    }
}
