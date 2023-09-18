package Dsa4_String;

public class S15_Remove_duplicate_chars_from_string {
    public static void main(String[] args) {
//      # Remove duplicate chars from string
        String s1 = "Hello Vikas";
        char[] arr = s1.toCharArray();
        String s2 = "";

        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(j==i){
                s2 += arr[i];
            }
        }
        System.out.println(s2);
}
}
