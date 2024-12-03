package HackerRank;

public class HackerDay2 {

    public static void main(String[] args) {

        String str = "middle-OutzZYXW";
        int k=2;
        String str1 = "";
        char c='A';

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            int chInt = ch;
            System.out.print(chInt);

            if(chInt>=65 && chInt<=90){

                System.out.print(" Char "+ch);
                chInt = chInt+k;
                System.out.print(" | New Char value "+chInt);

                if(chInt >90){
                    chInt = chInt - 90;
                    chInt = 64 + chInt;
                    System.out.print("  | chInt >90 && chInt<=96  "+chInt);
                }

                c = (char)chInt;
                System.out.print(" | New Char "+c);
                System.out.println();
            }
            else if(chInt>=97 && chInt<=122){

                System.out.print(" Char "+ch);
                chInt = chInt+k;
                System.out.print(" | New Char value "+chInt);

                if(chInt > 122){
                    chInt = chInt - 122;
                    chInt = 96+chInt;
                    System.out.print("  | chInt > 122  "+chInt);
                }

                c = (char)chInt;
                System.out.print(" | New Char "+c);
                System.out.println();
            }
            else{
                c = (char)chInt;
            }

            str1 = str1 + c;
            System.out.println(str1);

        }

    }
}
