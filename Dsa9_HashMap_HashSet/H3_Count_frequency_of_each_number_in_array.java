package Dsa9_HashMap_HashSet;

import java.util.HashMap;
//freguency means ak value ketli var ave

public class H3_Count_frequency_of_each_number_in_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            if(hashMap.containsKey(arr[i])){         //1 biji var ave to aa condition true pade and oldvalue 1+1 = 2 thai  atle 1 2 var ave
                int oldvalue = hashMap.get(arr[i]);
                hashMap.put(arr[i],oldvalue+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
    }
}
