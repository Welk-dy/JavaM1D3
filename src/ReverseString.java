public class ReverseString {

    // Method to manually reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // Convert the string to a character array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from both ends of the array
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}