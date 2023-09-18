package Dsa1_Array;

public class P1_Count_odd_even_in_array {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int odd=0,even=0;

        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("odd      "+ odd);
        System.out.println("Even     "+ even);




//        int arr[]={1,5,4,7,8,9,6,3,4,5};
//        int odd=0;int even=0;
//
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]%2==0){
//                even++;
//            }else {
//                odd++;
//            }
//        }
//        System.out.println(" even "+even+" odd "+odd);
    }
}
