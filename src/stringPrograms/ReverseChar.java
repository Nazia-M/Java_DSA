package stringPrograms;

public class ReverseChar {

    public static void main(String[] args) {

        //Reverse a String
        //Diff btw String andStringBuffer
        //Do we have reverse fuction in String - No, we have in StringBuffer as String is immutable
        String str = "Hello World !!";

        // Implementation 1 :Using for loop
        int len = str.length();
        String rev = "";
        for(int i=len-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        //Implementation 2 :Using StringBuffer class
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());

        String str1 = "Apple for you?";
        String nstr="";

        for (int i=0; i<str1.length(); i++)
        {
            char ch= str1.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);


        String str2 = "java I is very easy";
        String newStr  = "";
        String words[] = str2.split(" ");

        for (int i=0;i<words.length;i++)
        {
            char ch = words[i].charAt(0);
            ch = Character.toUpperCase(ch);
            String subString = words[i].substring(1);
            newStr = newStr + ch + subString + " ";
        }
        System.out.println(newStr);




        String str4 = "Hello maTe!";
        String result ="";
        char ch = ' ';
        for (int i = 0; i < str4.length(); i++)
        {
            if (str4.charAt(i) >= 'A' && str4.charAt(i) <= 'Z')
                ch = (char)(str4.charAt(i) + 32);
            else if (str4.charAt(i) >= 'a' && str4.charAt(i) <= 'z')
                ch = (char)(str4.charAt(i) - 32);
            else
                ch = (char)(str4.charAt(i));

            result = result + ch;
        }
        System.out.println(result);



        char ch1 = 'a';
        int c = ch1;
        System.out.println("ch1 "+ch1+" c "+c);

        char ch2 = (char)c;
        System.out.println("ch2 "+ch2);


    }
}
