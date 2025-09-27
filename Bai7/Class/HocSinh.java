package Bai7.Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop204;
	private String khoHoc204;
	private String kyHoc204;	
	public HocSinh() {
	}
	
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen204 = hoTen;
		this.lop204 = lop;
		this.khoHoc204 = khoaHoc;
		this.kyHoc204 = kyHoc;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap lop: ");
		lop204 = sc.nextLine();
		System.out.print("\tNhap khoa hoc: ");
		khoHoc204 = sc.nextLine();
		System.out.print("\tNhap ky hoc: ");
		kyHoc204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLop: " + lop204);
		System.out.println("\tKhoa hoc: " + khoHoc204);
		System.out.println("\tKy hoc: " + kyHoc204);
	}
	
	public String getLop204() {
		return lop204;
	}
}
