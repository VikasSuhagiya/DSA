package Dsa2_Matrix;

public class M10_Find_the_highest_sum_among_all_columns {
    public static void main(String[] args) {
//        10. Find the highest sum among all columns
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int max=Integer.MIN_VALUE;
        int r=matrix.length;
        int c=matrix[0].length;

        for (int i=0;i<c;i++){
            int sum=0;
            for (int j=0;j<r;j++){
                sum=sum+matrix[j][i];
                if (sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
        }
}
