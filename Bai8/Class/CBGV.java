package Bai8.Class;

import java.util.Scanner;

public class CBGV extends Nguoi {	
	private double luongCung204;
	private double thuong204;
	private double phat204;
	private double luongThucLinh204;	
	public CBGV() {
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap luong cung: ");
		luongCung204 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap thuong: ");
		thuong204 = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap phat: ");
		phat204 = sc.nextDouble();
		sc.nextLine();
		luongThucLinh204 = luongCung204 + thuong204 - phat204;
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLuong cung: " + luongCung204);
		System.out.println("\tThuong: " + thuong204);
		System.out.println("\tPhat: " + phat204);
		System.out.println("\tLuong thuc linh: " + luongThucLinh204);
	}

	public double getLuongThucLinh204() {
		return luongThucLinh204;
	}
}
