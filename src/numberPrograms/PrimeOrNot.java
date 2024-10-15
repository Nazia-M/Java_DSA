package numberPrograms;

public class PrimeOrNot {

    public static void main(String[] args) {

        //Number divisible only by 1 and itslef is a prime numer = 2,3,5,7,11,13,17,19,23,29 etc

        int n=2, flag =0;
        if(n == 0 || n == 1)
        {
            flag =1;
        }
        else
        {
            for (int i=2;i<n;i++)
            {
                if(n%i == 0)
                    flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("Prime "+n);
        else
            System.out.println("Not Prime "+n);

    }
}
