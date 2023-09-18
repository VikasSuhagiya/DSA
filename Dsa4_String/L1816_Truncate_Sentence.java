package Dsa4_String;

public class L1816_Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        int count=0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                count++;
            }
            if (count==k){
                s=s.substring(0,i);
                break;
            }
        }
        System.out.println(s);
    }
}
