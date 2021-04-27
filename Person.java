package QLbansach;

import java.util.Scanner;

public class Person {
	int ma;
	String ten,gt,sdt;
	public Person() {}
	public void input() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Nhap ma:");
			this.ma = ip.nextInt();ip.nextLine();
			System.out.print("Nhap ten:");
			this.ten = ip.nextLine();
			System.out.print("Nhap gioi tinh:");
			this.gt = ip.nextLine();
			System.out.print("Nhap sdt:");
			this.sdt = ip.nextLine();
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}
	public void output() {
		System.out.print(ma + "\t|" + ten + "\t|" + gt + "\t|" + sdt);
	}
}
