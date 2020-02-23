package donguyennhathan.com.test;

import donguyennhathan.com.model.NhanVienChinhThuc;
import donguyennhathan.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Nguyễn văn Tèo");
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Đỗ văn Tý");
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
