package arrayPrograms;

import java.util.Arrays;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {

        int a[] = {-10,24,50,-88,65464,54,6,2,-7,0};

        int largest = a[0], smallest = a[0];

        for(int i=0;i<a.length-1;i++){
            if(a[i] > largest)
                largest = a[i];
            else if(a[i] < smallest)
                smallest = a[i];
        }
        System.out.println("Given Array "+ Arrays.toString(a));
        System.out.println("Largest "+largest+" smallest "+smallest);
    }
}
