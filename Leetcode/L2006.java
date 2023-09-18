package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class L2006 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        int pair = 0;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i< nums.length;i++){
            if (hashMap.containsKey(nums[i]+k)){
                pair=pair+hashMap.get(nums[i]+k);
            }
            if (hashMap.containsKey(nums[i]-k)){
                pair=pair+hashMap.get(nums[i]-k);
            }
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        System.out.println(pair);
    }
}
