import java.util.Arrays;

public class AnagramCheck {
    // Method to check if two strings are anagrams
    public boolean anagrams(String str1, String str2) {
        // Normalize both strings
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}