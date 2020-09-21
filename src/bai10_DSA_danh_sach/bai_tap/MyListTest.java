package bai10_DSA_danh_sach.bai_tap;

import java.util.Arrays;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student(){

        }

        public Student(int id,String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"khoa");
        Student b = new Student(2,"tien");
        Student c = new Student(3,"luyen");
        Student d = new Student(4,"cuong");
        Student e = new Student(5,"linh");
        Student f = new Student(6,"khong");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudent = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f,2);
        System.out.println(studentMyList.size());
        System.out.println(studentMyList.get(3).getName());
        System.out.println(studentMyList.indexOf(c));
        System.out.println(studentMyList.indexOf(f));

//        for (int i=0; i< studentMyList.size();i++){
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId() +"\t" + student.getName());
//
//        }
      newStudent = studentMyList.clone();
      newStudent.remove(1);
      for (int i=0;i<newStudent.size();i++){
          System.out.println(newStudent.get(i).getName());
      }
    }
}
