package stringPrograms;

import java.util.*;

public class RemoveDuplciateCharsFromString {
    public static void main(String[] args) {

//        String str = "this Is the best learning websiTe";
//
//        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
//
//        for(int i=0;i<str.length();i++){
//
//            lhs.add(str.charAt(i));
//        }
//
//        //Travser through Iterator
//        Iterator it = lhs.iterator();
//        while (it.hasNext())
//        {
//            System.out.println( it.next() );
//        }



        //HashSet
//        String str = "geeks for geeks";
//        HashSet<Character> hs = new HashSet<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0;i<str.length();i++)
//        {
//            char ch = str.charAt(i);
//            if (!hs.contains(ch))
//            {
//                sb.append(ch);
//                hs.add(ch);
//            }
//        }
//
//        System.out.println("String "+sb.toString());


        //HashMap
//        String str = "geeks for geeks";
//        Map<Character, Integer> hmap = new HashMap<>();
//        String str1 = "";
//        for (int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if (!hmap.containsKey(ch)) {
//                str1 = str1 + ch;
//                hmap.put(ch, 1);
//            }
//        }
//        System.out.println("Duplicate remove String "+str1);


//        String str = "geek geekig";
//        LinkedHashMap<Character,Integer>  map = new LinkedHashMap();
//
//        for (int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if(map.containsKey(ch))
//            {
//                int value = map.get(ch);
//                map.put(ch, (value+1));
//            }
//            else
//                map.put(ch , 1);
//
//        }
//        Iterator<Character> it = map.keySet().iterator();
//        while(it.hasNext())
//        {
//            char key = it.next();
//            int value = map.get(key);
//
//            if(value == 1 && key != ' ')
//            {
//                System.out.println("Key : "+key+" Value : "+value);
//                break;
//            }
//
//        }

//        String str = "gekin";
//        HashSet<Character> set = new HashSet<>();
//        boolean isDuplciate = false;
//        for (int i = 0; i < str.length(); i++)
//        {
//            char c = str.charAt(i);
//            if (set.contains(c))
//            {
//                System.out.println("Contains duplicate characters "+c);
//                isDuplciate = true;
//                break;
//            }
//            set.add(c);
//        }
//        if(isDuplciate == false)
//            System.out.println("No duplicate characters");




//        String str = "Tutorials Point Welcomes You!! ab";
//        int count = 1;
//        for (int i = 0; i < str.length(); i++)
//        {
//            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
//            {
//                count++;
//            }
//        }
//        System.out.println("Count "+count);


//        String str = "Tutorials Point Welcomes You!! ";
//        String[] arrayStr = str.split(" ");
//        int totalWord = arrayStr.length;
//        System.out.println("Number of words " + totalWord);


//        String str = "     Geeks     for Geeks     ";
//        str = str.replaceAll("\\s", "");
//        System.out.println(str);


//        String s = "    Geeks     for Geeks     ";
//        String a = "";
//
//        for (int i = 0; i < s.length(); i++)
//        {
//            char c = s.charAt(i);
//            if (!Character.isWhitespace(c))
//            {
//                a = a+c;
//            }
//        }
//        System.out.println(a);

        String s = " Hey! Let us learn Java! ";
        System.out.println(s.trim());




    }
}
