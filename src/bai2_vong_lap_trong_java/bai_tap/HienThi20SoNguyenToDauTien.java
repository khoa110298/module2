package bai2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    static boolean soNguyenTo(int number) {
        boolean ketQua = false;
        if (number < 2) {
            ketQua = false;
        } else if (number == 2) {
            ketQua = true;
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                ketQua = true;
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20){
            if (soNguyenTo(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
