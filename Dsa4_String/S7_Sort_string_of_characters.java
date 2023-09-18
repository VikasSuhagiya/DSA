package Dsa4_String;
public class S7_Sort_string_of_characters {
    public static void main(String[] args) {
     String str = "vikas";
     char[] arr = str.toCharArray();

     for (int i=0;i<arr.length-1;i++){
         for (int j=i+1;j<arr.length;j++){
             if (arr[j] < arr[i]){
             char temp = arr[i];
             arr[i] =arr[j];
             arr[j] = temp;
             }
         }
     }
     str = new String(arr);
     System.out.println(str);
    }
}
