package bai5_Access_modifier.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Nam");
        Student s2 = new Student(222,"Hung");
        Student s3 = new Student(333,"Tien");
        s1.display();
        s2.display();
        s3.display();
    }
}

