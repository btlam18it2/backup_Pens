package Pens;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Pens {
	String tenbut;
	String mabut;
	String loaibut;
	String ngaynh;
	float soluong;
	float gia;
	

	public String getTenbut() {
		return tenbut;
	}


	public void setTenbut(String tenbut) {
		this.tenbut = tenbut;
	}


	public String getMabut() {
		return mabut;
	}


	public void setMabut(String mabut) {
		this.mabut = mabut;
	}


	public String getLoaibut() {
		return loaibut;
	}


	public void setLoaibut(String loaibut) {
		this.loaibut = loaibut;
	}


	public String getNgaynh() {
		return ngaynh;
	}


	public void setNgaynh(String ngaynh) {
		this.ngaynh = ngaynh;
	}


	public float getSoluong() {
		return soluong;
	}


	public void setSoluong(float soluong) {
		this.soluong = soluong;
	}


	public float getGia() {
		return gia;
	}


	public void setGia(float gia) {
		this.gia = gia;
	}


	public Pens(String tenbut,String mabut, String loaibut,String namxb, float soluong, float gia)
	{
		this.tenbut = tenbut;
		this.mabut = mabut;
		this.loaibut = loaibut;
		this.ngaynh = ngaynh;
		this.soluong = soluong;
		this.gia = gia;
	}
}
