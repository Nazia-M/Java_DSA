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

    }
}
