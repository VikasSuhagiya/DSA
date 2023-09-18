package Dsa9_Recursion;

public class R10_check_if_a_number_is_a_prime_number_or_not_using_recursion {
    public static void main(String[] args) { //je value na ak pan bhag no pade te prime number ex:-2,3,5,7,11,19
        System.out.println(primeorNot(11,2));
    }
    public static boolean primeorNot(int number,int i){
        if (number<=2 || i==number){
            return true;
        }
        if (number%i==0){
            return false;
        }
        return primeorNot(number,i+1);
    }
}
