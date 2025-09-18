package Bai5.Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi204;
	private int soNha204;
	private Nguoi[] list; 	
	public HoDan() {
		list = new Nguoi[10];
	}
	
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi204 = soNguoi;
		this.soNha204 = soNha;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha204 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi204; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i] = new Nguoi();
			list[i].nhapThongTin(sc);
		}
	}
	
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi204);
		System.out.println("\tSo nha: " + soNha204);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi204; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i].hienThiThongTin();
		}
	}
	
	public Nguoi[] getList() {
		return list;
	}
	
	public int getSoNguoi204() {
		return soNguoi204;
	}
}
