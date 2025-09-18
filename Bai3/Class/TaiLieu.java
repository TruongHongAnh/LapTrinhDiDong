package Bai3.Class;

import java.util.Scanner;

public class TaiLieu {	
	private String maTaiLieu204;
	private String tenNXB204;
	private int soBanPhatHanh204;
	public TaiLieu() {
	}
	
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu204 = maTaiLieu;
		this.tenNXB204 = tenNXB;
		this.soBanPhatHanh204 = soBanPhatHanh;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu204 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB204 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh204 = sc.nextInt();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu204);
		System.out.println("\tTen nha xuat ban: " + tenNXB204);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh204);
	}
    
	public String getMaTaiLieu204() {
		return maTaiLieu204;
	}
}
