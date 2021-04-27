package QLbansach;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Hoadon implements Serializable {
	int maHD,maNV,maKH,tongTien;
	Date ngayMua;
	DsSach dsmuahang = new DsSach();
	public Hoadon() {}
	public int getTongTien() {
		int tong = 0;
		for(Sach temp : dsmuahang.ds) {
			tong+=temp.donGia*temp.soLuong;
		}
		tongTien = tong;
		return tongTien;
	}
	public void nhapHD() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Nhap ma Hoa don");
			this.maHD = ip.nextInt();
			System.out.print("Nhap ma Nhan vien");
			this.maNV = ip.nextInt();
			System.out.print("Nhap ma Khach hang");
			this.maKH = ip.nextInt();
			this.ngayMua = new Date();
			dsmuahang.inputdsmua();
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}
	public void xuatHD() {
		System.out.println("Ma hoa don:" + this.maHD);
		System.out.println("Ma nhan vien:" + this.maNV);
		System.out.println("Ma khach hang:" + this.maKH);
		System.out.println("Ngay lap HD:" + this.ngayMua);
		System.out.println("MaSach\t|SL\t|Dongia");
		dsmuahang.outputdsmua();
		System.out.println("Tong tien:" + this.getTongTien());
	}
	
	
}
