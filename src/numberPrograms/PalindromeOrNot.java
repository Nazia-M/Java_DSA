package numberPrograms;

public class PalindromeOrNot {
    public static void main(String[] args) {

        int n = -12366321,rem,rev=0,temp=n;
        boolean negative = false;

        if(n < 0)
        {
            n = Math.abs(n);
            negative = true;
        }
        while(n>0)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        if(negative==true)
            rev = ~(rev - 1);
        if(temp==rev)
            System.out.println("Palindrome number "+temp);
        else
            System.out.println("Not palindrome"+temp);

    }
}
