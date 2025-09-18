package Bai5.Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {	
	private ArrayList<HoDan> dshd204;	
	public KhuPho() {
		dshd204 = new ArrayList<HoDan>(10);
	}
	
	public void themHoDan(HoDan hoDan) {
		dshd204.add(hoDan);
	}
	
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan204;
		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan204 = new HoDan();
			hoDan204.nhapThongTin(sc);
			themHoDan(hoDan204);
		}
	}
	
	public void hienThiDanhSach() {
		int n = dshd204.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd204.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThongTin() {
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;
		Nguoi[] dstv = null;
		for (HoDan hoDan : dshd204) {
			dstv = hoDan.getList();
			for (int i = 0; i < hoDan.getSoNguoi204(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh204().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
