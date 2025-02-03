package stringPrograms;

import java.util.Arrays;

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


        //Substring
        String msg = "my order id is 2545435";
        System.out.println(msg.substring(6));
        System.out.println(msg.substring(0,10));
        System.out.println(msg.substring(msg.indexOf("is")+2, msg.length()).trim());

        //Split
        String lang = "java+python_ruby_javascript";
        String lg[] = lang.split("_");

        System.out.println(lg[0]);
        System.out.println(Arrays.toString(lg));

        String top = "xXtestingxXautomationxXseleniumxXapplicationX";
        String tp[] = top.split("xX");
        System.out.println(tp[0].length());  //Showing nothin because itheir is nothing to first left of xX
        System.out.println(tp[1]);
        System.out.println(tp[2]);
        System.out.println(tp[3]);
        System.out.println(tp[4]);
        System.out.println(Arrays.toString(tp));

        String pop = "testing | automation | selenium | LoginPage";
        String p[] = pop.split("|");
        System.out.println(p[0]);  // O/P t java is taking it as OR operator that's why it is not coming. To treat | as normal charactor use escape charactor \\|

        String pop1 = "testing | automation | selenium | LoginPage";
        String p1[] = pop1.split("\\|");
        System.out.println(p1[0]);



    }
}
