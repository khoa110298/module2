package bai18_String_Regex.thuc_hanh;

public class AccountExampleTest {

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validata(account);
            System.out.println(isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validata(account);
            System.out.println(isvalid);
        }

    }
}
