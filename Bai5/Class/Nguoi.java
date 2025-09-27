package Bai5.Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen204;
	private Date ngaySinh204;
	private String ngheNghiep204;	
	public Nguoi() {
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen204 = hoTen;
		this.ngaySinh204 = ngaySinh;
		this.ngheNghiep204 = ngheNghiep;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen204 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh204 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep204 = sc.nextLine();
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
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh204));
		System.out.println("\tNghe nghiep: " + ngheNghiep204);
	}
	
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(date);
		return strDate;
	}
	
	public Date getNgaySinh204() {
		return ngaySinh204;
	}
}
