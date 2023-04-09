package numberPrograms;

public class SwapNumWithoutThirdvar {

    public static void main(String[] args) {

        int x=5, y=10;

        //Implementation 1 : Using + and -
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x : "+x+" y : "+y);

        //Implementation 2 : Using * and /
//        x=x*y;
//        y=x/y;
//        x=x/y;
//        System.out.println("x : "+x+" y : "+y);

        //Implementation 3 : Using XOR ^
//        x=x^y;
//        y=x^y;
//        x=x^y;
//        System.out.println("x : "+x+" y : "+y);

    }
}
