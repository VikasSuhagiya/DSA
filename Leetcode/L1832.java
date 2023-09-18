package Leetcode;

import java.util.HashSet;

public class L1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i <sentence.length() ; i++) {
            hashSet.add(sentence.charAt(i));
        }
        System.out.println(hashSet.size()==26);
    }
}
//Note: aa program ma akhi abcd avi jai to true a to z ma total 26 character ave.
//character double var ave to chale and ocho ave to false print thai
//hashset ma unique value j ave.