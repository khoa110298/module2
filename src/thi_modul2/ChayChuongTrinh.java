package thi_modul2;

import bai12_collection_framework.bai_tap.CayNhiPhan.AbstractTree;
import on_tap.NotFoundStudentException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChayChuongTrinh {

    public static final String FILE_SINHVIEN = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\thi_modul2\\data\\sinhvien.csv";
    public static final String FILE_GIAOVIEN = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\thi_modul2\\data\\giaoVien.csv";
    public static final String COMNA = ",";

    public static void danhSachChucNang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.thêm mới sinh viên" + "\n" +
                "2.xóa sinh viên" + "\n" +
                "3.xem danh sách sinh viên" + "\n" +
                "4.xem thông tin giáo viên" + "\n" +
                "5.tìm kiếm sinh viên" + "\n" +
                "6.thoát");

        int d = Integer.parseInt(scanner.nextLine());
        switch (d) {
            case 1: {
                themMoiSinhVien();
                break;
            }
            case 2: {
                xoaSinhVien();
                break;
            }
            case 3: {
                hienThiDanhSachSinhVien();
                break;
            }
            case 4: {
                hienThiDanhSachGiaoVien();
                break;
            }
            case 5: {
                timKiemSinhVien();
                break;
            }
            case 6: {
                System.exit(0);
            }

        }
    }

    public static void timKiemSinhVien() {
        docFile(FILE_SINHVIEN);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần tim kiếm: ");
        String name = scanner.nextLine();
        int d = 0;
        boolean check = false;
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (name.equals(sinhVienList.get(i).getName())) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không có sinh viên cần tim");
        } else {
            System.out.println(sinhVienList.get(d).toString());
        }
        sinhVienList.clear();
    }

    public static List<GiaoVien> giaoVienList = new ArrayList<>();

    public static void hienThiDanhSachGiaoVien() {

        try {
            FileReader fileReader = new FileReader(FILE_GIAOVIEN);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            GiaoVien giaoVien;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                giaoVien = new GiaoVien(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4]);
                giaoVienList.add(giaoVien);
            }
            for (int i = 0; i < giaoVienList.size(); i++) {
                System.out.println(giaoVienList.get(i).toString());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void hienThiDanhSachSinhVien() {
        docFile(FILE_SINHVIEN);
        for (SinhVien sinhVien : sinhVienList) {
            System.out.println(sinhVien.toString());
        }
        sinhVienList.clear();
    }

    public static void themMoiSinhVien() {
        docFile(FILE_SINHVIEN);

        Scanner scanner = new Scanner(System.in);
        int maSinhVien = sinhVienList.get(sinhVienList.size()-1).getId() +1;
        sinhVienList.clear();
//        System.out.print("nhập mã sinh viên: ");
//        String maSinhVien = scanner.nextLine();
        System.out.print("nhập tên sinh viên: ");
        String tenSinhVien = scanner.nextLine();

        Validata validata = new Validata();
        String ngaySinh;
        while (true) {
            System.out.print("nhập ngày sinh: ");
            ngaySinh = scanner.nextLine();
            if (validata.isValiDayOfBirth(ngaySinh)) {
                break;
            }
        }
        System.out.print("nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("nhập số điện thoại: ");
        String soDienThoai = scanner.nextLine();

        SinhVien sinhVien = new SinhVien(maSinhVien, tenSinhVien, ngaySinh, gioiTinh, soDienThoai, null);
        String line = sinhVien.getId() + COMNA + sinhVien.getName() + COMNA + sinhVien.getNgaySinh() +
                COMNA + sinhVien.getGioiTinh() + COMNA + sinhVien.getSoDienThoai();

        try {
            FileWriter fileWriter = new FileWriter(FILE_SINHVIEN, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SinhVien> sinhVienList = new ArrayList<>();

    public static void docFile(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            SinhVien sinhVien;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                sinhVien = new SinhVien(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], null);
                sinhVienList.add(sinhVien);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void xoaSinhVien() {
        docFile(FILE_SINHVIEN);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int d = 0;
        boolean check = false;
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (id == sinhVienList.get(i).getId()) {
                check = true;
                d = i;
                break;
            }
        }

        System.out.println("1.yes" + "\t" + "2.no");
        int x = Integer.parseInt(scanner.nextLine());
        if (!check) {
            try {
                throw new NotFoundStudentException();
            } catch (NotFoundStudentException e) {
                e.printStackTrace();
            }
        } else {
            switch (x) {
                case 1: {
                    sinhVienList.remove(d);
                    for (SinhVien sinhVien : sinhVienList) {
                        System.out.println(sinhVien.toString());
                    }
                    vietFileIndex0(FILE_SINHVIEN);
                    for (int i = 1; i < sinhVienList.size(); i++) {
                        vietFile(i, FILE_SINHVIEN);
                    }
                    sinhVienList.clear();
                    break;
                }
                case 2: {
                    danhSachChucNang();
                    break;
                }
            }
        }

    }

    public static void vietFileIndex0(String file) {
        String line = sinhVienList.get(0).getId() + COMNA + sinhVienList.get(0).getName() + COMNA + sinhVienList.get(0).getNgaySinh() + COMNA
                + sinhVienList.get(0).getGioiTinh() + COMNA + sinhVienList.get(0).getSoDienThoai() + COMNA + sinhVienList.get(0).getLopHoc();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void vietFile(int i, String file) {
        String line = sinhVienList.get(i).getId() + COMNA + sinhVienList.get(i).getName() + COMNA + sinhVienList.get(i).getNgaySinh() + COMNA
                + sinhVienList.get(i).getGioiTinh() + COMNA + sinhVienList.get(i).getSoDienThoai() + COMNA + sinhVienList.get(i).getLopHoc();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (true) {
            danhSachChucNang();
        }
    }


}
