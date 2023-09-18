package Dsa3_OOPS;

public class class_object_1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();                   //Object
        p1.Color="blue";
        p1.Type="gel";

        Pen p2 = new Pen();
        p2.Color="black";
        p2.Type="ballPoint";

        p1.printColor();
        p2.printColor();
    }
}

class Pen {                                    //class
    String Color;
    String Type;

    public void Write(){                                         //Method
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.Color);
    }
}