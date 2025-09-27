package Bai2.Class;

import java.util.Scanner;

public class NhanVien extends CanBo {	
	private String congViec204;
	
	public NhanVien() {
	}
	
	public NhanVien(String hoten, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec204 = congViec;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec204);
	}
}

