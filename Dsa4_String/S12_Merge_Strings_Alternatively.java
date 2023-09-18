package Dsa4_String;

public class S12_Merge_Strings_Alternatively {
    public static void main(String[] args) {
    String s1 ="Hello";
    String s2 ="java";
    String s3 ="";

    for (int i=0;i<s1.length() ||i<s2.length();i++){
        if (i<s1.length()){
            s3+=s1.charAt(i);
        }
        if (i<s2.length()){
            s3+=s2.charAt(i);
        }
    }
        System.out.println(s3);




//        # Merge Strings Alternatively
//        String s1 = "Hloaa";
//        String s2 = "elJv";
//        String s3 = "";
//
//        for(int i=0; i<s1.length() || i<s2.length(); i++){
//            if(i<s1.length()){
//                s3 += s1.charAt(i);
//            }
//            if(i<s2.length()){
//                s3 += s2.charAt(i);
//            }
//        }
//        System.out.println(s3);



    }
}
