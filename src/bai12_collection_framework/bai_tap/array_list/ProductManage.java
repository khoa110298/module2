package bai12_collection_framework.bai_tap.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManage {
    public static void DisPlayMenu(){
        System.out.println("1.thêm sản phẩm" +"\n"
        +"2.sửa sản phẩm"+"\n"
        +"3.xóa sản phẩm" +"\n"
        +"4.hiển thị danh sách sản phẩm"+"\n"
        +"5.tìm kiểm sản phẩm"+"\n"
        +"6.sắp xếp tăng dần"+"\n"
        +"7.sắp xếp giảm dần");

        System.out.println("nhập sự lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        switch (n){
            case 1:{
                AddProduct();
                break;
            }
            case 2:{
                Repair();
                break;
            }
            case 3:{
                Remove();
                break;
            }
            case 4:{
                DisPlay();
                break;
            }
            case 5:{
                Search();
                break;
            }
            case 6:{
                InCrease();
                break;
            }
            case 7:{
                DeCrease();
                break;
            }
            default:
        }
    }

    static ArrayList<Product> arr = new ArrayList<>();

    public static void AddProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.println("Nhập id sản phẩm: ");
        int id = sc.nextInt();

        System.out.println("nhập giá sản phẩm: ");
        Double price = sc.nextDouble();

        Product product = new Product(name,id,price );

        arr.add(product);
        DisPlayMenu();
    }

    public static void Repair(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp id sản phẩm cần sửa: ");
        int id = scanner.nextInt();
        boolean check = false;
        for (int i=0; i<arr.size();i++){
            if(id== arr.get(i).getId()){
                System.out.println("nhập tên cập nhập: ");
                String name = scanner.nextLine();
                System.out.println("nhập giá cập nhâp: ");
                Double price = scanner.nextDouble();

                arr.get(i).setName(name);
                arr.get(i).setPrice((double) price);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("không tìm thấy id sản phẩm cần sửa");
        }
        DisPlayMenu();
    }
    public static void Remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần xóa: ");
        int id = scanner.nextInt();
        int d=-1;
        boolean check = false;
        for (int i=0;i<arr.size();i++){
            if (id==arr.get(i).getId()){
                check=true;
                d=i;
                break;
            }
        }
        if (check){
            arr.remove(d);
        }else {
            System.out.println("không tìm thấy id sản phẩm cần xóa");
        }
        DisPlayMenu();
    }
    public static void DisPlay(){
        for (Product product:arr) {
            System.out.println(product.toString());
        }
        DisPlayMenu();
    }

    public static void InCrease(){
       Collections.sort(arr,new SortInCreasePrice());
       DisPlay();
       DisPlayMenu();
    }

    public static void DeCrease(){
        Collections.sort(arr,new SortPrice());
        DisPlay();
        DisPlayMenu();
    }

    public static void Search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên cần tìm kiếm");
        String name = scanner.nextLine();
        boolean check = false;
        int d =0;
        for (int i=0;i<arr.size();i++){
            if (name.equals(arr.get(i).getName())){
                check=true;
                d=i;
                break;
            }
        }
        if (check){
            System.out.println(arr.get(d).toString());
        }else {
            System.out.println("không tìm thấy tên sản phẩm");
        }
        DisPlayMenu();
    }

    public static void main(String[] args) {
        DisPlayMenu();
    }
}

