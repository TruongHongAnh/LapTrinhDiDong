package Bai10.Class;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo204;
	protected int soNha204;
	protected String maCongTo204;	
	
	public KhachHang() {
	}

	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo204 = tenChuHo;
		this.soNha204 = soNha;
		this.maCongTo204 = maCongTo;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo204 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo204);
		System.out.println("\tSo nha: " + soNha204);
		System.out.println("\tMa cong to: " + maCongTo204);
	}
}
