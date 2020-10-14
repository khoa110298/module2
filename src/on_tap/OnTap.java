package on_tap;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class OnTap {
    public static void disPlayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.tìm kiếm" + "\n" + "2.sửa");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
                updaData();
                break;
            }
            case 2: {
                capNhat();
                break;
            }

        }
    }

    public static List<SinhVien> sinhVienList = new ArrayList<>();

    public static void readFile(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            SinhVien sinhVien;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                sinhVien = new SinhVien(temp[0], temp[1], temp[2], temp[3]);
                sinhVienList.add(sinhVien);
            }
//            for (SinhVien sinhVien1:sinhVienList){
//                System.out.println(sinhVien1);
//            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updaData() {
        readFile("D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần tim kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        int d = 0;
        boolean check = false;
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (id == Integer.parseInt(sinhVienList.get(i).getId())) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println(sinhVienList.get(d).toString());
        }
    }

    public static void writeFile(int i, String file) {
        String line = sinhVienList.get(i).getId() + "," + sinhVienList.get(i).getName() + "," + sinhVienList.get(i).getAge() + "," + sinhVienList.get(i).getAdddresss();
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


    public static void writeFileIndex0(String file) {
        String line = sinhVienList.get(0).getId() + "," + sinhVienList.get(0).getName() + "," + sinhVienList.get(0).getAge() + "," + sinhVienList.get(0).getAdddresss();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void capNhat() {
        readFile("D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int d = 0;
        boolean check = false;
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (id == Integer.parseInt(sinhVienList.get(i).getId())) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println("nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("nhập tuổi: ");
            String age = scanner.nextLine();
            System.out.println("nhập địa chỉ: ");
            String address = scanner.nextLine();
            sinhVienList.get(d).setName(name);
            sinhVienList.get(d).setAge(age);
            sinhVienList.get(d).setAdddresss(address);
        }
        for (SinhVien sinhVien : sinhVienList) {
            System.out.println(sinhVien.toString());
        }
        writeFileIndex0("D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
        for (int i = 1; i < sinhVienList.size(); i++) {
            writeFile(i, "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
        }
//        File myObij = new File("D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
//        try {
//            myObij.delete();
//            myObij.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < sinhVienList.size(); i++) {
//            writeFile(i, "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\on_tap\\sinhvien.csv");
//
//        }
    }
//    public static List<SinhVien> getInfor(String file) {
//        List<SinhVien> sinhViens = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            String[] temp;
//            SinhVien sinhVien;
//            while ((line = bufferedReader.readLine()) != null) {
//                temp = line.split(",");
//                sinhVien = new SinhVien(temp[0], temp[1], temp[2], temp[3]);
//                sinhViens.add(sinhVien);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return sinhViens;
//    }

//    public static void writeFileList(List<SinhVien> sinhVienList, String file) throws IOException {
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        for (int i=0;i<sinhVienList.size();i++){
//            String line = sinhVienList.get(i).getId() + "," + sinhVienList.get(i).getName() + "," + sinhVienList.get(i).getAge() + "," + sinhVienList.get(i).getAdddresss();
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
//    }

    public static void main(String[] args) {
       while (true){
           disPlayMenu();
       }

    }

}