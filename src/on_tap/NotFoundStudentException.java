package on_tap;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException() {
        super("sinh viên không tồn tại");
    }
}
