package Dsa1_Array;

public class P10_Check_if_given_number_is_duplicate_or_not {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,2};
        int value=2;
        int countsum=0;

        for (int i=0;i< arr.length;i++) {
            if (arr[i] == value) {
                countsum = countsum + 1;
            }
        }
            if (countsum>1){
                System.out.println("duplicte");
            }else {
                System.out.println("unique");
            }
    }
}