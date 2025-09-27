package Bai6.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds204;	
	public KhachSan() {
		ds204 = new ArrayList<KhachTro>(10);
	}
	
	public void themKhachTro(KhachTro kt) {
		ds204.add(kt);
	}
	
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach204;
		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach204 = new KhachTro();
			khach204.nhapThongTin(sc);
			themKhachTro(khach204);
		}
	}
	
	public void hienThiDanhSach() {
		for (KhachTro khach : ds204) {
			khach.hienThiThongTin();
		}
	}
	
	public double tinhTien(int CMND) {
		double tien = 0;
		for (KhachTro khach : ds204) {
			if (khach.getCMND204() == CMND) {
				tien = khach.getSoNgayTro204() * khach.getGiaPhong204();
			}
		}
		return tien;
	}
}
