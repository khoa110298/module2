package bai2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    static boolean soNguyenTo(int number){
        boolean ketQua = false;
        if (number < 2){
            ketQua = false;
        }else if (number == 2){
            ketQua = false;
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i==0){
                    check = false;
                    break;
                }
            }
            if (check == true){
                ketQua = true;
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if (soNguyenTo(i)){
                System.out.print(i + "\t");
            }
        }
    }
}
