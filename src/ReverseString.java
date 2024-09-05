public class ReverseString {

    // Method to manually reverse a string
    public static String reverseString(String str) {
        // Convert the input string to lowercase
        str = str.toLowerCase();

        // Convert the string to a character array
        char[] charArray = str.toCharArray();
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
        String reversed = new String(charArray);

        // Capitalize the first letter of each word
        String[] words = reversed.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}