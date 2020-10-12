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
public class DSHOADON {

    public static void main(String[] args) {
        List<HOADON> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int key;
        while (true) {
            menu();
            key = sc.nextInt();
            switch (key) {
                case 1:
                    inputLíst(list);
                    break;
                case 2:
                    search(list);
                    break;
                case 3:
                    sum(list);
                    break;
                case 4:
                case 5:
                    System.out.println("Exit!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public static void menu() {
        System.out.println("1.Nhập thông tin hóa đơn");
        System.out.println("2.In thông tin của hóa đơn theo mã hóa đơn");
        System.out.println("3.Tính tổng tiền của tất cả hóa đơn:");
        System.out.println("4.Tổng tiền đã có chiết khấu");
        System.out.println("Mời nhập lựa chọn:");
    }

    public static void search(List<HOADON> l) {
        System.out.println("Nhập mã hàng hóa của hàng hóa cần tìm kiếm:");
        Scanner sc = new Scanner(System.in);
        String searchMaHD = sc.nextLine();
        for (HOADON hoadon : l) {
            if (hoadon.getMaHD().equals(searchMaHD)) {
                hoadon.xuat();
            }
        }
    }

    public static void inputLíst(List<HOADON> l) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Hóa đơn " + i + ":");
            HOADON hoadon = new HOADON();
            hoadon.nhap();
            l.add(hoadon);
            System.out.println("Nhập hóa đơn nữa hay không:yes/no");
            String string = sc.nextLine();
            if (string.equalsIgnoreCase("no")) {
                break;
            }
            i++;
        }
    }
    public static void sum(List<HOADON> l) {
        
        float sumHD = 0;
                    for (HOADON hoadon : l) {
                        sumHD = sumHD + hoadon.tinhTien();
                    }
                    System.out.println("Tổng tiền của tất cả các hóa đơn=" + sumHD);
    }
    public static void sumCk(List<HOADON> l) {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        for (HOADON hoadon : l) {
            System.out.println("Nhập chiết khấu:");
            float ck=sc.nextFloat();
            sum=sum+hoadon.tintTien(ck);
        }
        System.out.println("Tổng tiền chiết khấu:"+sum);
    }
}
