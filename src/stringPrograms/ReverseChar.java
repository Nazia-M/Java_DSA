package stringPrograms;

public class ReverseChar {

    public static void main(String[] args) {

        String str = "Hello World !!";
        int len = str.length();
        String rev = "";

        for(int i=len-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
