package Dsa4_String;

public class S14_Check_if_string_have_equal_digits_and_chars {
    public static void main(String[] args) {
        String str = "1n2i2t3i4n";

        int digitcount=0,charcount=0;

        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);

            if (Character.isDigit(c)){
                digitcount++;
            }
            if (Character.isLetter(c)){
                charcount++;
            }
        }
        System.out.println(digitcount==charcount);
    }
}
