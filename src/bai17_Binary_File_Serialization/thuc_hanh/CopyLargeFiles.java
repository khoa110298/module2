package bai17_Binary_File_Serialization.thuc_hanh;

        import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.StandardCopyOption;
        import java.util.Scanner;

public class CopyLargeFiles {
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);

            os = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = is.read(buffer)) > 0) {
                os.write(buffer, 0, lenght);

            }
        } finally {
            is.close();
            os.close();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file:");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
//         try {
//             copyFileUsingJava7Files(sourceFile,destFile);
//
//             System.out.println("Copy completed");
//         } catch (IOException e) {
//             System.out.println("Can't copy that file");
//             e.printStackTrace();
//         }
        try {
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Copy completed");
        }

    }
}
