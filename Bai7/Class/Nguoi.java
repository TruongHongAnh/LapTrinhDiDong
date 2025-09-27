package Bai7.Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {	
	protected String hoTen204;
	protected Date ngaySinh204;
	protected String queQuan204;	
	public Nguoi() {
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen204 = hoTen;
		this.ngaySinh204 = ngaySinh;
		this.queQuan204 = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh204 = strToDate(strDate);
		System.out.print("\tNhap que quan: ");
		queQuan204 = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}

	
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen204);
		System.out.println("\tNgay sinh: " + ngaySinh204);
		System.out.println("\tQue quan: " + queQuan204);
	}

	public String getQueQuan204() {
		return queQuan204;
	}
	
	public Date getNgaySinh204() {
		return ngaySinh204;
	}
}
