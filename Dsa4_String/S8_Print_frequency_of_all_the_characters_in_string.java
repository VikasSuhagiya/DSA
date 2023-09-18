package Dsa4_String;

public class S8_Print_frequency_of_all_the_characters_in_string {
    public static void main(String[] args) {
        String s1 = "AddZeroGroup";
        String s=s1.toLowerCase();

        for (char ch='a';ch<='z';ch++) {
            int count=0;
            for (int i=0;i<s.length();i++){
                if (ch==s.charAt(i)){
                    count++;
                }
            }
             if (count>0) {
            System.out.println(ch  + " frequency" + count);
            }
        }








//        # Using ASCII
//        String s1 = "addzero";
//        int[] arr = new int[128];
//
//        for(int i=0; i<s1.length(); i++){
//            int ascii = (int) s1.charAt(i);
//            arr[ascii] = arr[ascii] + 1;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > 0){
//                System.out.println((char) i +":"+ arr[i] +"  ");
//            }
//        }
    }
}