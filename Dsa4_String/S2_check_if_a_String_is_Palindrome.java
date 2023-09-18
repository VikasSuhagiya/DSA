package Dsa4_String;

public class S2_check_if_a_String_is_Palindrome {
    public static void main(String[] args) {


        //2.check if a String is Palindrome?
        String str = "abcba";
        System.out.println(isPalinderome(str));
    }
    public static boolean isPalinderome(String str){
        for (int i=0;i<str.length();i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;


        //2.check if a String is Palindrome or Not?
//        String str = "naman";
//        isPalindrome(str);
//    }
//
//    private static void isPalindrome(String str) {
//        int left=0,right=str.length()-1;
//        while (left<right){
//            if (str.charAt(left)!= str.charAt(right)){
//                System.out.println("Not palindrome");
//                return;
//            }
//            left++;
//            right--;
//        }
//        System.out.println("palindrome");
    }
}

