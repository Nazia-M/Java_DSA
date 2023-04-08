package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String arr[] = {"IND","SL","PAK","SL","NEP","PAK","BAN"};

        //Implementation 1 : Using HashMap
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if(map.containsKey(str))
                map.put(str,map.get(str)+1);
            else
                map.put(str,1);
        }
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext())
        {
            String key = it.next();
            int value = map.get(key);
            if(value > 1)
                System.out.println("Key : "+key+" value : "+value);
        }

        //Implementation 2: Using HashSet - Hashset removes duplicate values
        Set<String> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if(set.add(arr[i]) == false)
                System.out.println("Duplicate Element : "+str);
        }

    }
}
