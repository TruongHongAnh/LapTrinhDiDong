package Bai6.Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	private int soNgayTro204;
	private String loaiPhong204;
	private double giaPhong204;	
	public KhachTro() {
	}
	
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen204 = hoTen;
		this.CMND204 = CMND;
		this.soNgayTro204 = soNgayTro;
		this.loaiPhong204 = loaiPhong;
		this.giaPhong204 = giaPhong;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so ngay tro: ");
		soNgayTro204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong204 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong204 = sc.nextDouble();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo ngay tro: " + soNgayTro204);
		System.out.println("\tLoai phong: " + loaiPhong204);
		System.out.println("\tGia phong: " + giaPhong204);
	}
	
	public int getSoNgayTro204() {
		return soNgayTro204;
	}

	public double getGiaPhong204() {
		return giaPhong204;
	}
}
