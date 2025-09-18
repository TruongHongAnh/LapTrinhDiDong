package Bai7.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {	
	private ArrayList<HocSinh> dshs204;	
	public QLHS() {
		dshs204 = new ArrayList<HocSinh>(10);
	}
	
	public void themHS(HocSinh hs) {
		dshs204.add(hs);
	}
	
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs204;
		System.out.print("Nhap vao so luong hoc sinh: ");
		int n = sc.nextInt();
		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			hs204 = new HocSinh();
			hs204.nhapThongTin(sc);
			themHS(hs204);
		}
	}
	
	public void hienThiDanhSach() {
		int n = dshs204.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			dshs204.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThongTin(int nam, String que) {
		for (HocSinh hs : dshs204) {
			if ((hs.getNgaySinh204().getYear() + 1900 == nam) && (que.equals(hs.getQueQuan204()))) {
				hs.hienThiThongTin();
			}
		}
	}
	public void timKiemThongTin(String lop) {
		for (HocSinh hs : dshs204) {
			if (lop.equals(hs.getLop204())) {
				hs.hienThiThongTin();
			}
		}
	}
}
