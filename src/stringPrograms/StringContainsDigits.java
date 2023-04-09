package stringPrograms;

public class StringContainsDigits {

    public static void main(String[] args) {

        String str = " ";
        boolean isDigit = false;
        char ch = 'a';

        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(Character.isDigit(ch)){
                isDigit = true;
                break;
            }

        }
        if(isDigit == true)
            System.out.println("Contains Digit "+ch);
        else if(str.isEmpty() == true)
            System.out.println("Empty String");
        else
            System.out.println("No Digits");

    }
}
