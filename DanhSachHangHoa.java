package tranQuocAnh.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachHangHoa {
	private ArrayList<HangHoa> ds;

	public ArrayList<HangHoa> getDs() {
		return ds;
	}

	public void setDs(ArrayList<HangHoa> ds) {
		this.ds = ds;
	}
 
	public DanhSachHangHoa() {
		super();
		this.ds = new ArrayList<HangHoa>();
	}
	
	public DanhSachHangHoa(ArrayList<HangHoa> ds) {
		super();
		this.ds = ds;
				super();
		this.ds = ds;
				super();
		this.ds = ds;
				super();
		this.ds = ds;
				super();
		this.ds = ds;
		
	}
	/**
	 * Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này. 
	 * Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, 
	 * nếu không trả về false.
	 * @param h
	 */
	public void them(HangHoa h) {
		if(!ds.contains(h))
		{
			ds.add(h);
			System.out.println("Them thanh cong");
		}else {
			System.out.println("Them that bai, trung ma");
		}
	}
	public void xuatHangHoa(int luaChon) {
		if(luaChon == 1) {
			for (HangHoa h : ds) {
				System.out.println(h.toString());
			}
		}else if(luaChon ==2) {
			for (HangHoa hangHoa : ds) {
				if(hangHoa instanceof HangThucPham) {
					System.out.println(hangHoa.toString());
				}
			}
		}else if(luaChon ==3) {
			for (HangHoa hangHoa : ds) {
				if(hangHoa instanceof HangDienMay) {
					System.out.println(hangHoa.toString());
				}
			}
		}else if(luaChon ==4) {
			for (HangHoa hangHoa : ds) {
				if(hangHoa instanceof HangSanhSu) {
					System.out.println(hangHoa.toString());
				}
			}
		}
	}
	
	public HangHoa timKiemTheoMa(String ma) {
		for (HangHoa hangHoa : ds) {
			if(hangHoa.getMaHang().equals(ma)) {
				return hangHoa;
			}
		}
		return null;
	}
	
	public boolean xoaHangTheoMa(String ma) {
		HangHoa h = timKiemTheoMa(ma);
		if(h!=null) {
			ds.remove(h);
			return true;
		}else {
			return false;
		}
	}
	
	public void sapXepTheoTenTangDan() {
		System.out.println("Danh sach hang hoa da sap xep theo ten: ");
		Collections.sort(ds, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}

	public void sapXepTheoSoLuongTonGiamDan() {
		System.out.println("Danh sach hang xoas da sap xep theo sl ton");
		Collections.sort(ds, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
			    Integer sL1 = o1.getSoLuongTon();
			    Integer sL2 = o2.getSoLuongTon();
				return sL2.compareTo(sL1);
			}
		});
	}
	

}
