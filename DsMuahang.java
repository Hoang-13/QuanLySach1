package QLbansach;

import java.util.Scanner;
import java.util.Vector;

public class DsMuahang {
	Vector<Sach> ds = new Vector<Sach>();
	@SuppressWarnings("resource")
	public void inputdsmua() {
		int tt;
		do {
			Sach temp = new Sach();
			try {
				temp.inputmuahang();
			} catch (Exception e) {
				System.out.println("Loi: " + e);
			}
			ds.add(temp);
			System.out.print("Tiep tuc mua hang?(1/0)");
			tt = new Scanner(System.in).nextInt();
		} while(tt>0);
	}
	public void outputdsmua() {
		System.out.println("Ma\t|SL\t|Don gia");
		for(Sach temp : ds) {
			temp.outputmuahang();
		}
	}
}
