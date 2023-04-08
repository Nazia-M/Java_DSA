package numberPrograms;

public class ArmstrongNumber {

    public static void main(String[] args) {

//        153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

        int n=1634, mul=0,a,temp, sum=0;
        int len=0, num=n;

        System.out.println("num "+num);
        while(num>0)
        {
            num=num/10;
            len = len+1;
        }
        System.out.println("len "+len);

        temp=n;
        while(n>0)
        {
            a=n%10;
            System.out.print(a+" ");
            n=n/10;
            for(int i=1;i<len-1;i++){
                a = a*a;
            }
            System.out.println("Multiplies a : "+a);
            sum = sum+ a;
            System.out.println(sum+" ");
        }
        if(temp==sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");

    }
}
