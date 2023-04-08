package arrayPrograms;

import java.sql.SQLOutput;

public class LargestSecondNum {

    public static void main(String[] args) {
        int a[]={13,24,54,62,52,21,60};
        int len = a.length;
        int temp;

        //Linear Search
        for (int i=0; i<len; i++)
        {
            for (int j=i+1; j<len; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[len-2]);
    }
}
