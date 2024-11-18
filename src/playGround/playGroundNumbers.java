package playGround;

public class playGroundNumbers {
    public static void main(String[] args) {

        //First and last digit
//        int num = 656456454, ld=0;
//
//        System.out.println("Last Digit : "+(num%10));
//
//        while(num != 0){
//
//            ld = num%10;
//            num = num/10;
//        }
//        System.out.println("First Digit : "+ld);

        //Remove last digit
//        int num = 4342, ld =0;
//
//        ld = num%10;
//        num = num/10;
//
//        System.out.println("Num "+num);

        //Reverse Number
//        int n= -52433532,ld=0, rev=0;
//        boolean neg = false;
//
//        if(n <0){
//            neg = true;
//            n = Math.abs(n);
//        }
//        while(n != 0){
//
//            ld = n%10;
//            rev = (rev*10)+ld;
//            n = n/10;
//        }
//        System.out.println("Reverse is"+rev);
//
//        if(neg == true);
//        {
//            rev = ~(rev-1);
//        }
//        System.out.println("Neg "+rev);


        //Swap 2 numbers without 3rd number
//        int a = 5, b=3;
//
//        a = a+b;
//        b = a-b;
//        a = a-b;
//
//        System.out.println("a "+a+" b "+b);


        //Print evenn numbers 1 to 10
//        for(int i=1;i<=10;i++){
//            if(i%2 == 0)
//                System.out.println("Even "+i);
//        }


        //Fibo

//        int series= 15, n1 = 0, n2= 1;
//
//        for(int i=0;i<series;i++)
//        {
//            System.out.println("seriea "+n1);
//            int n3 = n1+n2;
//            n1 = n2;
//            n2 = n3;
//
//        }


//        String str = "java is very easy";
//        String[] words  = str.split(" ");
//        String firstUpper  = "";
//        for (int i=0;i<words.length;i++) {
//
//            char c = words[i].charAt(0);
//
//            String sub = words[i].substring(1);
//
//            firstUpper = firstUpper + Character.toUpperCase(c) + sub + " ";
//        }
//        System.out.println(firstUpper);



            int num= 999;
            System.out.println("Armstrong Number up to "+ num + " are: ");
            for(int i=0; i<=num; i++)
                if(isArmstrong(i))
                    System.out.print(i+ ", ");

    }


    static boolean isArmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;
        temp=n;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(n==sum)
            return true;
        else return false;
    }
}
