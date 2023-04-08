package arrayPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9,3,5,11,13,9};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
        }

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext())
        {
            int key = it.next();
            int value = map.get(key);
            if(value < 2)
                System.out.println("Key : "+key+" value : "+value);
        }


    }
}
