package HackerRank;

public class String4 {
    public static void main(String[] args) {

        String A = "java";
        String B = "java";
        /* Enter your code here. Print output to STDOUT. */
        String AS = A, BS  = B;
        int aLen = A.length();  //5
        int bLen = B.length();

        System.out.println(aLen+bLen);

        int ASInt = AS.charAt(1);
        int BSInt = BS.charAt(1);
        if(ASInt > BSInt)
            System.out.println("No");

        String firstAChar = A.substring(0, 1);
        firstAChar = firstAChar.toUpperCase();
        String Asub = A.substring(1, AS.length());
        String AString = firstAChar+Asub;

        String firstBChar = B.substring(0, 1);
        firstBChar = firstBChar.toUpperCase();
        String Bsub = B.substring(1, BS.length());
        String BString = firstBChar+Bsub;


        System.out.println(AString+" "+BString);
    }
}
