package QLbansach;

import java.util.Scanner;

public class Nhanvien extends Person {
	int luong,pc;
	public Nhanvien() {}
	public void input() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		try {
			super.input();
			System.out.print("Nhap luong:");
			this.luong = ip.nextInt();
			System.out.print("Nhap phu cap:");
			this.pc = ip.nextInt();
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}
	public void output() {
		super.output();
		System.out.println("\t|" + luong + "\t|" + pc);
	}
}
