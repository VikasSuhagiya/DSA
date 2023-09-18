package Dsa3_OOPS;

public class Inheritance_9 {
    public static void main(String[] args) {
//---------------------------------------------------------------------//
//---------------------4.Hybrid  Inheritance-----------------//
//In Java, inheritance is the most important OOPs concept that allows to inherit the properties of a class into another class.
//        Prof p1 = new Prof();
//        p1.name="Vikas";
//        p1.contanct="77778071201";
//        p1.id=221;x
//        p1.salary=50000000;
//        String[] subject= {"maths","computer","html"};
//        p1.subject=subject;
//        p1.Profdetail();
//
//        System.out.println();
//
//        Student s1 = new Student();
//        s1.name="Ruchit";
//        s1.contanct="1287659832";
//        s1.rno=007;
//        int[] marks = {78,89,54,65,65};
//        s1.marks=marks;
//        s1.Studentdetail();
//    }
//}
//
//class Person{
//    String name;
//    String contanct;
//}
//
//class Employe extends Person{
//    int id;
//    int salary;
//}
//class Prof extends Employe{
//    String[] subject;
//
//    public void Profdetail(){
//        System.out.println("name : "+name);
//        System.out.println("contanct : "+contanct);
//        System.out.println("id : "+id);
//        System.out.println("salary : "+salary);
//        System.out.println("subject : "+Arrays.toString(subject));
//    }
//}
//class Student extends Person{
//    int rno;
//    int[] marks;
//
//    public void Studentdetail(){
//        System.out.println("name : "+name);
//        System.out.println("contanct : "+contanct);
//        System.out.println("roll no : "+rno );
//        System.out.println("marks : "+Arrays.toString(marks));
    }
}
























//---------------------------------------------------------------------//
//---------------------3.Hierarchicl Inheritance-----------------//
//When two or more classes inherits a single class, it is known as hierarchical inheritance.
    /*
        Student S1= new Student();
        S1.rNo=32;
        S1.name="Vikas";
        S1.contact="7778071201";
        int[] marks={45 , 56 ,88 ,56 , 99};
        S1.marks = marks;
        S1.StudDetails();
    }
}

class person{
    String name;
    String contact;
}
class Prof extends person{
    String[] subject;
}

class Student extends Person{
    int rNo;
    int[] marks;

    public void StudDetails() {
        System.out.println("stud name : " + name);
        System.out.println("stud contact no : " + contact);
        System.out.println("stud rno : " + rNo);
        System.out.println("stud marks : " + Arrays.toString(marks));
    }
}
*/















//---------------------------------------------------------------//
//---------------------2.Multi Level Inheritance-----------------//
//When there is a chain of inheritance, it is known as multilevel inheritance.

        /*
        Prof p1 = new Prof();
        p1.name="vikas";
        p1.contact="7778071201";
        p1.id=20;
        p1.salary=50000;

        String[] subject= {"English","Maths","Economics"};
        p1.subject=subject;
        p1.detail();
    }
}
class person{
    String name;
    String contact;

}
class Employee extends person{
    int id;
    int salary;


}

class Prof extends Employee{
    String[] subject;


    public void detail(){
        System.out.println("name : "+name);
        System.out.println("phone no : "+contact);
        System.out.println("id no : "+id);
        System.out.println("salary : "+salary);
        System.out.println(Arrays.toString(subject));
    }
}
*/
















//---------------------------------------------------------------//
//-------------------1.Single Level Inheritance-----------------//
//When a class inherits another class, it is known as a single inheritance.
/*
        student s1 = new student();
        s1.name="vikas";
        s1.contanct="7778071201";
        s1.rno='2';
        s1.sem='1';
        જ્યારે વારસાની સાંકળ હોય છે, ત્યારે તેને બહુસ્તરીય વારસા તરીકે ઓળખવામાં આવે છે.

        s1.printdetail();
    }
}

class person{                                 //single inheritance
    String name;
    String contanct;

}

class student extends person{
    int rno;
    int sem;

    public  void  printdetail(){
        System.out.println("name is : "+name);
        System.out.println("contanct : "+contanct);
        System.out.println("rno : "+rno);
        System.out.println("sem : "+sem);
    }
}
 */