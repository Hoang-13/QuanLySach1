package QLbansach;

import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable {
	int maSach,soLuong,donGia;
	String tenSach,loaiSach,tenTG;
	public Sach() {}
	public void input() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Nhap ma sach: ");
			this.maSach = ip.nextInt();ip.nextLine();
			System.out.print("Nhap ten sach: ");
			this.tenSach = ip.nextLine();
			System.out.print("Nhap loai sach: ");
			this.loaiSach = ip.nextLine();
			System.out.print("Nhap ten tac gia: ");
			this.tenTG = ip.nextLine();
			System.out.print("Nhap so luong: ");
			this.soLuong = ip.nextInt();
			System.out.print("Nhap don gia: ");
			this.donGia = ip.nextInt();
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}
	public void output() {
		System.out.println(maSach + "\t|" + tenSach + "\t|" + loaiSach + "\t|" + tenTG + "\t|" + soLuong + "\t|" + donGia);
	}
	public void inputmuahang() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Nhap ma sach: ");
			this.maSach = ip.nextInt();ip.nextLine();
			System.out.print("Nhap so luong: ");
			this.soLuong = ip.nextInt();
			System.out.print("Nhap don gia: ");
			this.donGia = ip.nextInt();
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}
	public void outputmuahang() {
		System.out.println(maSach + "\t|" + soLuong + "\t|" + donGia);
	}
	
}
