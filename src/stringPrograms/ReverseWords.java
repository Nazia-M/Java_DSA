package stringPrograms;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "Java is very Easy";

        String words[] = str.split("\\s");

        String revStr = "";

        for(int i=0;i<words.length;i++){

            if(i == words.length-1)
                    revStr = words[i] + revStr;
            else
                revStr = " "+ words[i] + revStr;
        }
        System.out.println(revStr);

        String str1 = "Java is very Easy";
        String words1[] = str1.split("\\s");
        for(int a=0;a<words1.length; a++){
            System.out.println(words1[a]);
        }

        String rev = "";

        for(int i=0;i<words1.length; i++){

            String word = words1[i];
            System.out.println("------- word "+word);
            String revWord = "";
            for(int j=word.length()-1 ;j>=0 ;j--)
            {

                System.out.println("word.charAt(j) "+word.charAt(j));
                revWord = revWord + word.charAt(j);
                System.out.println("revWord "+revWord);
            }
            rev = rev +revWord + " ";
            System.out.println("-----------Reversed Word : "+rev+"  ---------");
        }
        System.out.println(rev);


        int num = 54353;
        String str0 = String.valueOf(num);
        System.out.println("str "+str0);

        String str11 = "354353";
        int num1 = Integer.parseInt(str11);
        System.out.println("num1 "+num1);

        String str2 = "354353";
        int num2 = Integer.valueOf(str2);
        System.out.println("num2 "+num2);

        String str3 = "Hello";
        int num3 = Integer.valueOf(str3);
        System.out.println("num3 "+num3);

        try{
            String str4 = "Hello";
            int num4 = Integer.parseInt(str4);
//            System.out.println("num4 "+num4);
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }






    }
}
