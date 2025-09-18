package Bai4.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {	
	private ArrayList<ThiSinh> dsts204;
	
	public TuyenSinh() {
		dsts204 = new ArrayList<ThiSinh>(10);
	}
	
	public void themThiSinh(ThiSinh ts) {
		dsts204.add(ts);
	}
	
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts204;
		int chon204;
		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon204 = sc.nextInt();
			switch (chon204) {
			case 1:
				ts204 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts204 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts204 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts204 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}
			ts204.nhapThongTin(sc);
			themThiSinh(ts204);
		}
	}
	
	public void hienThiDanhSach() {
		int n = dsts204.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts204.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts204) {
			if (ts.getSoBD204() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
