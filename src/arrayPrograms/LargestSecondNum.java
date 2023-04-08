package arrayPrograms;

import java.sql.SQLOutput;

public class LargestSecondNum {

    public static void main(String[] args) {
        int arr[]={13,24,54,62,52,21,60};
        int largest=0, secondLargest=0;

        //Linear Search
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
}
