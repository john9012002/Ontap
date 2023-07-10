public class SanPham {
    private String ten;
    private double gia;
    private int soLuong;
    private static double tongTien = 0;

    // Constructor 3 tham số
    public SanPham(String ten, double gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        tongTien += getThanhTien();
    }

    // Phương thức tính thành tiền
    public double getThanhTien() {
        return gia * soLuong;
    }

    // Phương thức xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Ten san pham: " + ten);
        System.out.println("Gia: " + gia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + getThanhTien());
    }

    // Phương thức lấy tổng tiền
    public static double getTongTien() {
        return tongTien;
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("San pham 1", 10, 5);
        SanPham sp2 = new SanPham("San pham 2", 20, 3);
        SanPham sp3 = new SanPham("San pham 3", 30, 2);

        sp1.xuat();
        sp2.xuat();
        sp3.xuat();

        System.out.println("Tong tien: " + SanPham.getTongTien());
    }
}