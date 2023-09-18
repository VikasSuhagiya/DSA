package Dsa9_Recursion;

public class R6_Reverse_an_integer_number_using_recursion {
    static int rev=0;
    public static void main(String[] args) {
        int n=123456;
        fact(n);
        System.out.println(rev);
    }
    private static void fact(int n){
        if (n==0){
            return;
        }
        int mod = n%10;
        rev = rev*10+mod;
        n=n/10;
        fact(n);
    }
}
