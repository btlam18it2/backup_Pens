package Pens;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
import Pens.Pens;

public class PenManagement {
	Vector list = new Vector();
	public PenManagement(){
		while (true) {
			System.out.println("QUAN LI BUT");
			System.out.println("1.Nhap But: ");
			System.out.println("2.Xem But: ");
			System.out.println("3.Timkiem: ");
			System.out.println("4.Thoat");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
				case 3: Timkiem();
				break;
				case 4:
						System.out.println("---Chuong trinh ket thuc---");
				return;
			}
		}
	}
		public void NhapTT()
		{
			Scanner key = new Scanner(System.in);
			int n;
			System.out.println("Nhap so luong but: ");
			n =Integer.parseInt(key.nextLine());
			for(int i=0;i<n;i++) {
				System.out.println("Nhap ten but: ");
				String tenbut = key.nextLine();
				System.out.println("Nhap Ma but: ");
				String mabut= key.nextLine();
				System.out.println("Nhap loai but: ");
				String loaibut = key.nextLine();
				System.out.println("Ngay nhap hang");
				SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
				String ngaynh=key.nextLine();
				System.out.println("Nhap so luong: ");
				float soluong=Float.parseFloat(key.nextLine());
				System.out.println("Nhap Gia: ");
				float gia=Float.parseFloat(key.nextLine());
				Pens p = new Pens(tenbut,mabut,loaibut,ngaynh,soluong,gia);
				list.add(p);
		}
	}
		public void InTT() 
		{
		Enumeration ePen = list.elements();
		int i=1;
		while (ePen.hasMoreElements()) {
			Pens pen = (Pens)ePen.nextElement();
			System.out.println("Ten but:, "+pen.getTenbut()+"Ma but: "+pen.getMabut()+" Loai but:, "+pen.getLoaibut()+
					" Nam xuat ban:, "+pen.getNgaynh()+" So luong:, "+pen.getSoluong()+" Gia:, "+pen.getGia());
		}
		}
		public void Timkiem()
		{
			Scanner key = new Scanner(System.in);
			System.out.println("Nhap ten but can tim:");
			String tenbut = key.nextLine();
			Enumeration ePen = list.elements();
			System.out.println("\n--Thong tin tim kiem duoc--");
			while (ePen.hasMoreElements())
			{
				Pens pen = (Pens)ePen.nextElement();
				if (pen.getTenbut().indexOf(tenbut)!=-1)
				{
				System.out.println("Ten but: "+pen.getTenbut()+"\nMa but: "+pen.getMabut()+"Loai but:, "+pen.getLoaibut()+"Nam xuat ban:, "+pen.getNgaynh()+ "\nSo luong: "+pen.getSoluong()+"Gia:, "+pen.getGia());
				
			}
			}
			System.out.println("\n------------\n");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PenManagement();
	}
}
