package Dsa9_Recursion;

public class R8_find_the_sum_of_digits_of_a_number_using_recursion {
    static int sum=0;
    public static void main(String[] args) {
        int n=123456;
        sumofDigit(n);
        System.out.println(sum);
    }
    private static void sumofDigit(int n){
        if (n==0){
            return;
        }
        int m=n%10;
        n=n/10;
        sum=sum+m;
        sumofDigit(n);
    }
}
