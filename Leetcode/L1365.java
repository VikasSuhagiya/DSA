package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class L1365 {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int arr[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);

        for (int i = 0; i < nums.length ; i++) {
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],i);
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            arr[i] = hashMap.get(nums[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
