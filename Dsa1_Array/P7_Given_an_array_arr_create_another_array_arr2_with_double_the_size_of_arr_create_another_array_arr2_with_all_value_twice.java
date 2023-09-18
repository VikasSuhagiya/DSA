package Dsa1_Array;

public class P7_Given_an_array_arr_create_another_array_arr2_with_double_the_size_of_arr_create_another_array_arr2_with_all_value_twice {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int narr[]=new int[arr.length*2];
        int j=0;


        for (int i = 0; i <arr.length ; i++) {
            narr[j]=arr[i];
            j++;
            narr[j]=arr[i];
            j++;
        }
        for (int i = 0; i <narr.length; i++) {
            System.out.print(narr[i]);
        }

    }
}
