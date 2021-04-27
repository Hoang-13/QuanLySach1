package QLbansach;

import java.util.Scanner;
import java.util.Vector;

public class DsKhachhang {
	Vector<Khachhang> ds = new Vector<Khachhang>();
	DsKhachhang() {}
	@SuppressWarnings("resource")
	public void inputds() {
		int tt;
		do {
			Khachhang temp = new Khachhang();
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
		System.out.println("Ma\t|Ten NV\t|Gioitinh\t|SDT\t|Tong tien da chi");
		for(Khachhang temp : ds) {
			temp.output();
		}
	}
}
