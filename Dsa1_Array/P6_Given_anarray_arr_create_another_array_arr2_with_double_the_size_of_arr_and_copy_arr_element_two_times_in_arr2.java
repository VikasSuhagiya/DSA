package Dsa1_Array;

public class P6_Given_anarray_arr_create_another_array_arr2_with_double_the_size_of_arr_and_copy_arr_element_two_times_in_arr2 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int narr[]=new int[arr.length*2];


        for (int i=0;i<arr.length;i++){
            narr[i]=arr[i];
            narr[i+arr.length]=arr[i];
        }

        for (int a=0;a<narr.length;a++){
            System.out.print(narr[a]+ " ");
        }
    }
}
