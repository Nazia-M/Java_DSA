package numberPrograms;

public class SumOfDigits {
    public static void main(String[] args) {

        int n= 45635,ld=0,sum=0;

        while(n != 0){
            ld = n%10;
            sum = sum +ld;
            n = n/10;
        }
        System.out.println("Sum :"+sum);
    }
}
