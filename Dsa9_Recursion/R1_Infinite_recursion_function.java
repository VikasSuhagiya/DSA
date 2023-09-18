package Dsa9_Recursion;

public class R1_Infinite_recursion_function {
    public static void main(String[] args) {
        func();
    }
    private static void func(){
        sum(10,20);
    }
    private static void sum(int a,int b){
        int c = a+b;
        printc(c);
    }
    public static void printc(int c){
        System.out.println(c);
    }
}
