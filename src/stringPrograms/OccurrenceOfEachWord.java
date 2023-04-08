package stringPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class OccurrenceOfEachWord {
    public static void main(String[] args) {

        String str = "India is my country. India is very Nice and beautiful";
        String arr[] = str.split(" ");

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            if(map.containsKey(word))
                map.put(word,map.get(word)+1);
            else
                map.put(word,1);
        }

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext())
        {
            String key = it.next();
            int value = map.get(key);
            System.out.println("Key : "+key+" value : "+value);
        }
    }
}
