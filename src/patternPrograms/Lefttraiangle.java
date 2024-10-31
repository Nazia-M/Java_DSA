package patternPrograms;

public class Lefttraiangle {
    public static void main(String args[])
    {
        int i, j, n = 4;
        for (i=0; i<4; i++)
        {
            for (j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}