package bai18_String_Regex.bai_tap;

public class TestClass {
    private static final String[] check = new String[]{"C0318G","M0318G","P0323A"};

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        for (String string : check){
            boolean isvalid = classExample.validata(string);
            System.out.println(isvalid);
        }
    }
}
