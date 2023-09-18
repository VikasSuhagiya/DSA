package Dsa1_Array;

public class P17_Segregate_even_and_odd_numbers {
    public static void main(String[] args) {
        int arr[]={4,5,6,8,79,3,2,15,9,8,4,};                  //ama number start ma even ane end ma odd ave
        int left=0,right= arr.length-1;

        while (left<right){
            if (arr[left]%2==0){
                left++;
            }else if (arr[right]%2==1){
                right--;
            }
            else {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }







//        while (left<right){
//            if (arr[left]%2==0){
//                left++;
//            } else if (arr[right]%2==1) {
//                right--;
//            }else {
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }







    }
}
