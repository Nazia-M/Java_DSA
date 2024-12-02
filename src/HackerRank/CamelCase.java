package HackerRank;

public class CamelCase {
    public static void main(String[] args) {
        String s = "oneTwoThree";

        int count=0;
        if(s.isEmpty() == false){

            count =1;

            for(int i=0;i<s.length();i++){

                char ch = s.charAt(i);
                if(ch >=65 && ch<=90){
                    count++;
                }

            }


        }
        System.out.println(count);

    }
}
