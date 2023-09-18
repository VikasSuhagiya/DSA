package Dsa1_Array;

import java.util.Arrays;

public class P14_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int newarr[]=new int[nums.length];

        for (int i=0;i< nums.length;i++){
            int count=0;
            for (int j=0;j< nums.length;j++){
                if (nums[j]<nums[i]){
                    count++;
                }
            }
            newarr[i]=count;
        }
        System.out.println(Arrays.toString(newarr));
//
//        for (int i=0;i<nums.length;i++){
//            int count=0;
//            for (int j = 0; j < nums.length ; j++) {
//                if (nums[j]<nums[i]){
//                    count++;
//                }
//            }
//            newarr[i]=count;
//        }
//        System.out.println(Arrays.toString(newarr));














//        for (int i=0;i< nums.length;i++){
//            int count=0;
//            for (int j=0;j< nums.length;j++ ){
//                if (nums[j]<nums[i]){
//                    count++;
//                }
//            }
//            newarr[i]=count;
//        }
//        System.out.println(Arrays.toString(newarr));
    }
}
