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
        int x = Integer.parseInt(scanner.nextLine());

        switch (x) {
            case 1: 
        }
    }
}
