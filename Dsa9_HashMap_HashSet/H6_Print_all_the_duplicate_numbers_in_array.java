package Dsa9_HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class H6_Print_all_the_duplicate_numbers_in_array {
    public static void main(String[] args) {
        //Hashset method
       int arr[] = {1,2,3,4,1,2};
       HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            if (hashSet.contains(arr[i])){
                System.out.println(arr[i]+" duplicate");
            }else {
                hashSet.add(arr[i]);
            }
        }

        //Hashmap method
      HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                int oldvalue = hashMap.get(arr[i]);
                hashMap.put(arr[i],oldvalue+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        for (Map.Entry me : hashMap.entrySet()){
            if ((int) me.getValue()>1){
                System.out.println(me.getKey()+" value is duplicate ");
            }
        }
    }
}
