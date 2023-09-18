package Dsa1_Array;

import java.util.Arrays;

public class P26_Merge_two_sorted_array {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int n1= arr1.length;
        int n2= arr2.length;
        int[] arr = new int[n1+n2];
        int i=0,j=0,k=0;

        while (i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<n1){
            arr[k]=arr1[i];
            i++;
        }
        while (j<n2){
            arr[k]=arr2[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));







//        int n1= arr1.length;
//        int n2= arr2.length;
//        int arr[]=new int[n1+n2];
//        int i=0,j=0,k=0;
//
//        while(i<n1 && j<n2){
//            if (arr1[i]<arr2[j]){
//                arr[k]=arr1[i];
//                i++;
//                k++;
//            }else {
//                arr[k]=arr2[j];
//                j++;
//                k++;
//            }
//        }
//        while (i<n1){
//            arr[k]=arr1[i];
//            i++;
//        }
//        while (j<n2){
//            arr[k]=arr2[j];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
