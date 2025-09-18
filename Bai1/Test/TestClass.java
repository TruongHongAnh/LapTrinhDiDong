package Bai1.Test;

import Bai1.Class.PhanSo;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1=new PhanSo();
        PhanSo ps2=new PhanSo();
        PhanSo psTong=new PhanSo();
        System.out.println("Nhap phan so thu nhat :");
        ps1.nhapPS(sc);
        System.out.println("Nhap phan so thu hai :");
        ps2.nhapPS(sc);
        psTong   = ps1.congPS(ps2);
        System.out.println("Phan so thu nhat la :");
        ps1.hienThiPS();
        System.out.println("Phan so thu hai la :");
        ps2.hienThiPS();
        System.out.println("Phan so tong la :");
        psTong.hienThiPS();
        
        sc.close();

    }
}
