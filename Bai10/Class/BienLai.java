package Bai10.Class;

import java.util.Scanner;

public class BienLai extends KhachHang {	
	private int chiSoMoi204;
	private int chiSoCu204;
	private double tien204;
	
	public BienLai() {
	}

	
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi204 = chiSoMoi;
		this.chiSoCu204 = chiSoCu;
		this.tien204 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo204 = tenChuHo;
		this.chiSoMoi204 = chiSoMoi;
		this.chiSoCu204 = chiSoCu;
		this.tien204 = tien;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu204 = sc.nextInt();
		sc.nextLine();
		tien204 = (chiSoMoi204 - chiSoCu204) * 750;
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi204);
		System.out.println("\tChi so cu: " + chiSoCu204);
		System.out.println("\tTien: : " + tien204);
	}
}
