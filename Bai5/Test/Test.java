package Bai5.Test;

import java.util.Scanner;
import Bai5.Class.KhuPho;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhuPho qlkp = new KhuPho();
		qlkp.nhapDanhSach(sc);
		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp.timKiemThongTin();
	}
}
