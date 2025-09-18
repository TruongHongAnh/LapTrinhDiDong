package Bai9.Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon204;
	private Date ngayMuon204;
	private Date hanTra204;
	private String soHieu204;	
	public TheMuon() {
	}
	
	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon204 = soMuon;
		this.ngayMuon204 = ngayMuon;
		this.soHieu204 = soHieu;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so muon: ");
		soMuon204 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon204 = strToDate(strNgayMuon);
		String strNgayTra = "31-12-2020";
		hanTra204 = strToDate(strNgayTra);
		System.out.println("\tNhap so hieu: ");
		soHieu204 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phieu muon: " + soMuon204);
		System.out.println("\tNgay muon: " + ngayMuon204);
		System.out.println("\tHan tra: " + hanTra204);
		System.out.println("\tSo hieu: " + soHieu204);
	}

	public Date getHanTra204() {
		return hanTra204;
	}
}
