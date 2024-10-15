package numberPrograms;

public class lastDigit {
    public static void main(String[] args) {
        int num = 1234567;
        System.out.println("Number is : "+num);

        System.out.println("Last Digit : "+(num%10));

        int lastDigit=0;
        while(num != 0){
            lastDigit = num%10;
            System.out.println("firstDigit : "+lastDigit);
            num = num / 10;
            System.out.println("num : "+num);
        }
        System.out.println("First Number : "+lastDigit);


    }
}
