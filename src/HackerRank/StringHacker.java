package HackerRank;

import java.util.Arrays;

public class StringHacker {

    public static void main(String[] args) {

//        String str = "Apple for you?9";
//        char[] tempArray = str.toCharArray();
//        char temp = ' ';
//        int left, right = str.length()-1;
//
//        for(left=0 ; left<right ; left++,right--){
//
//            temp = tempArray[left];
//            tempArray[left] = tempArray[right];
//            tempArray[right] = temp;
//        }
//
//        String str1 = new String(tempArray);
//        System.out.println("String "+str1);


//        String str = "Java is very Easy Pesy";
//
//        String words[] = str.split(" ");
//         int left, right = words.length-1;
//         String tempString = "";
//
//         for(left =0; left <right; left++, right--){
//
//             tempString = words[left];
//             words[left] = words[right];
//             words[right] = tempString;
//
//         }
//
//
//         for(int i=0 ;i< words.length;i++){
//
//             System.out.println(words[i]);
//         }
//        String reversedString = String.join(" ",words);
//        System.out.println(reversedString);



//        String str= "Pramod", nstr="";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Pramod"); //Example word
//
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i); //extracts each character
//            nstr= ch+nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ nstr);


        String str = "Hello";
        String str0 = "Hello";
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str11 = new StringBuffer("Hello");
        StringBuilder str2 = new StringBuilder("Hello");


        if(str.equals(str0))
            System.out.println("str str0");
        if(str.equals(str1))
            System.out.println("str str1");
        if(str1.equals(str11))
            System.out.println("str1 str11");
        if(str1.equals(str2))
            System.out.println("str1 str2");
        if(str.equals(str2))
            System.out.println("str str2");






    }
}
