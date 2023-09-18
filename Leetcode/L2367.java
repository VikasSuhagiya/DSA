package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class L2367 {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,9};
        int diff = 2;
        int count=0;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {                   //size count karave
            hashSet.add(nums[i]);
        }
        for (int j = 0; j < nums.length ; j++) {
            if (hashSet.contains(nums[j]+diff) && hashSet.contains(nums[j]+(2*diff))){
//   Note:     (hashSet.contains(4+2) && hashSet.contains(4+(2*2)      count:1  4+2=6 6+2=8
//             (hashSet.contains(5+2) && hashSet.contains(5+(2*2)      count:2  5+2=7 7+2=9
//             (hashSet.contains(6+2) && hashSet.contains(6+(2*2)
//             (hashSet.contains(7+2) && hashSet.contains(7+(2*2)
//             (hashSet.contains(8+2) && hashSet.contains(8+(2*2)
//             (hashSet.contains(9+2) && hashSet.contains(9+(2*2)
                count++;
            }
        }
        System.out.println(count);









        //2nd method
//        int nums[] = {4,5,6,7,8,9};
//        int diff = 2;
//        int count=0;
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = i+1; j < nums.length-1 ; j++) {
//                for (int k = j+1; k < nums.length ; k++) {
//                    if (nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
    }
}
