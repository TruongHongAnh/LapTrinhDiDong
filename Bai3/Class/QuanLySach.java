package Bai3.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {	
	private ArrayList<TaiLieu> dstl204;

	public QuanLySach() {
		dstl204 = new ArrayList<TaiLieu>(10);
	}
	
	public void themTaiLieu(TaiLieu tl) {
		dstl204.add(tl);
	}
	
	public void nhapDanhSachTL(Scanner sc) {
		int chon204;
		String stop204;
		TaiLieu tl204;
		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon204 = sc.nextInt();
			sc.nextLine();
			switch (chon204) {
			case 1:
				tl204 = new Sach();
				break;
			case 2:
				tl204 = new TapChi();
				break;
			case 3:
				tl204 = new Bao();
				break;

			default:
				tl204 = new Sach();
				break;
			}
			tl204.nhapThongTin(sc);
			themTaiLieu(tl204);
			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop204 = sc.nextLine();
		} while (stop204.equals("c"));
	}
	public void timMaTL(String maTL) {
		for (TaiLieu tl : dstl204) {
			if (maTL.equals(tl.getMaTaiLieu204())) {
				tl.hienThiThongTin();
			}
		}
	}
	
	public void timLoaiTL(String loai) {
		for (TaiLieu tl : dstl204) {
			if (loai.equals("Sach") && (tl instanceof Sach)) {
				tl.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl instanceof TapChi)) {
				tl.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl instanceof Bao)) {
				tl.hienThiThongTin();
			}
		}
	}
}
