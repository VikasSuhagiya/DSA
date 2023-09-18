package Dsa4_String;

public class S13_Check_if_all_words_are_palindrome {
    public static void main(String[] args) {
        String name = "naman nitlin";
        String[] arr= name.split(" ");

        for (String s : arr){
            if (ispalindrome(s)==false){
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindroe");
    }

    private static boolean ispalindrome(String str) {
        int left=0,right=str.length()-1;

        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}













