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
        int num = -523423;
        boolean negative = false;
        int lastDigit =0, revNum = 0;

        if(num <0 ){
            negative = true;
            num = Math.abs(num);
        }

        while(num > 0){
            lastDigit = num%10;
            revNum = (revNum * 10)+lastDigit;
            num = num/10;
        }

        System.out.println("RevNumber "+revNum);

        revNum = ~(revNum-1);
        System.out.println("RevNumber "+revNum);



    }
}
