package Dsa4_String;

public class L2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        String[] words ={"alice and bob love leetcode", "i think so too","this is great thanks very much"};
        int index=0;
        int max=Integer.MIN_VALUE;

        for (int i=0;i<words.length;i++){
            String[] arr =words[i].split(" ");
            if (max<arr.length){
                max=arr.length;
                index=i;
            }
        }
        for(int j=index;j<=index;j++){
            System.out.print(words[j]);
        }
        System.out.println(" "+max);
    }
}
