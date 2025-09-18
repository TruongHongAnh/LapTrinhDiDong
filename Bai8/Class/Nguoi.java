package Bai8.Class;

import java.util.Scanner;

public class Nguoi {	
	protected String hoTen204;
	protected String ngaySinh204;
	protected String queQuan204;	
	public Nguoi() {
	}
	
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen204 = hoTen;
		this.ngaySinh204 = ngaySinh;
		this.queQuan204 = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh204 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen204);
		System.out.println("\tNgay sinh: " + ngaySinh204);
		System.out.println("\tQue quan: " + queQuan204);
	}
}
