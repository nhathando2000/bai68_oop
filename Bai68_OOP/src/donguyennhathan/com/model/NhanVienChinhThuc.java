package donguyennhathan.com.model;

public class NhanVienChinhThuc extends NhanVien {
	@Override
	public void tinhLuong() {
		super.tinhLuong(); //super là gọi cái gì của cha nó
		System.out.println("Đây là nhân viên chính thức");
	}
	
	public NhanVienChinhThuc(int ma, String ten)
	{
		super(ma, ten);
	}
	public NhanVienChinhThuc()
	{
		super();
	}
}
