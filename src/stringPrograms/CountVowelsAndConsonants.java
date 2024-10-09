package stringPrograms;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        String str = "Java Programming";
        str = str.toLowerCase();
        int vowels = 0, cons =0;

        for(int i=0;i< str.length();i++){

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'  || str.charAt(i) == 'A'   || str.charAt(i) == 'E') {
                vowels++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                cons++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + cons);

    }
}
