package castudy.controllers;

import castudy.commons.*;
import castudy.modles.*;

import java.io.*;
import java.util.*;

public class MainController {

    public static final String FILE_VILLA = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Villa.csv";
    public static final String FILE_ROOM = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Room.csv";
    public static final String FILE_HOUSE = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\House.csv";
    public static final String FILE_CUSTOMER = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Customer.csv";
    public static final String FILE_BOOKING = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\Data\\Booking.csv";
    public static final String FILE_EMPLOYEE = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\data\\Employee.csv";
    public static final String FILE_EMPLOYEEPROFILE = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\castudy\\data\\EmployeeProfile.csv";
    public static final String COMNA = ",";

    public static void displayMainMenu() {
        System.out.println("1.Add New Services" + "\n"
                + "2.Show Services" + "\n"
                + "3.Add New Customer" + "\n"
                + "4.Show Information of Customer" + "\n"
                + "5.Add New Booking" + "\n"
                + "6.Show Information of Employee" + "\n"
                + "7.Show Custmer Cinema 4D" + "\n"
                + "8.Search Employee Profile" + "\n"
                + "9.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập sự lựa chọn của bạn: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
                addNewServices();
                displayMainMenu();
                break;
            }
            case 2: {
                showServices();
                displayMainMenu();
                break;
            }
            case 3: {
                addNewCustomer();
                displayMainMenu();
                break;
            }
            case 4: {
                showInformationCustomers();
                displayMainMenu();
                break;
            }
            case 5: {
                addNewBooking();
                displayMainMenu();
                break;
            }
            case 6: {
                showInformationOfEmployee();
                displayMainMenu();
                break;
            }
            case 7: {
                showCustomerCinema4D();
                displayMainMenu();
                break;
            }
            case 8: {
                searchEmployeeProfile();
                displayMainMenu();
                break;
            }
            case 9: {
                System.exit(0);
            }

        }
    }

    public static void searchEmployeeProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.add New Employee Profile" + "\n" + "2.show Employee Profile");
        System.out.print("nhập sự lựa chon của bạn: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
                addNewEmployeeProfile();
                break;
            }
            case 2: {
                showEmployeeProfile();
                break;
            }
        }

    }

    public static void addNewEmployeeProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập id nhân viên: ");
        String idEmployee = scanner.nextLine();
        System.out.print("nhập tên nhân viên: ");
        String nameEmployee = scanner.nextLine();
        System.out.print("nhập tuổi nhân viên: ");
        String ageEmployee = scanner.nextLine();
        System.out.print("nhập địa chỉ nhân viên: ");
        String addressEmployee = scanner.nextLine();

        EmployeeProfile employeeProfile = new EmployeeProfile(new Employee(idEmployee, nameEmployee, ageEmployee, addressEmployee));
        String line = employeeProfile.getEmployee().getIdEmployee() + COMNA + employeeProfile.getEmployee().getNameEmployee() + COMNA +
                employeeProfile.getEmployee().getAge() + COMNA + employeeProfile.getEmployee().getAddressEmployee();

        try {
            FileWriter fileWriter = new FileWriter(FILE_EMPLOYEEPROFILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showEmployeeProfile() {
        Stack<Employee> employeeStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader(FILE_EMPLOYEEPROFILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                employee = new Employee(temp[0], temp[1], temp[2], temp[3]);
                employeeStack.add(employee);
            }

            System.out.print("nhâp id tìm kiếm: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            Employee employee1 = null;
            while (!employeeStack.isEmpty()) {
                employee1 = employeeStack.peek();
                int idEmployee = Integer.parseInt(employeeStack.pop().getIdEmployee());
                if (id == idEmployee) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("id nhân viên tìm không có trong hồ sơ");
            } else {
                System.out.println(employee1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showCustomerCinema4D() {
        Queue<Customer> customerQueue = new LinkedList<>();

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
            customerQueue.add(customerList.get(3));
            customerQueue.add(customerList.get(1));
            customerQueue.add(customerList.get(4));
            while (!customerQueue.isEmpty()) {
                System.out.println(customerQueue.poll());
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void showInformationOfEmployee() {

        Map<Integer, Employee> customerMap = new TreeMap<>();

        try {
            FileReader fileReader = new FileReader(FILE_EMPLOYEE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                employee = new Employee(temp[0], temp[1], temp[2], temp[3]);
                customerMap.put(Integer.parseInt(employee.getIdEmployee()), employee);
            }
            for (Map.Entry<Integer, Employee> entry : customerMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void addNewServices() {
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
            FileWriter fileWriter = new FileWriter(FILE_HOUSE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewRoom() {
        String id;
        String name;
        String area;
        String cost;
        String numberPeople;
        String rental;
        String nameFreeService;
        String unit;
        String price;
        FreeService free;

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
            System.out.print("nhâp tên dịch vụ đi kèm: ");
            nameFreeService = scanner.nextLine();
            if (validator.isValiService(nameFreeService)) {
                break;
            }
        }
        System.out.print("nhập đơn vị: ");
        unit = scanner.nextLine();
        System.out.print("nhập giá tiền: ");
        price = scanner.nextLine();
        free = new FreeService(nameFreeService, unit, price);


        Room room = new Room(id, name, area, cost, numberPeople, rental, free);
//            System.out.print("Nhâp dịch vụ miễn phí đi kèm: ");
//            free = scanner.nextLine();
//            if (validator.isValiService(free)) {
//                break;
//            }
//        }
//        Room room = new Room(id, name, area, cost, numberPeople, rental, free);
        String line = room.getId() + COMNA + room.getNameServices() + COMNA + room.getArea() + COMNA + room.getCost() + COMNA
                + room.getMaxNumber() + COMNA + room.getRentaltype() + COMNA + room.getFreeService().getNameFreeService() + COMNA
                + room.getFreeService().getUnit() + COMNA + room.getFreeService().getPrice();

        try {
            FileWriter fileWriter = new FileWriter(FILE_ROOM, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
            case 4: {
                showAllNameVillaNotDuplicate();
                break;
            }
            case 5: {
                showAllNameHouseNotDuplicate();
                break;
            }
            case 6: {
                showAllNameRoomNotDuplicate();
                break;
            }
            case 7: {
                displayMainMenu();
                break;
            }
            case 8: {
                System.exit(0);
            }
        }

    }

    public static void showAllNameRoomNotDuplicate() {
        List<Room> roomList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(FILE_ROOM);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeService(temp[6], temp[7], temp[8]));
                roomList.add(room);
            }
            Set<String> roomTreeSet = new TreeSet<>();
            for (Room room1 : roomList) {
                roomTreeSet.add(room1.getNameServices());
            }
            for (String string : roomTreeSet) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        List<House> houseList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(FILE_HOUSE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMNA);
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                houseList.add(house);
            }
            Set<String> houseTreeSet = new TreeSet<>();
            for (House house1 : houseList) {
                houseTreeSet.add(house1.getNameServices());
            }
            for (String string : houseTreeSet) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllNameVillaNotDuplicate() {
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
            Set<String> villaTreeSet = new TreeSet<>();
            for (Villa villa1 : villaList) {
                villaTreeSet.add(villa1.getNameServices());
            }
            for (String string : villaTreeSet) {
                System.out.println(string);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            for (int i = 0; i < villaList.size(); i++) {
                System.out.print(i + 1 + ": ");
                villaList.get(i).showInfor();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (IOException e) {

        }
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
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeService(temp[6], temp[7], temp[8]));
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
            try {
                System.out.print("nhập tên khách hàng: ");
                nameCustomer = scanner.nextLine();
                if (validator.isValiNameCustomer(nameCustomer))
                    break;
            } catch (NameException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                System.out.print("nhập ngày sinh: ");
                dayOfBirth = scanner.nextLine();
                if (validator.isValiDayOfBirth(dayOfBirth)) {
                    break;
                }
            } catch (BirthdayException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                System.out.print("nhập giới tính: ");
                gender = scanner.nextLine();
                if (validator.isValiGenderCustomer(gender)) {
                    break;
                }
            } catch (GenderException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                System.out.print("nhập chứng minh nhân dân: ");
                cmnd = scanner.nextLine();
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
            try {
                System.out.print("nhập email: ");
                email = scanner.nextLine();
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
            Collections.sort(customerList);
            for (int i = 0; i < customerList.size(); i++) {
                System.out.print(i + 1 + ": ");
                customerList.get(i).showInfor();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewBooking() {
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
            Collections.sort(customerList);
            for (int i = 0; i < customerList.size(); i++) {
                System.out.print(i + 1 + ": ");
                customerList.get(i).showInfor();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("chọn khách hàng: ");
        int numberCustomer = Integer.parseInt(scanner.nextLine());
        customerList.get(numberCustomer - 1).showInfor();

        System.out.println("1.Booking Villa" + "\n"
                + "2.Booking House" + "\n"
                + "3.Booking Room");

        System.out.print("chọn dịch vụ: ");
        int d = Integer.parseInt(scanner.nextLine());

        switch (d) {
            case 1: {
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
                    for (int i = 0; i < villaList.size(); i++) {
                        System.out.print(i + 1 + ": ");
                        villaList.get(i).showInfor();
                    }

                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    e.printStackTrace();
                } catch (IOException e) {

                }
                System.out.print("chọn loại Villa: ");
                int numberVilla = Integer.parseInt(scanner.nextLine());
                villaList.get(numberVilla - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(villaList.get(numberVilla - 1));

                try {
                    String line = customerList.get(numberCustomer - 1).toString();
                    FileWriter fileWriter = new FileWriter(FILE_BOOKING, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
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
                    for (int i = 0; i < houseList.size(); i++) {
                        System.out.println(i + 1 + ": ");
                        houseList.get(i).showInfor();
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("chọn loại House: ");
                int numberHouse = Integer.parseInt(scanner.nextLine());
                houseList.get(numberHouse - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(houseList.get(numberHouse - 1));

                String line = customerList.toString();
                try {
                    FileWriter fileWriter = new FileWriter(FILE_BOOKING, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3:
                List<Room> roomList = new ArrayList<>();

                try {
                    FileReader fileReader = new FileReader(FILE_ROOM);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    Room room;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(COMNA);
                        room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeService(temp[6], temp[7], temp[8]));
                        roomList.add(room);
                    }
                    for (int i = 0; i < roomList.size(); i++) {
                        System.out.print(i + 1 + ": ");
                        roomList.get(i).showInfor();
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("chọn loại Room: ");
                int numberRoom = Integer.parseInt(scanner.nextLine());
                roomList.get(numberRoom - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(roomList.get(numberRoom - 1));

                String line = customerList.toString();
                try {
                    FileWriter fileWriter = new FileWriter(FILE_BOOKING, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
