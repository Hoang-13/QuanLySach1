package QLbansach;

import java.util.Scanner;
import java.util.Vector;

public class DsNhanvien {
	Vector<Nhanvien> ds = new Vector<Nhanvien>();
	DsNhanvien() {}
	@SuppressWarnings("resource")
	public void inputds() {
		int tt;
		do {
			Nhanvien temp = new Nhanvien();
			try {
				temp.input();
			} catch (Exception e) {
				System.out.println("Loi: " + e);
			}
			ds.add(temp);
			System.out.print("Tiep tuc?");
			tt = new Scanner(System.in).nextInt();
		} while(tt>0);
	}
	public void outputds() {
		System.out.println("Ma\t|Ten NV\t|Gioitinh\t|SDT\t|SL\t|Luong\t|Phu cap");
		for(Nhanvien temp : ds) {
			temp.output();
		}
	}
}
