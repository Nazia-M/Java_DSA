package stringPrograms;

public class SwapStringWithoutThirdVar {

    public static void main(String[] args) {

        String a = "Hello", b = "World";

        System.out.println(a+" "+b);

        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After swapping : "+a+" "+b);


    }
}
