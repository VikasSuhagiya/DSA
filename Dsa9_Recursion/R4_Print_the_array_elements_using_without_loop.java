package Dsa9_Recursion;

public class R4_Print_the_array_elements_using_without_loop {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
       fact(arr,arr.length-1);
    }
   private static void fact(int arr[],int n){
        if (n==-1){
            return;
        }
        fact(arr,n-1);
       System.out.print(arr[n]+" ");
   }
}