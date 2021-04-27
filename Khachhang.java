package QLbansach;

public class Khachhang extends Person {
	private int soTien=0;
	public Khachhang() {}
	public void tinhTien(DsHoadon ds) {
		for(Hoadon temp : ds.ds) {
			if(temp.maKH==this.ma) this.soTien+=temp.tongTien;
		}
	}
	public int getSoTien() {
		return soTien;
	}
	public void output() {
		super.output();
		System.out.println("\t|" + soTien);
	}
}
