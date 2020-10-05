package bai17_Binary_File_Serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryFile {
    public static final String FileManage = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\bai17_Binary_File_Serialization\\bai_tap\\manage.dat";

    public static void disPlayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.thêm" + "\n"
                + "2.hiển thị" + "\n"
                + "3.tìm kiếm");

        System.out.println("nhập sự lựa chọn của bạn: ");
        int d = Integer.parseInt(scanner.nextLine());
        switch (d) {
            case 1: {
                Add();
                break;
            }
            case 2: {
                disPlay();
                break;
            }
            case 3: {
                seach();
                break;
            }
        }
    }

    public static List<Product> arrayList = new ArrayList<>();

    public static void Add() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("nhập hãn sản phẩm: ");
        String production = scanner.nextLine();

        System.out.print("nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("mô tả khác: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, production, price, description);

        arrayList.add(product);

        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(FileManage);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("đã thêm thành công");
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        disPlayMenu();
    }

    public static void disPlay() {
        FileInputStream fis;
        ObjectInputStream ois = null;
        List<Product> productList = null;

        try {
            fis = new FileInputStream(FileManage);
            ois = new ObjectInputStream(fis);

            productList = (List<Product>) ois.readObject();
            for (Product product : productList) {
                System.out.println(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        disPlayMenu();
    }

    public static void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần tim kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        int n = 0;

        FileInputStream fis;
        ObjectInputStream ois = null;
        List<Product> productList = null;
        try {
            fis = new FileInputStream(FileManage);
            ois = new ObjectInputStream(fis);

            productList = (List<Product>) ois.readObject();
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    n = i;
                    check = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        if (check) {
            System.out.println(productList.get(n).toString());
        } else {
            System.out.println("không tìm thấy sản phẩm cần tìm");
        }

        disPlayMenu();

    }

    public static void main(String[] args) {
        disPlayMenu();
    }
}
