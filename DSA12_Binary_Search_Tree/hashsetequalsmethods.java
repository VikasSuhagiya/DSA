package DSA12_Binary_Search_Tree;

import java.util.HashSet;
import java.util.Objects;

public class hashsetequalsmethods {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"abc");
        Student1 s2 = new Student1(2,"xyz");
        Student1 s3 = new Student1(1,"abc");
        HashSet<Student1> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        System.out.println(hashSet.size());
    }
}
class Student1{
    int rNo;
    String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return rNo == student.rNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rNo, name);
    }

    public Student1(int rNo, String name) {
        this.rNo = rNo;
        this.name = name;
    }
}
