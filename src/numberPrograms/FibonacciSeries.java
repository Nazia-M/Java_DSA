package numberPrograms;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num=10, n1=0, n2=1, counter=0;

        while(counter < num){

            System.out.print(n1+" ");
            int n3 = n2+n1;
            n1 = n2;
            n2 = n3;
            counter = counter+1;

        }


    }
}
