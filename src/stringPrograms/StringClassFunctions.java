package stringPrograms;

import java.util.Arrays;

public class StringClassFunctions {

    public static void main(String[] args) {

        String str = "The rains have started here s !";
        String str1 = "the rains have started here s !";

        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s', 9));  // 1st occurence
        System.out.println(str.indexOf('s', str.indexOf('s')+1)); //2nd occurence

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("hello"));  //-1

        System.out.println(str.equals(str1));  //Case sensitive

        System.out.println(str.equalsIgnoreCase(str1));  //Ignores Case

        System.out.println(str.substring(0,8));
        //System.out.println(str.substring(0,45));

        String str2 = "      Hello     World   ";
        System.out.println(str2.trim());

        System.out.println(str2.replace(" ",""));  //Remove all spaces

        String str3 = "Hello_World_Test_Selenium";
        String a[] = str3.split("_");
        System.out.println(Arrays.toString(a));

        String str4 = "Hello", str5 = "World";
        int x = 100, y=200;
        System.out.println(str4+str5);
        System.out.println(x+y);
        System.out.println(str4+str5+x+y);
        System.out.println(x+y+str4+str5);


    }
}
