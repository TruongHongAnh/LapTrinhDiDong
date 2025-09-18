package Bai2.Class;

import java.util.Scanner;
public class CanBo {
	
	private String hoTen204;
	private String ngaySinh204;
	private String gioiTinh204;
	private String diaChi204;

	public CanBo() {
	}
	
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen204 = hoten;
		this.ngaySinh204 = ngaySinh;
		this.gioiTinh204 = gioiTinh;
		this.diaChi204 = diaChi;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh204 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh204 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen204);
		System.out.println("\tNgay sinh: " + ngaySinh204);
		System.out.println("\tGioi tinh: " + gioiTinh204);
		System.out.println("\tDia chi: " + diaChi204);
	}
	
	public String getHoTen204() {
		return this.hoTen204;
	}
}

