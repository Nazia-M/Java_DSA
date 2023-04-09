package numberPrograms;

public class PrimeNumBetween1to100 {
    public static void main(String[] args) {
        int a=1,b=100;
        for(int i=a;i<=b;i++)
        {
            if(checkPrime(i))
                System.out.print(i+" " );
        }
    }

    public static boolean checkPrime(int num)
    {
        if(num<2)
            return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
