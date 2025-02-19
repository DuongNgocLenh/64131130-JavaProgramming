import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		//Khai báo ds san pham
		ArrayList<SanPham> dsSanPham;
		dsSanPham = new ArrayList<SanPham>();
		//Nhap 3 sp
		SanPham sp1 = new SanPham(0,"Kem","Giai Khat",null);
		SanPham sp2 = new SanPham(1,"Keo","An nhanh",null);
		SanPham sp3 = new SanPham(3,"Com","Do An",null);
		//Them vao list
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		//for (SanPham x: dsSanPham)
		//	System.out.println(x.toString());
		for (int i=0 ; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}
}
