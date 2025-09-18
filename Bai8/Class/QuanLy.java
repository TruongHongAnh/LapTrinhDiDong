package Bai8.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<CBGV> ds204;	
	public QuanLy() {
		ds204 = new ArrayList<CBGV>(10);
	}
	
	public void themCBGV(CBGV canBo) {
		ds204.add(canBo);
	}
	
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo204;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo204 = new CBGV();
			canBo204.nhapThongTin(sc);
			themCBGV(canBo204);
		}
	}
	
	public void hienThiDanhSach() {
		for (CBGV cb : ds204) {
			cb.hienThiThongTin();
		}
	}
	
	public void timKiem(double luong) {
		for (CBGV cb : ds204) {
			if (cb.getLuongThucLinh204() >= luong) {
				cb.hienThiThongTin();
			}
		}
	}
}
