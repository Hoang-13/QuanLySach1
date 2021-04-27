package QLbansach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class DsHoadon {
	Vector<Hoadon> ds = new Vector<Hoadon>();
	DsHoadon() {}
	@SuppressWarnings("resource")
	public void inputds() {
		int tt;
		do {
			Hoadon temp = new Hoadon();
			try {
				temp.nhapHD();
			} catch (Exception e) {
				System.out.println("Loi: " + e);
			}
			ds.add(temp);
			System.out.print("Tiep tuc nhap hoa don?(1/0)");
			tt = new Scanner(System.in).nextInt();
		} while(tt>0);
	}
	public void outputds() {
		for(Hoadon temp : ds) {
			temp.xuatHD();
		}
	}
	public void thanhToan(DsKhachhang dskh) {
		for(int i=0;i<dskh.ds.size();i++)
			dskh.ds.get(i).tinhTien(this);
	}
	public void ghifile() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("Dshoadon.DAT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Hoadon temp : ds) {
				oos.writeObject(temp);
			}
			oos.close();
			fos.close();
			System.out.println("Ghi file thanh cong!");
		} catch (Exception e) {
			System.out.println("Loi:" + e);
		}
	}
	public void docfile() {
		try {
			FileInputStream fis = new FileInputStream("DsHoadon.DAT");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(fis.available()>0) {
				Hoadon temp = (Hoadon)ois.readObject();
				temp.xuatHD();
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Loi:" + e);
		}
	}
}
