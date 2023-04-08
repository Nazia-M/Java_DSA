package stringPrograms;

public class RemoveSpecialChars {
    public static void main(String[] args) {

        String str = "^%$&^*abc876867>?{654+_";

        //Regular Expression: [^a-zA-Z0-9]

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

    }
}
