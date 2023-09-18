package Dsa4_String;

public class L2185_Counting_Words_With_a_Given_Prefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int count=0;

        for (int i=0;i< words.length;i++){
            if (words[i].startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}
