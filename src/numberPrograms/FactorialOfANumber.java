package numberPrograms;

public class FactorialOfANumber {

    public static void main(String[] args) {

        //factorial Of Number 4 - 1*2*3*4 = 24

        int n=4;
        System.out.println("Factoial : "+factorial(n));
    }

    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }

}
