package Bai3.Class;

import java.util.Scanner;

public class Sach extends TaiLieu {	
	private String tacGia204;
	private int soTrang204;
	public Sach() {
	}
	
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia204 = tacGia;
		this.soTrang204 = soTrang;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia204 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang204 = sc.nextInt();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia204);
		System.out.println("\tSo trang: " + soTrang204);
	}
}

