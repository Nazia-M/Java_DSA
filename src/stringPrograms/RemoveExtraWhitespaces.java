package stringPrograms;

public class RemoveExtraWhitespaces {
    public static void main(String[] args) {

        //Implementation 1 : Using replaceAll()
        String str = "how to   do    in  java.  com";
        String newStr = str.replaceAll("\\s+"," ");
        System.out.println("Using replaceAll() : "+newStr);

        //Implementation 2 : Using StringBuffer()
        String str1 = "how to   do    in  java.  com";
        char[] chars = str1.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        }
        System.out.println("Using StringBuffer() : "+sb);


    }
}
