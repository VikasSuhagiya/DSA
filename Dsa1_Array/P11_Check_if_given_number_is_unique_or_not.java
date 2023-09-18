package Dsa1_Array;
public class P11_Check_if_given_number_is_unique_or_not {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,5,4,2,6,7,8,5,2};
        int countsum=0;
        int value=1;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==value){
                countsum++;
            }
        }
        if (countsum>1){
            System.out.println("Not Unique");
        }else {
            System.out.println("Unique");
        }
    }
}
