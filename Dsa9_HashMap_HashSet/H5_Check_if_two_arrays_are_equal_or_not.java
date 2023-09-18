package Dsa9_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class H5_Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={1,2,3,4};
        Map<Integer,Integer> hashMap = new HashMap<>();
        Map<Integer,Integer> hashMap2 = new HashMap<>();

        if (arr.length != arr2.length){
            System.out.println("Not same");
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }

            if (hashMap2.containsKey(arr2[i])){
                hashMap2.put(arr2[i],hashMap2.get(arr2[i])+1);
            }else {
                hashMap2.put(arr2[i],1);
            }
        }

        for(Map.Entry me : hashMap.entrySet()){                   //hashmap ni value check kare
            if (me.getValue()!=hashMap2.get(me.getKey())){        //hashmap2 ni value check kare
                System.out.println("Not same");
                return;
            }
        }
        System.out.println("Same");
    }
}

