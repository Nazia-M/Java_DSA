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



    }
}
