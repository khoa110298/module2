package bai18_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneNumber {
    private static final String NUMBER_REGEX = "^\\(\\d{2}\\)-\\(^0\\d{9}\\)&";

    public TelephoneNumber(){

    }
    public boolean validata(String regex){
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
