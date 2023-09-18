package Dsa1_Array;

public class P25_Reverse_a_number {
    public static void main(String[] args) {
      int n=1934;
      int reverse=0;
      int mod;


      while (n>0){
          mod=n%10;
          reverse=reverse*10+mod;
          n=n/10;
      }
        System.out.println(reverse);
    }
}
