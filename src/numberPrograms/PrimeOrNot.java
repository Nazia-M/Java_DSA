package numberPrograms;

public class PrimeOrNot {

    public static void main(String[] args) {

        //Number divisible only by 1 and itslef is a prime numer = 2,3,5,7,11,13,17,19,23,29 etc

        int n=25,count=0;

            for (int i=1;i<=n;i++)
            {
                if(n%i == 0)
                    count++;
            }

        if(count == 2)
            System.out.println("Prime "+n);
        else
            System.out.println("Not Prime "+n);

    }
}
