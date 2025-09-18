package Bai9.Class;

import java.util.Scanner;

public class SinhVien {
	protected String hoTen204;
	protected String maSV204;
	protected String ngaySinh204;
	protected String lop204;	
	public SinhVien() {
	}
	
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen204 = hoTen;
		this.maSV204 = maSV;
		this.ngaySinh204 = ngaySinh;
		this.lop204 = lop;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap ma sinh vien: ");
		maSV204 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh204 = sc.nextLine();
		System.out.print("\tNhap lop: ");
		lop204 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen204);
		System.out.println("\tNgay sinh: " + ngaySinh204);
		System.out.println("\tMa sinh vien: " + maSV204);
		System.out.println("\tLop: " + lop204);
	}
}
