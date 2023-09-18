package Dsa4_String;

import java.util.*;
public class practise {
    public static void main(String[] args) {
        Student s1 = new Student("Vikas",123,1);
        s1.pwd=123;
        System.out.println(s1.name);
        System.out.println(s1.pwd);
        System.out.println(s1.rollno);

        Student s2 = new Student(s1);
        s2.pwd=987;
        System.out.println(s2.name);
        System.out.println(s2.pwd);
        System.out.println(s2.rollno);

    }
}
class Student{
    String name;
    int pwd;
    int rollno;

    Student(Student s1){
        this.name= s1.name;
        this.rollno= s1.rollno;
        this.pwd= s1.pwd;
    }

    public Student(String name, int pwd, int rollno) {
        this.name = name;
        this.pwd = pwd;
        this.rollno = rollno;
    }
}