package Bai2.Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	
	private String bac204;
	public CongNhan() {
	}
	
	public CongNhan(String hoten, String ngaySinh, String gioiTinh, String diaChi, String bac) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.bac204 = bac;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac204);
	}
}

