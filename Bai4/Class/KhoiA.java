package Bai4.Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1204;
	private String mon2204;
	private String mon3204;
	public KhoiA() {
	}
	
	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1204 = mon1;
		this.mon2204 = mon2;
		this.mon3204 = mon3;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1204 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2204 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1204 + " - " + mon2204 + " - " + mon3204);
	}
}
