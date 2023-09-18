package Dsa9_Recursion;

public class R3_Sum_of_1_to_n_numbers {
    public static void main(String[] args) {
        //Time : o(1)
      int n=5;
      System.out.println(sum(n));
   }

    private static int  sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }

}
