package thi_modul2;

public class LopHoc extends Quanlylophoc {
    private GiaoVien giaoVien;

    public LopHoc() {
    }

    public LopHoc(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public LopHoc(int id, String name, GiaoVien giaoVien) {
        super(id, name);
        this.giaoVien = giaoVien;
    }

    @Override
    public String toString() {
        return "LopHoc{" + super.toString() +
                "giaoVien=" + giaoVien +
                '}';
    }
}
