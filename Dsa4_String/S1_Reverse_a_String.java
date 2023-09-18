package Dsa4_String;

public class S1_Reverse_a_String {
    public static void main(String[] args) {
        //1.reverse a String.
        /*
        String s1 = "sakiv";
        for (int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
         */



        //1.reverse a string store array.
        /*
        String s1 = "sakiv";
        char[] arr = s1.toCharArray();                                   //char String ne array ma farve.
        int left=0,right=s1.length()-1;
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        s1=new String(arr);
        System.out.println(s1);
         */


    }
}
