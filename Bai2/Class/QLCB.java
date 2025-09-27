package Bai2.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private ArrayList<CanBo> dscb204;
	
	public QLCB() {
		dscb204 = new ArrayList<CanBo>(10);
	}
	
	public void themCanBo(CanBo cb) {
		dscb204.add(cb);
	}
	
	public void nhapDanhSach(Scanner sc) {
		CanBo cb204;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();
			cb204 = new CanBo();
			switch (chon) {
			case 1:
				cb204 = new KySu();
				break;
			case 2:
				cb204 = new NhanVien();
				break;
			case 3:
				cb204 = new CongNhan();
				break;

			default:
				cb204 = new KySu();
				break;
			}
			cb204.nhapThongTin(sc);		
			themCanBo(cb204);
		}
	}

	
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb : dscb204) {
			if (hoTen.equals(cb.getHoTen204())) {
				cb.hienThiThongTin();
			}
		}
	}
}

