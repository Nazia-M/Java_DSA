package stringPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class duplicateWordInString {
    public static void main(String[] args) {

        String str = "am I am java am learning java right am";

        String words[] = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){

            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }
            else
                map.put(words[i],1);
        }

        HashMap<String,Integer> map1 = new HashMap<>();
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext())
        {
            String key = it.next();
            int value = map.get(key);

            if(value >=2){
                System.out.print("Key : "+key+" Value : "+value);
                System.out.print(" Duplicate");
                System.out.println();
            }
            else
                System.out.println("Key : " + key + " Value : " + value);

        }


    }
}
