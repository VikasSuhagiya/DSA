package Dsa1_Array;

public class P19_Pair_with_sum_present_or_not_Two_pointers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int left=0,right= arr.length-1;
        int value=1;

        while (left<right){
            if (arr[left]+arr[right]==value){
                System.out.println("Value is present");
                return;
            }else if (arr[left]+arr[right]<value){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Not present");
    }
}
