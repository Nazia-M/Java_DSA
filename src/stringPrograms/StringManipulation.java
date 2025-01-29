package stringPrograms;

public class StringManipulation {

    public static void main(String[] args) {

        String str = "hi this is my java code and i am so happy";

        //First occurence
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('i'));

        //Second occurence
        System.out.println(str.indexOf('i', str.indexOf('i')+1));

        //Third occurence
        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i'))+1));

        //Where is java
        System.out.println(str.indexOf("java"));





    }




}
