package castudy.Controllers;

import castudy.Commons.*;
import castudy.Modles.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {

    public static final String FILE_VILLA = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Villa.csv";
    public static final String FILE_ROOM = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Room.csv";
    public static final String FILE_HOUSE = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\House.csv";
    public static final String FILE_CUSTOMER = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Customer.csv";
    public static final String COMNA = ",";

    public static void displayMainMenu() {
        System.out.println("1.Add New Services" + "\n"
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
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInformationCustomers();
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
            case 1: {
                addNewVilla();
                break;
            }
            case 2: {
                addNewHouse();
                break;
            }
            case 3: {
                addNewRoom();
                break;
            }
            case 4: {
                displayMainMenu();
                break;
            }
            case 5: {
                System.exit(0);
            }
        }
    }


    public static void addNewVilla() {
        String id;
        String name;
        String area;
        String cost;
        String numberPeople;
        String rental;
        String standardRoom;
        String convenient;
        String lakeArea;
        String floor;


        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        while (true) {
            System.out.print("nhập id dịch vụ: ");
            id = scanner.nextLine();
            if (validator.isValiId(id)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập tên dịch vụ: ");
            name = scanner.nextLine();
            if (validator.isValiName(name))
                break;
        }
        while (true) {
            System.out.print("nhập diện tích sử dụng: ");
            area = scanner.nextLine();
            if (Validator.isValiArea(area)) {
                break;
            }
        }
        while (true) {
            System.out.print("chi phí thuê: ");
            cost = scanner.nextLine();
            if (validator.isValiCost(cost)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập số người thuê: ");
            numberPeople = scanner.nextLine();
            if (validator.isValiPeople(numberPeople)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập kiểu thuê: ");
            rental = scanner.nextLine();
            if (validator.isValiName(rental))
                break;
        }

        while (true) {
            System.out.print("nhập tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
            if (validator.isValiName(standardRoom))
                break;
        }
        while (true) {
            System.out.print("tiện nghi khác: ");
            convenient = scanner.nextLine();
            if (validator.isValiName(convenient))
                break;
        }
        while (true) {
            System.out.print("nhâp diện tích hồ bơi: ");
            lakeArea = scanner.nextLine();
            if (validator.isValiArea(lakeArea)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập số tầng: ");
            floor = scanner.nextLine();
            if (validator.isValiFloor(floor))
                break;
        }
        Villa villa = new Villa(id, name, area, cost, numberPeople, rental, standardRoom, convenient, lakeArea, floor);
        String line = villa.getId() + COMNA + villa.getNameServices() + COMNA + villa.getArea() + COMNA + villa.getCost() + COMNA
                + villa.getMaxNumber() + COMNA + villa.getRentaltype() + COMNA + villa.getStandardRoom() + COMNA + villa.getConvenient() + COMNA
                + villa.getLakeArea() + COMNA + villa.getNumberFloors();

        try {
            FileWriter fileWriter = new FileWriter(FILE_VILLA, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }

    public static void addNewHouse() {
        String id;
        String name;
        String area;
        String cost;
        String numberPeople;
        String rental;
        String standardRoom;
        String convenient;
        String numberFloors;

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        while (true) {
            System.out.print("nhập id dịch vụ: ");
            id = scanner.nextLine();
            if (validator.isValiId(id)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập tên dịch vụ: ");
            name = scanner.nextLine();
            if (validator.isValiName(name))
                break;
        }
        while (true) {
            System.out.print("nhập diện tích sử dụng: ");
            area = scanner.nextLine();
            if (Validator.isValiArea(area)) {
                break;
            }
        }
        while (true) {
            System.out.print("chi phí thuê: ");
            cost = scanner.nextLine();
            if (validator.isValiCost(cost)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập số người thuê: ");
            numberPeople = scanner.nextLine();
            if (validator.isValiPeople(numberPeople)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập kiểu thuê: ");
            rental = scanner.nextLine();
            if (validator.isValiName(rental))
                break;
        }
        while (true) {
            System.out.print("nhập tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
            if (validator.isValiName(standardRoom))
                break;
        }
        while (true) {
            System.out.print("tiện nghi khác: ");
            convenient = scanner.nextLine();
            if (validator.isValiName(convenient))
                break;
        }
        while (true) {
            System.out.print("nhập số tầng: ");
            numberFloors = scanner.nextLine();
            if (validator.isValiFloor(numberFloors))
                break;
        }
        House house = new House(id, name, area, cost, numberPeople, rental, standardRoom, convenient, numberFloors);
        String line = house.getId() + COMNA + house.getNameServices() + COMNA + house.getArea() + COMNA + house.getCost() + COMNA
                + house.getMaxNumber() + COMNA + house.getRentaltype() + COMNA + house.getStandardRoom() + COMNA + house.getConvenient() + COMNA
                + house.getNumberFloors();

        try {
            FileWriter fileWriter = new FileWriter(FILE_ROOM, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }

    public static void addNewRoom() {
        String id;
        String name;
        String area;
        String cost;
        String numberPeople;
        String rental;
        String free;

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        while (true) {
            System.out.print("nhập id dịch vụ: ");
            id = scanner.nextLine();
            if (validator.isValiId(id)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập tên dịch vụ: ");
            name = scanner.nextLine();
            if (validator.isValiName(name))
                break;
        }
        while (true) {
            System.out.print("nhập diện tích sử dụng: ");
            area = scanner.nextLine();
            if (Validator.isValiArea(area)) {
                break;
            }
        }
        while (true) {
            System.out.print("chi phí thuê: ");
            cost = scanner.nextLine();
            if (validator.isValiCost(cost)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập số người thuê: ");
            numberPeople = scanner.nextLine();
            if (validator.isValiPeople(numberPeople)) {
                break;
            }
        }
        while (true) {
            System.out.print("nhập kiểu thuê: ");
            rental = scanner.nextLine();
            if (validator.isValiName(rental))
                break;
        }
        while (true) {
            System.out.print("Nhâp dịch vụ miễn phí đi kèm: ");
            free = scanner.nextLine();
            if (validator.isValiService(free)) {
                break;
            }
        }
        Room room = new Room(id, name, area, cost, numberPeople, rental, free);
        String line = room.getId() + COMNA + room.getNameServices() + COMNA + room.getArea() + COMNA + room.getCost() + COMNA
                + room.getMaxNumber() + COMNA + room.getRentaltype() + COMNA + room.getFree();

        try {
            FileWriter fileWriter = new FileWriter(FILE_HOUSE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
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
        int d = Integer.parseInt(scanner.nextLine());
        switch (d) {
            case 1: {
                showAllVilla();
                break;
            }
            case 2: {
                showAllHouse();
                break;
            }
            case 3: {
                showAllRoom();
                break;
            }
        }

    }

    public static void showAllVilla() {
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_VILLA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                villaList.add(villa);
            }
            for (Villa villa1 : villaList) {
                villa1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (IOException e) {

        }
        displayMainMenu();
    }

    public static void showAllHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_HOUSE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                houseList.add(house);
            }
            for (House house1 : houseList) {
                house1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }

    public static void showAllRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_ROOM);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                roomList.add(room);
            }
            for (Room room1 : roomList) {
                room1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }

    public static void addNewCustomer() {
        String nameCustomer;
        String dayOfBirth;
        String gender;
        String cmnd;
        String telephoneNumber;
        String email;
        String typeOfCustomer;
        String address;
        Services service = null;

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        while (true) {
            System.out.print("nhập tên khách hàng: ");
            nameCustomer = scanner.nextLine();
            try {
                if (validator.isValiNameCustomer(nameCustomer))
                    break;
            } catch (NameException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập ngày sinh: ");
            dayOfBirth = scanner.nextLine();
            try {
                if (validator.isValiDayOfBirth(dayOfBirth)) {
                    break;
                }
            } catch (BirthdayException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập giới tính: ");
            gender = scanner.nextLine();
            try {
                if (validator.isValiGenderCustomer(gender)) {
                    break;
                }
            } catch (GenderException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.print("nhập chứng minh nhân dân: ");
            cmnd = scanner.nextLine();
            try {
                if (validator.isValiCMND(cmnd)) {
                    break;
                }
            } catch (IdCardException e) {
                e.printStackTrace();
            }
        }
        System.out.print("nhập số điện thoại: ");
        telephoneNumber = scanner.nextLine();

        while (true) {
            System.out.print("nhập email: ");
            email = scanner.nextLine();
            try {
                if (validator.isValiEmaiCustomer(email)) {
                    break;
                }
            } catch (EmailException e) {
                e.printStackTrace();
            }
        }
        System.out.print("nhập loại khách hàng: ");
        typeOfCustomer = scanner.nextLine();
        System.out.print("nhập địa chỉ: ");
        address = scanner.nextLine();

        Customer customer = new Customer(nameCustomer, dayOfBirth, gender, cmnd, telephoneNumber, email, typeOfCustomer, address, service);
        String line = customer.getNameCustomer() + COMNA + customer.getDayOfBirth() + COMNA + customer.getGender() + COMNA +
                customer.getCmnd() + COMNA + customer.getTelephoneNumber() + COMNA + customer.getEmail() + COMNA +
                customer.getTypeOfCustomer() + COMNA + customer.getAddress() + COMNA + customer.getServices();

        try {
            FileWriter fileWriter = new FileWriter(FILE_CUSTOMER, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();

    }

    public static void showInformationCustomers() {
        List<Customer> customerList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(FILE_CUSTOMER);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], null);
                customerList.add(customer);
            }
            for (Customer customer1 : customerList) {
                customer1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayMainMenu();

    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
