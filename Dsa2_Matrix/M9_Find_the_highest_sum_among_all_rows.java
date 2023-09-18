package Dsa2_Matrix;

public class M9_Find_the_highest_sum_among_all_rows {
    public static void main(String[] args) {
        //9. Find the highest sum among all rows
        int matrix[][]={{1,2,3},
                        {4,5,60},
                        {7,8,9}};
        int max=Integer.MIN_VALUE;
        int r=matrix.length;
        int c=matrix[0].length;


        for (int i=0;i<r;i++){
            int sum=0;
            for (int j=0;j<c;j++){
                sum=sum+matrix[i][j];
                if (sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
