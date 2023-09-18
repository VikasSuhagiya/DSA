package Dsa1_Array;

public class P5_Reverse_an_array_in_memory {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int left=0,right=arr.length-1;

        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int k=0;k<arr.length;k++) {
            System.out.print(arr[k]+" ");
        }






//        int arr[]={1,2,3,4,5};
//        int left=0,right=arr.length-1;
//
//
//        while (left<right){
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
        }
    }

