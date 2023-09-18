package Dsa1_Array;

public class P24_Binary_search {
    public static void main(String[] args) {
        int arr[]={1,9,12,4,6,3,2,7,8};
        int left=0,right=arr.length-1;
        int key=2;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==key){
                System.out.println(" value is present " + mid + " Index position ");
                return;
            } else if (key>arr[mid]) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        System.out.println("not present");
    }
}
