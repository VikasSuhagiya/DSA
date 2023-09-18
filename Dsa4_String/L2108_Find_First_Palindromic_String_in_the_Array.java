package Dsa4_String;

public class L2108_Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};


        for (int i = 0; i < words.length ; i++) {
            String s ="";
            int n=words[i].length()-1;
            for (int j = n; j >=0 ; j--) {
                s+=words[i].charAt(j);
            }
            if (s.equals(words[i])){
                System.out.println(s);
            }
        }





//        for (int i=0;i< words.length;i++){
//            String s="";
//
//            int n= words[i].length()-1;
//            for (int j=n;j>=0;j--){
//                s+=words[i].charAt(j);
//            }
//            if (s.equals(words[i])){
//                System.out.println(s);
//            }
//        }
    }
}
