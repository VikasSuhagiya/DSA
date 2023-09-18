package Dsa1_Array;

public class P8_Arr1arr2samesize_arr3alternative {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int arr3[]=new int[arr.length*2];
        int j=0;

        for (int i = 0; i <arr.length ; i++) {
            arr3[j]=arr[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }
        for (int k=0;k< arr3.length;k++){
            System.out.print(arr3[k]+" ");
        }

    }
}
