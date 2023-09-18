public class ZLEETCODE_1480_RunningSumof_1d_Array {
    public static void main(String[] args) {
       int nums[] ={1,2,3,4};
       int sum=0;

       for (int i=0;i< nums.length;i++){
           sum=sum+nums[i];
           nums[i]=sum;
       }
        System.out.println(nums);
    }
}

//https://leetcode.com/problems/running-sum-of-1d-array/
//NOTE :-[1,2,3,4]
//       [1+2+3+4]=10
//       [1,3,6,10]=output