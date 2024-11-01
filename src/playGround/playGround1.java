package playGround;

import java.util.Scanner;

public class playGround1 {
    public static void main(String[] args) {

        //Find last digit of a number
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please Enter a number");
//        int n = scanner.nextInt();
//
//        System.out.println("The number is : "+n);
//
//        System.out.println("Last digit : "+(n%10));

        //Reverse a number, number cna be negative
//        int num = -523423;
//        boolean negative = false;
//        int lastDigit =0, revNum = 0;
//
//        if(num <0 ){
//            negative = true;
//            num = Math.abs(num);
//        }
//
//        while(num > 0){
//            lastDigit = num%10;
//            revNum = (revNum * 10)+lastDigit;
//            num = num/10;
//        }
//
//        System.out.println("RevNumber "+revNum);
//
//        revNum = ~(revNum-1);
//        System.out.println("RevNumber "+revNum);

        //Swap 2 numbers without third number
//        int a = 3, b=5;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a value "+a);
//        System.out.println("b value "+b);

        //Print even numbers between 1 to 10
//        for( int i=1;i<=100;i++){
//            if(i%2 == 0)
//                System.out.println("Even no : "+i);
//        }

        //Number is prime or not
//        int n = 29;boolean isPrime = true;
//
//        if(n==0 || n==1)
//            isPrime = false;
//
//        for(int i=2;i<n;i++){
//            if(n%i == 0)
//                isPrime = false;
//            else
//                isPrime = true;
//        }
//        if(isPrime == true)
//            System.out.println("Prime");
//        else
//            System.out.println("Not prime");

        //All prime number between 1 to 100
//        String  primeNumbers = "";
//        for (int i = 1; i <= 100; i++)
//        {
//            int counter=0;
//            for(int num =i; num>=1; num--)
//            {
//                if(i%num==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter ==2)
//            {
//                primeNumbers = primeNumbers + i + " ";
//            }
//        }
//        System.out.println("Prime numbers 1 to 100 : "+primeNumbers);


//        count digits in a number
//        int n = 4324223, c = 0;
//
//        while(n > 0){
//
//            c++;
//            n = n/10;
//
//
//        }
//        System.out.println(c);


        //FizzBuzz  Print number 1 to 100. For multiples of 3 print “Fizz” instead of the number and for multiples of 5, print “Buzz” for numbers that are multiples of both 3 and 5 print “FizzBuzz”
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else
                System.out.println(i);
        }














    }

}
