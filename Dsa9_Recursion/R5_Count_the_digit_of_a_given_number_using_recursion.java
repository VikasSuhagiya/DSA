package Dsa9_Recursion;

public class R5_Count_the_digit_of_a_given_number_using_recursion {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(fact(n));
    }
    private static int fact(int n){
        if (n==0){
            return 0;
        }
        n=n/10;
        return 1+fact(n);
    }
}
