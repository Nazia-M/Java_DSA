package numberPrograms;

public class largestof3Numbers {
    public static void main(String[] args) {


        int a = -500, b=-1000, c = -300;

        int largest = (a>b && a>c) ? a : ( (b>a && b>c) ? b : c );

        System.out.println(largest);


        int x = 506,y=450;
        int largest1 = (x>y) ? x :y;
        System.out.println(largest1);
    }
}
