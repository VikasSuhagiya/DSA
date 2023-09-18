package Dsa1_Array;

public class P12_Print_all_unique_numbers {
    public static void main(String[] args) {
      int arr[]={1,55,22,66,44,33,44,55,66};

      for (int i=0;i< arr.length;i++){
          boolean isunique=true;
          for (int j=0;j< arr.length;j++){
              if (i!=j && arr[i]==arr[j]){
                  isunique=false;
              }
          }
          if (isunique==true){
              System.out.println(arr[i]);
          }
      }
    }
}
