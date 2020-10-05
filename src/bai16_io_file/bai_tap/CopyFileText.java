package bai16_io_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public static final String file1 = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\bai16_io_file\\bai_tap\\FileText1";
    public static final String file2 = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\bai16_io_file\\bai_tap\\FileText2";

    public static void copyFile(String f1, String f2) {
        try {
            InputStream inputStream = new FileInputStream(f1);
            OutputStream outputStream = new FileOutputStream(f2);

            byte[] bufer = new byte[1024];
            while (inputStream.read(bufer) > 0) {
                outputStream.write(bufer);
            }
            System.out.println("copy thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFile(file1, file2);
    }
}
