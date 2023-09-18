package Dsa9_Recursion;

public class R9_get_the_largest_element_of_an_array_using_recursion {
    static int ans=0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        fact(arr,arr.length-1);
        System.out.println(ans);
    }
    private static void fact(int[] arr , int n){
        if (n==-1){
            return;
        }
        if (arr[n]>ans){
            ans=arr[n];
        }
        fact(arr,n-1);
    }
}
