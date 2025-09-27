package Bai2.Class;
import java.util.Scanner;

public class KySu extends CanBo {
	
	private String nganhDaoTao204;
	public KySu() {
	}
	
	public KySu(String hoten, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao204 = nganhDaoTao;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao204 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao204);
	}
}

