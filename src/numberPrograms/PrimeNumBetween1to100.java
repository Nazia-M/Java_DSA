package numberPrograms;

public class PrimeNumBetween1to100 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(checkPrime(i))
                System.out.print(i+" " );
        }
    }

    public static boolean checkPrime(int num)
    {
        int count = 0;
        if(num == 0 || num == 1)
        {
            return false;
        }
        else
        {
            for (int i=1; i<=num; i++)
            {
                if(num%i == 0)
                    count++;
            }
        }
        if(count == 2)
            return true;
        else
            return false;
    }
}
