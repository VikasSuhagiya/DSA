public class ZLEETCODE_2006_CountNumberofPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int nums[]={3,2,1,5,4};
        int k=2;
        int count=0;

        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]-nums[j]==k || nums[i]-nums[j]==-k ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
//Note :-{3,2,1,5,4}     ane hamesha greater then > ganvu pachi pachalnu ganvu nahi.
//       k=2
/*
3-2=1    3+2=5              [3,1][3,5]   ni 2 jod bani
2-2=0    2+2=4              [2,4] ni 1 jod bani
1-2=-1   1+2=3              ani ak pan jod bani nai
5-2=3    5+2=7              ani ak pan jod bani nai
4-2=2    4+2=6              ani ak pan jod bani nai
 */