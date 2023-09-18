package Dsa4_String;

public class S3_count_number_of_words_in_a_String {
    public static void main(String[] args) {

        String name="Hello, How are you vikas";
        int count=0;
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
        
    }
}
