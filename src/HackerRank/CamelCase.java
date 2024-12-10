package HackerRank;

public class CamelCase {
    public static void main(StringHacker[] args) {


        //CamelcASE
//        String s = "oneTwoThree";
//
//        int count=0;
//        if(s.isEmpty() == false){
//
//            count =1;
//
//            for(int i=0;i<s.length();i++){
//
//                char ch = s.charAt(i);
//                if(ch >=65 && ch<=90){
//                    count++;
//                }
//
//            }
//
//
//        }
//        System.out.println(count);


        String str = "hackerrank";
        String str1 = "haacckerannk";
        int curr = 0;
        for(int i = 0; i < str1.length(); i++)
            if(curr < str.length() && str1.charAt(i) == str.charAt(curr))
                curr++;
        if(curr == str.length())
            System.out.println("YES");
        else
            System.out.println("NO");




    }
}

