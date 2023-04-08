package stringPrograms;

public class RemoveExtraWhitespaces {
    public static void main(String[] args) {

        String str = "how to   do    in  java.  com";

        String newStr = str.replaceAll("\\s+"," ");

        System.out.println(newStr);
    }
}
