package Dsa4_String;
public class S10_Reverse_Words_in_a_String {
    public static void main(String[] args) {
       String name = "Hello Surat";
       String str=" ";
       String[] arr=name.split(" ");
       for (int i=0;i<arr.length;i++){
           str+=reversestring(arr[i]+ " ");
       }
        System.out.println(str);
    }

    private static String reversestring(String s1) {
        char[] arr=s1.toCharArray();
        int left=0,right=arr.length-1;

        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }



//        # Reverse Words in a String
//        String s1 = "Hello Neet Bhalala";
//        String s2 = "";
//        String[] arr = s1.split(" ");
//
//        for(int i = arr.length-1; i>=0; i--){
//            s2 += arr[i] +" ";
//        }
//        System.out.println(s2);


}