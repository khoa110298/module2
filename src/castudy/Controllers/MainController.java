package castudy.Controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("1. Add New Services" + "\n"
                + "2.Show Services" + "\n"
                + "3.Add New Customer" + "\n"
                + "4.Show Information of Customer" + "\n"
                + "5.Add New Booking" + "\n"
                + "6.Show Information of Employee" + "\n"
                + "7.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập sự lựa chọn của bạn: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
                AddNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
        }
    }

    public static void AddNewServices() {
        System.out.println("1.Add New Villa" + "\n"
                + "2.Add New House" + "\n"
                + "3.Add New Room" + "\n"
                + "4.Back to menu" + "\n"
                + "5.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn dịch vụ cần thêm: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1:
        }
    }

    public static void showServices() {
        System.out.println("1.Show all Villa" + "\n"
                + "2.Show all House" + "\n"
                + "3.Show all Room" + "\n"
                + "4.Show All Name Villa Not Duplicate" + "\n"
                + "5.Show All Name House Not Duplicate" + "\n"
                + "6.Show All Name Name Not Duplicate" + "\n"
                + "7.Back to menu" + "\n"
                + "8.Exit");

        Scanner scanner = new Scanner(System.in);
        int d =Integer.parseInt(scanner.nextLine());
        switch (d){
            case 1:
        }

    }

}
