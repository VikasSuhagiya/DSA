package Dsa9_HashMap_HashSet;

import java.util.HashMap;

public class H2_Check_if_pair_with_given_Sum_exists_in_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum =9;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i<arr.length;i++){              //frequency check karva mate aa loop che
            if (hashMap.containsKey(arr[i])){        //1 biji var ave to aa condition true pade and oldvalue 1+1 = 2 thai  atle 1 2 var ave
                int oldValue = hashMap.get(arr[i]);
                hashMap.put(arr[i],oldValue+1);
            }else {
                hashMap.put(arr[i],1);         //put thi value insert thai and 1 means 1 var ave
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] *2 == sum){
                if (hashMap.get(arr[i])>=2){
                    System.out.println("Pair is present");
                    return;
                }
            }else {
                int rem = sum -arr[i];
                if (hashMap.containsKey(rem)){
                    System.out.println("Pair is present");
                    return;
                }
            }
        }
        System.out.println("Pair is not present");
    }
}
