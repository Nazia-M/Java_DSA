package stringClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.SortedMap;

public class OccurenceOfEachChar {

    public static void main(String[] args) {

        String str = "iamharry";

        char arr[] = str.toCharArray();

        //HashMap gives different outcome every time you run
        //LinkedHashMap - Maintains insertion order
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        Iterator<Character> it = map.keySet().iterator();
        while(it.hasNext())
        {
            char key = it.next();
            int value = map.get(key);
            System.out.println("Key : "+key+" value : "+value);
        }





    }
}
