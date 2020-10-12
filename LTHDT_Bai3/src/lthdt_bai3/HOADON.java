/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt_bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class HOADON {
    private String maHD;
    private String ngayLap;
    private List<HANGHOA> list= new ArrayList<>();

    public HOADON() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }
    public void nhap() {
        System.out.println("Nhập mã hóa đơn:");
        Scanner sc = new Scanner(System.in);
        this.maHD=sc.nextLine();
        System.out.println("Ngày lập hóa đơn:");
        this.ngayLap=sc.nextLine();
        System.out.println("Nhập danh sách hàng hóa:");
        int i=1;
        while (true) {            
            System.out.println("Number "+i+" :");
            HANGHOA hanghoa= new HANGHOA();
            hanghoa.nhap();
            this.list.add(hanghoa);
            System.out.println("Nhập nữa:yes/no");
            String key=sc.nextLine();
            if(key.equalsIgnoreCase("no")) {
                break;
            }
            i++;
        }
    }
    public void xuat() {
        System.out.println("Mã hóa đơn:"+this.maHD);
        System.out.println("Ngày lập hóa đơn:"+this.ngayLap);
        System.out.println("Danh sách hàng hóa:");
        for (HANGHOA hanghoa : this.list) {
            System.out.println("Mã hàng hóa:"+hanghoa.getMaHH()+".Tên hàng hóa:"+hanghoa.getTenH());
        }
    }
    public float tinhTien() {
        float sum=0;
        for (HANGHOA hanghoa : this.list) {
            sum=sum+hanghoa.tinhTien();
        }
        return sum;
    }
    public float tintTien(float ck) {
        return tinhTien()*(1-ck);
    }
}
