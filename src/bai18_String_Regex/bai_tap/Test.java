package bai18_String_Regex.bai_tap;

public class Test {
    public static void main(String[] args) {
        String x = "user@fpt.edu.vn";
        String y = "\\w+@\\w+(\\.\\w+){1,2}";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }


    }
}
