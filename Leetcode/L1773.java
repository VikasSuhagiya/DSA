package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1773 {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        List<List<String>> mainlst = new ArrayList<>();

        for (String[] item : items) {
            mainlst.add(Arrays.asList(item));
        }

        System.out.println(mainlst);
        String ruleKey = "color", ruleValue = "silver";
        int count = 0;
        System.out.println(countMatches(mainlst ,ruleKey , ruleValue ));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
