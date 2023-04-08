package numberPrograms;

public class SwapNumWithoutThirdvar {

    public static void main(String[] args) {

        int x=5, y=10;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x : "+x+" y : "+y);

    }
}
