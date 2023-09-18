package Dsa4_String;

public class S6_Update_a_character_in_a_string_without_using_replace_function_Sort_string_of_characters {
    public static void main(String[] args) {
        String s1 = "Hello Java";
        char currentword ='H', changeword='p';
        char[] arr =s1.toCharArray();                                                                                            //string ne array ma farevyo che

        for (int i=0;i<s1.length();i++){
            if (arr[i]==currentword){
                arr[i]=changeword;
            }
        }
        s1=new String(arr);
        System.out.println(s1);
    }
}
