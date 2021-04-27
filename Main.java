package QLbansach;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		DsSach dss = new DsSach();
		DsNhanvien dsnv = new DsNhanvien();
		DsKhachhang dskh = new DsKhachhang();
		DsHoadon dshd = new DsHoadon();
		int ok=999;
		do {
			@SuppressWarnings("resource")
			Scanner ip= new Scanner(System.in);
			try {
				System.out.println("Menu:"
					+ "\n1.Nhap danh sach Sach va ghi vao file Dssach.dat"
					+ "\n2.Nhap danh sach Nhan vien"
					+ "\n3.Nhap danh sach Khach hang"
					+ "\n4.Nhap danh sach Hoa don va ghi vao file DsHoadon.dat"
					+ "\n5.Hien ds Sach tu file Dssach.dat"
					+ "\n6.Hien ds NV"
					+ "\n7.Hien ds KH"
					+ "\n8.Hien ds HD tu file Dshoadon.dat"
					+ "\n9.Sap xep danh sach Sach theo ten Sach"
					+ "\n10.Cap nhat thong tin sach theo ma Sach"
					+ "\n11.Xoa sach theo ma sach"
					+ "\n12.Tim sach theo ten sach"
					+ "\n13.Cap nhat so tien da chi cua khach hang"
					+ "\n0.Thoat"
					+ "\nBan chon:");
				ok=ip.nextInt();
				switch (ok) {
				case 1:dss.inputds();dss.ghifile();break;
				case 2:dsnv.inputds();break;
				case 3:dskh.inputds();break;
				case 4:dshd.inputds();break;
				case 5:dss.docfile();break;
				case 6:dsnv.outputds();break;
				case 7:dskh.outputds();break;
				case 8:dshd.outputds();break;
				case 9:dss.sapxep();break;
				case 10:dss.capnhat();break;
				case 11:dss.xoa();break;
				case 12:dss.tim();break;
				case 13:dshd.thanhToan(dskh);break;
				case 0:break;
				default:System.out.print("Khong hop le!");break;
				}
			} catch (Exception e) {
				System.out.println("Loi: " + e);
			}
		}while(ok!=0);
	}

}
