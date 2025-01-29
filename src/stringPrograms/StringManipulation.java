package stringPrograms;

public class StringManipulation {

    public static void main(String[] args) {

        String str = "hi this is my java code and i am so happy";

        //Get length of Stirng
        System.out.println(str.length());

        //Get character at 11
        System.out.println(str.charAt(11));

        //First occurence
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('i'));

        //Second occurence
        System.out.println(str.indexOf('i', str.indexOf('i')+1));

        //Third occurence
        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i'))+1));

        //Where is java
        System.out.println(str.indexOf("java"));


        //Trim - Removes only starting and ending spaces not between spaces
        String test = "     hello      world   ";
        System.out.println(test.trim());

        //Upper and Lowercase
        String str1 = "all Not Small Letters";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        //replace dob "12-08-1990"  to "12/08/1990"
        String dob = "12-08-1990";
        System.out.println(dob.replace("-", "/"));

        //Replace all spaces with nothing
        String str2 = "     hello      world   ";
        System.out.println(str2.replace(" ",""));




    }
}
