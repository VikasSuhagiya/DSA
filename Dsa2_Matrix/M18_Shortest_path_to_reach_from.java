package Dsa2_Matrix;public class M18_Shortest_path_to_reach_from {
    public static void main(String[] args) {
        //18.Shortest path to reach from [0,0] to [n,n].
        int mat[][] = {
                    {1, 2, 4},
                    {3, 5, 7},
                    {6, 8, 9}};
            int row= mat.length;
            int col = mat[0].length;

            for (int r=0;r<row;r++){
                for (int c=0;c<col;c++){
                     if (r==0 && c==0){
                        continue;
                    } else if (r==0) {
                        mat[r][c]=mat[r][c]+mat[r][c-1];
                    } else if (c==0) {
                        mat[r][c]+=mat[r-1][c];
                    }else {
                        mat[r][c]+=min(mat[r-1][c],mat[r][c-1]);
                    }
                }
            }
            System.out.println(mat[row-1][col-1]);
    }

    public static int min(int a,int b) {
            if (a<b){
                return a;
            }return b;
        }
}
