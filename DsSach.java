package QLbansach;

import java.util.*;
import java.io.*;

public class DsSach {
	Vector<Sach> ds = new Vector<Sach>();
	DsSach() {}
	@SuppressWarnings("resource")
	public void inputds() {
		int tt;
		do {
			Sach temp = new Sach();
			try {
				temp.input();
			} catch (Exception e) {
				System.out.println("Loi: " + e);
			}
			ds.add(temp);
			System.out.print("Tiep tuc?(1/0)");
			tt = new Scanner(System.in).nextInt();
		} while(tt>0);
	}
	public void outputds() {
		System.out.println("Ma\t|Ten Sach\t|Loai\t|Tac Gia\t|SL\t|Don gia");
		for(Sach temp : ds) {
			temp.output();
		}
	}
	public void sapxep() {
		Comparator<Sach> SachComparator = new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                return s1.tenSach.compareTo(s2.tenSach);
            }
        };
        Collections.sort(ds,SachComparator);
        this.outputds();
	}
	@SuppressWarnings("resource")
	public void capnhat() {
		System.out.print("Nhap ma sach can cap nhat: ");
		Scanner ip = new Scanner(System.in);
		int m = ip.nextInt();
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).maSach==m) {
				ip.nextLine();
				System.out.print("Nhap ten sach: ");
				ds.get(i).tenSach = ip.nextLine();
				System.out.print("Nhap loai sach: ");
				ds.get(i).loaiSach = ip.nextLine();
				System.out.print("Nhap ten tac gia: ");
				ds.get(i).tenTG = ip.nextLine();
				System.out.print("Nhap so luong: ");
				ds.get(i).soLuong = ip.nextInt();
				System.out.print("Nhap don gia: ");
				ds.get(i).donGia = ip.nextInt();
			}
		}
		this.outputds();
	}
	@SuppressWarnings("resource")
	public void xoa() {
		System.out.print("Nhap ma sach muon xoa: ");
		Scanner ip = new Scanner(System.in);
		int m = ip.nextInt();
		for(int i = 0; i<ds.size(); i++) {
			if(ds.get(i).maSach==m) ds.remove(i);
		}
		this.outputds();
	}
	@SuppressWarnings("resource")
	public void tim() {
		System.out.print("Nhap ten sach can tim: ");
		String x = new Scanner(System.in).nextLine();
		boolean c=false;
		for(Sach temp : ds) {
			if(temp.tenSach.compareTo(x)==0) {
				System.out.println("Ma\t|Ten Sach\t|Loai\t|Tac Gia\t|SL\t|Don gia");
				temp.output();
				c=true;
				break;
			}
		}
		if(c==false) System.out.println("Khong tim thay sach!");
	}
	public void ghifile() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("Dssach.DAT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Sach temp : ds) {
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
			FileInputStream fis = new FileInputStream("Dssach.DAT");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Ma\t|Ten Sach\t|Loai\t|Tac Gia\t|SL\t|Don gia");
			while(fis.available()>0) {
				Sach temp = (Sach)ois.readObject();
				temp.output();
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Loi:" + e);
		}
	}
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
