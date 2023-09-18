package Dsa9_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class H7_Print_all_unique_numbers_in_array {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,1};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                int oldvalue = hashMap.get(arr[i]);
                hashMap.put(arr[i],oldvalue+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);

        for (Map.Entry me : hashMap.entrySet()){
            if ((int) me.getValue()==1){
                System.out.println(me.getKey()+" : is Unique number");
            }
        }
    }
}
