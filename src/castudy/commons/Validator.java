package castudy.commons;

import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static final String SERVICES_REGEX = "^SV(VL|HO|RO)-\\d{4}$";
    public static final String SERVICES_NAME_REGEX = "^[A-Z]{1}[a-z]*$";
    public static final String CUSTOMER_NAME = "^([A-Z][a-z]*[\\s])*[A-Z][a-z]*$";
    public static final String CUSTOMER_EMAIL = "^\\w{3,}@[a-zA-Z]{3,5}\\.[a-zA-Z]{2,3}$";
    public static final String CUSTOMER_CMND = "^(\\d{3}[\\s]){2}\\d{3}$";
//    public static final String CUSTOMER_DAY_OF_BIRTH = "^((0[1-9])|([1-2][0-9])|(3[0-1]))\\/(([0][1-9])|1[0-2])\\/(19[0-9]{2}|200[0-2])$";
    public static final String CUSTOMER_DAY_OF_BIRTH = "^([0][1-9]|[1-2][0-9]|[3][0-1])[/]([0][1-9]|[1][0-2])[/]\\d{4}$";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValiId(String regex) {
        pattern = Pattern.compile(SERVICES_REGEX);
        matcher = pattern.matcher(regex);

        boolean check = matcher.matches();
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiName(String regex) {
        pattern = Pattern.compile(SERVICES_NAME_REGEX);
        matcher = pattern.matcher(regex);

        boolean check = matcher.matches();
        if (!check) {
            System.out.println("nhập sai mời bạn nhập lại");
        }
        return check;
    }

    public static boolean isValiArea(String area) {
        boolean check = Float.parseFloat(area) > 30;
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiCost(String string) {
        boolean check = Float.parseFloat(string) > 0;
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiPeople(String string) {
        boolean check = Integer.parseInt(string) > 0 && Integer.parseInt(string) < 20;
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiFloor(String string) {
        boolean check = Integer.parseInt(string) > 0;
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiService(String string) {
        String[] strings = new String[]{"massage", "karaoke", "food", "drink", "car"};
        boolean check = Arrays.asList(strings).contains(string);
        if (!check) {
            System.out.println("nhập sai mời nhập lại");
        }
        return check;
    }

    public static boolean isValiNameCustomer(String regex) throws NameException {
        pattern = Pattern.compile(CUSTOMER_NAME);
        matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            throw new NameException();
        }
        return check;
    }

    public static boolean isValiEmaiCustomer(String regex) throws EmailException {
        pattern = Pattern.compile(CUSTOMER_EMAIL);
        matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            throw new EmailException();
        }
        return check;
    }

    public static boolean isValiGenderCustomer(String string) throws GenderException {
        String[] strings = new String[]{"male", "female", "unknow"};
        boolean check = Arrays.asList(strings).contains(string.toLowerCase());
        if (!check) {
            throw new GenderException();
        }
        return check;
    }

    public static boolean isValiCMND(String regex) throws IdCardException {
        pattern = Pattern.compile(CUSTOMER_CMND);
        matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (!check) {
            throw new IdCardException();
        }
        return check;
    }

    public static boolean isValiDayOfBirth(String regex) throws BirthdayException {
        pattern = Pattern.compile(CUSTOMER_DAY_OF_BIRTH);
        matcher = pattern.matcher(regex);
        boolean check = matcher.matches();
        if (check) {
            int birthYear = Integer.parseInt(regex.split("/")[2]);
            int nowYear = Calendar.getInstance().get(Calendar.YEAR);
            if (birthYear < 1900 || nowYear - birthYear < 18) {
                check = false;
                throw new BirthdayException();
            }
        } else {
            throw new BirthdayException();
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(isValiService("massage"));
    }
}

