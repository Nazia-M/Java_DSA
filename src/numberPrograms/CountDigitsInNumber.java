package numberPrograms;

public class CountDigitsInNumber {
    public static void main(String[] args) {

        int n=166546434, len=0;

        System.out.println("num "+n);
        while(n>0)
        {
            n=n/10;
            len = len+1;
        }
        System.out.println("len "+len);
    }
}
