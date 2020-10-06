package bai18_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[G|H|I|K|L|M]$";//"^[A|C|P]\\d{4}[G|H|I|K|L|M]$";

    public ClassExample() {

    }

    public boolean validata(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
