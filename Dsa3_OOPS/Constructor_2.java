package Dsa3_OOPS;

public class Constructor_2 {
    public static void main(String[] args) {
//-------------------------------------------------------------------------//
//-----------------------------Copy Constructor----------------------------//
//        Student s1 = new Student("vikas","abcdefg",11);
//        Student s2 = new Student(s1);
//        s2.pwd="Abcxyz";
//        System.out.println("Name is :-"+s1.name);
//        System.out.println("Password is :-"+s1.pwd);
//        System.out.println("RollNo is :-"+s1.rollno);
//    }
//}
//
//class Student{
//    String name;
//    String pwd;
//    int rollno;
//
//    Student(Student s1) {                                //Copy constructor
//        this.name = s1.name;
//        this.pwd = s1.pwd;
//        this.rollno = s1.rollno;
//    }
//    Student(String name,String pwd,int rollno) {
//        this.name = name;
//        this.pwd = pwd;
//        this.rollno = rollno;
    }
}




//-----------------------------------------------------------------------//
//----------------------Perameterized Constructor------------------------//
/*
        student s1 = new student("vikas",101,4,'A');                          //Object
        System.out.println("Name is:"+s1.name);
        System.out.println("ID is :"+s1.id);
        System.out.println("Sem is :"+s1.sem);
        System.out.println("Grade is :"+s1.grade);
    }
}
class student{                                                                //Class
    String name;
    int id;
    int sem;
    char grade;

    public student(String name,int id,int sem,char grade) {                    //Parameter is passed.
        this.name = name;
        this.id=id;
        this.sem=sem;
        this.grade=grade;
    }
}
*/













//---------------------------------------------------------------------------//
//----------------------Non Perameterized Constructor------------------------//
/*
        student s1 = new student();
        s1.name="Vikas";
        s1.id=123;
        s1.sem=5;
        s1.grade='A';
    }
}
class student{
    String name;
    int id;
    int sem;
    char grade;

    public student() {
        System.out.println("Constructor is called");
    }
}
 */




