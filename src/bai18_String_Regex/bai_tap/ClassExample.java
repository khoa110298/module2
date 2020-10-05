package bai18_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_REGEX = "^[CAP]+[A-Za-a0-9]";

    public ClassExample() {

    }

    public boolean validata(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
