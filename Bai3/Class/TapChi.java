package Bai3.Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh204;
	private int thangPhatHanh204;
	
	public TapChi() {
	}
	
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh204 = soBanPhatHanh;
		this.thangPhatHanh204 = thangPhatHanh;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh204 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh204 = sc.nextInt();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh204);
		System.out.println("\tThang phat hanh: " + thangPhatHanh204);
	}
}

