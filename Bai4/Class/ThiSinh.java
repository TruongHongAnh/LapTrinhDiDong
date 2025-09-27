package Bai4.Class;

import java.util.Scanner;

public class ThiSinh {
	private int soBD204;
	private String hoTen204;
	private String diaChi204;
	private String dienUuTien204;	
	public ThiSinh() {
	}
	
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD204 = soBD;
		this.hoTen204 = hoTen;
		this.diaChi204 = diaChi;
		this.dienUuTien204 = dienUuTien;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi204 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD204);
		System.out.println("\tHo ten: " + hoTen204);
		System.out.println("\tDia chi: " + diaChi204);
		System.out.println("\tDien uu tien: " + dienUuTien204);
	}

	public int getSoBD204() {
		return soBD204;
	}
}
