package stringPrograms;

public class SwapStringWithoutThirdVar {

    public static void main(String[] args) {

        String a = "Hello", b = "Worlda";

        a = a+b;

        int bStartPoint = 0;
        int bEndPoint = a.length() - b.length();
        int aStartPoint = a.length() - b.length();

        b = a.substring(bStartPoint, bEndPoint);
        a = a.substring(aStartPoint);

        System.out.println("After swapping : "+a+" "+b);


    }
}
