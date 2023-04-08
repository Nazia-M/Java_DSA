package arrayPrograms;

public class FindMissingNumber {

    public static void main(String[] args) {

        //1+2+4+5 = 12
        //1+2+3+4+5 = 15
        //15-12 = 3

        int a[] = {-1,0,1,2,3,4,5,7,8,9,10};

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);

        int sum1=0;
        for(int j=a[0];j<=a[a.length-1];j++){
            sum1 += j;
        }
        System.out.println(sum1);

        System.out.println("Missing No is : "+(sum1-sum));
    }
}
