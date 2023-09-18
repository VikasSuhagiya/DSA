package Dsa1_Array;

public class P16_Find_3rd_largest_element_from_array {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,4,5,65,25,95};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            if (max1<arr[i]){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i] && max1!=arr[i]){
                max3=max2;
                max2=arr[i];
            }
            else if(max3<arr[i] && max1!=arr[i] && max2!=arr[i]){
                max3=arr[i];
            }
        }
        System.out.println(max1+" : is first largest");
        System.out.println(max2+" : is Second largest");
        System.out.println(max3+" : is third largest");
    }
}
