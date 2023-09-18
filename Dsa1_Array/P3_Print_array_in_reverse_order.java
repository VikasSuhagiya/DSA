package Dsa1_Array;

public class P3_Print_array_in_reverse_order {
    public static void main(String[] args) {
       int arr[]={9,8,7,6,5,4,3,2,1};

       for (int i= arr.length-1;i>=0;i--){
           System.out.print(arr[i]+" ");
       }
    }
}
