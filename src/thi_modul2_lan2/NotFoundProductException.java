package thi_modul2_lan2;

public class NotFoundProductException extends Exception {
    public NotFoundProductException(){
        super("sản phẩm không tồn tại");
    }
}
