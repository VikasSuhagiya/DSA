package Dsa3_OOPS;
public class Abstraction {
    public static void main(String[] args) {
//----------------------------------------------------------------------//
//-------------------------------Interface AZG--------------------------//
        SBI sbi = new SBI();
        sbi.DefaultMethod();
        Bank.PrintHello();
        sbi.GetInterestRate();
        HDFC hdfc = new HDFC();
        hdfc.GetInterestRate();
    }
}
interface Bank{
    public void GetInterestRate();
    public static void PrintHello(){
        System.out.println("Hello");
    }
    public default void DefaultMethod(){
        System.out.println("Default");
    }
}

class SBI implements Bank{
    public void GetInterestRate(){
        System.out.println("SBI Interest Rate in:   4%");
    }
}

class HDFC implements Bank{
    public void GetInterestRate(){
        System.out.println("HDFC Interest Rate in:   8%");
    }
}


















//----------------------------------------------------------------------//
//-----------------------Interface ApnaCollege--------------------------//
//        Queen q = new Queen();
//        q.moves();
//        Rook r = new Rook();
//        r.moves();
//        King k = new King();
//        k.moves();
//    }
//}
//
//interface ChessGame{
//    void moves();
//}
//
//class Queen implements ChessGame{
//    public void moves(){
//        System.out.println("Queen Moves:-             up , down , left , right , diagonal - (In all 4 Directions)");
//    }
//}
//
//class Rook implements ChessGame{
//    public void moves(){
//        System.out.println("Rook Moves:-              up , down , left , right");
//    }
//}
//
//class   King implements ChessGame{
//    public void moves(){
//        System.out.println("King Moves:-              up , down , left , right , diagonal - (By 1 Step)");
//    }
//}























//----------------------------------------------------------------------------------//
//----------------------------Abstract Class ApnaCollage----------------------------//
//        Elephant e1= new Elephant();
//        e1.eat();
//        e1.walk();
//        Kangaroo k1= new Kangaroo();
//        k1.eat();
//        k1.walk();
//    }
//}
//abstract class Animal{
//    void eat(){
//        System.out.println("Animal eating");
//    }
//    public abstract void walk();
//}
//
//class Elephant extends Animal{
//    public void walk(){
//        System.out.println("Elephant walking on 4 legs");
//    }
//}
//
//class Kangaroo extends Animal{
//    public void walk(){
//        System.out.println("Kangaroo walking on 2 legs");











//----------------------------------------------------------------------//
//----------------------------1.Abstract Class AZG----------------------------//
//NOTE:-         Abstract class no object kyarey create kari shakato nathi.
//----------------------------------------------------------------------//
//
//        SBI s1 = new SBI(20,"Abc");                            //object
//        s1.GetInterestRate();
//        HDFC h1 = new HDFC(21,"Def");
//        h1.GetInterestRate();
//    }
//}
//
//abstract class Bank{                                                      //Abstract class
//    int age;
//    String name;
//
//    public void printHello(){                                             //Non Abstract Method
//        System.out.println("Hello");
//    }
//    public abstract void GetInterestRate();
//}
//
//class SBI extends Bank{                                                  //bank ni badhi property sbi ni andar avi jai
//    public void GetInterestRate(){
//        System.out.println("Interest Rate is 4%"+"     "+age+"    "+name);
//    }
//    public SBI(int age,String name) {
//        this.age=age;
//        this.name=name;
//    }
//}
//
//class HDFC extends Bank{
//    public void GetInterestRate(){
//        System.out.println("Interest Rate is 8%"+"     "+age+"    "+name);
//    }
//    public HDFC(int age,String name) {
//        this.age=age;
//        this.name=name;
//    }
//}
