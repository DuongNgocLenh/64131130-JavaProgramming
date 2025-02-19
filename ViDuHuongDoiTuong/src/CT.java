
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tao ra 2 SP
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2,"Bánh chuối","Đồ ăn nhanh","bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("BiaSG");
		sp1.setLoaiSP("Do uong co con");
		sp1.setAnhSP("sg.png");
		// in ra man hinh thong tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Ma SP2 la:" + sp2.getMaSP();
		       thongtinSP2 +=  "Ten SP2 la:" + sp2.getTenSP();
		System.out.print(thongtinSP1);
		System.out.print(thongtinSP2);
	}
}
