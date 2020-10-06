package bai18_String_Regex.bai_tap;

public class TestTelephoneNumber {
    public static void main(String[] args) {
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        boolean isvalid = telephoneNumber.validata("(a8)-(22222222)");
        System.out.println(isvalid);
    }
}
