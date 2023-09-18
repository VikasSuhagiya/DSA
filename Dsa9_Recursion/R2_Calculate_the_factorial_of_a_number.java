package Dsa9_Recursion;

public class R2_Calculate_the_factorial_of_a_number {
    public static void main(String[] args) {
        //using recursion
        int n=6;
        System.out.println(fact(n));
    }
   private static int fact(int n){
        if (n==1){       //n==1 atla mate lidho che  k 1 sudhi sum karavvano che
            return 1;
        }
        return n*fact(n-1);
   }
}