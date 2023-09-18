package Leetcode;

import java.util.HashSet;

public class L771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        HashSet<Character> hashSet = new HashSet<>();
        int count=0;

        for(int i=0;i<jewels.length();i++){
            hashSet.add(jewels.charAt(i));
        }
        for (int i = 0; i <stones.length() ; i++) {
            if (hashSet.contains(stones.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

    }
}
