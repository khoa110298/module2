package bai16_io_file.bai_tap;

import java.io.*;

public class CopyFile {
    public static final String file1 = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\bai16_io_file\\bai_tap\\FileText1";
    public static final String file2 = "D:\\CodeGym\\CO320G1-NguyenKhoa\\module2\\src\\bai16_io_file\\bai_tap\\FileText2";


    public static void copyFile() {
        try {
            FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line ;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedReader.close();
                bufferedWriter.close();
            }
            System.out.println("copy thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        copyFile();
    }
}
