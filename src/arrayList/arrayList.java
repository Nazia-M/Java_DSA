package arrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList(5);
        ar.add(10);  // 0 index

        System.out.println(ar.get(2)); //IndexOutOfBoundException - At index 2 no value is added
        ar.add(3, 300);  //Can't skip index it will throw IndexOutOfBoundException


        ar.add(20); // 1 index
        ar.add(30); // 2 index
        ar.add(40); // 3 index
        ar.add(50); // 4 index

        System.out.println(ar);  //Prints all values

        // add method is always used to add value without losing any value
        // set method used to replace value

        ar.add(1, 25);
        System.out.println(ar);  //This will not replace value at 1 index it will add this value to ArrayList

        ar.set(1, 22);
        System.out.println(ar);  //This is replace value

        //Add only Integer data in anchor
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(100);

        //If we want to add any type of data
        ArrayList<Object> empData = new ArrayList<Object>();
        empData.add("Gray");
        empData.add(30);
        empData.add(34.55);
        empData.add('f');
        empData.add(true);








    }
}
