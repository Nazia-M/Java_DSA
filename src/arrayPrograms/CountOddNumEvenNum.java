package arrayPrograms;

public class CountOddNumEvenNum {
    public static void main(String[] args) {

        int[] arr = {42,645,876,432,76,2,5,22};

        int countOdd=0,countEven=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] % 2 ==0){
                countEven++;
                System.out.println("Even "+arr[i]);
            }

            else{
                countOdd++;
                System.out.println("Odd "+arr[i]);
            }

        }

        System.out.println("countEven "+countEven+ " countOdd "+countOdd);

    }
}
