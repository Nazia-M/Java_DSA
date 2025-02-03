package stringPrograms;

public class ReverseWords {

    public static void main(String[] args) {

//        String str = "Java is very Easy";
//
//        String words[] = str.split("\\s");
//
//        String revStr = "";
//
//        for(int i=0;i<words.length;i++){
//
//            if(i == words.length-1)
//                    revStr = words[i] + revStr;
//            else
//                revStr = " "+ words[i] + revStr;
//        }
//        System.out.println(revStr);

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



    }
}
