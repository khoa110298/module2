package thi_modul2;

public class SinhVien extends Quanlylophoc {
    private String ngaySinh;
    private String gioiTinh;
    private String soDienThoai;
    private LopHoc lopHoc;

    public SinhVien() {
    }

    public SinhVien(String ngaySinh, String gioiTinh, String soDienThoai, LopHoc lopHoc) {
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.lopHoc = lopHoc;
    }

    public SinhVien(int id, String name, String ngaySinh, String gioiTinh, String soDienThoai, LopHoc lopHoc) {
        super(id, name);
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.lopHoc = lopHoc;
    }

    public SinhVien(int id, String name, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(id, name);
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() +
                "ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", lopHoc=" + lopHoc +
                '}';
    }

}
