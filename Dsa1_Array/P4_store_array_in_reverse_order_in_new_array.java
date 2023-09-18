package Dsa1_Array;

public class P4_store_array_in_reverse_order_in_new_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int newa[]=new int[a.length];
        int j=0;

        for (int i=a.length-1;i>=0;i--){
            newa[j]=a[i];
            j++;
        }
        for (int k=0;k<newa.length;k++){
            System.out.print(newa[k]+" ");
        }
    }
}
