package stringPrograms;

public class stringReverse {
    public static void main(String[] args) {
        String str = "Apple for you?";
        char[] tempArray= str.toCharArray();
        char temp;
        int left, right = 0;
        right = tempArray.length - 1;

        for (left = 0; left < right; left++, right--)
        {
            temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }
        String reversedString = new String(tempArray);
        System.out.println(reversedString);

    }
}
