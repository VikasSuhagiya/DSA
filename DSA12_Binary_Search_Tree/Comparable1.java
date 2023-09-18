package DSA12_Binary_Search_Tree;

import java.util.*;

public class Comparable1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("aa",45,"surat");
        students[1] = new Student("bb",84,"vadodara");
        students[2] = new Student("cc",96,"rajkot");
        students[3] = new Student("dd",25,"goa");
        Arrays.sort(students);
        for (Student s : students){
            System.out.println(s.marks);
        }
    }
}
//comparable
class Student implements Comparable<Student>{
    String name;
    int marks;
    String city;

    public Student(String name, int marks,String city) {
        this.name = name;
        this.marks = marks;
        this.city=city;
    }

    @Override
    public int compareTo(Student o){
        if (this.marks>o.marks){
            return 1;
        } else if (this.marks<o.marks) {
            return -1;
        }
        return 0;
    }

    //city line ma alphabet pramane avi jai
//    public int compareTo(Student o) {
//        if (this.city.compareTo(o.city)>0){
//            return 1;
//        } else if (this.city.compareTo(o.city)<0) {
//            return -1;
//        }
//        return 0;
//    }
}
