public class VowelCount {
    public static int vowelCount(String input) {
        // Convert the input string to lowercase
        input = input.toLowerCase();
        // Define a string with all lowercase vowels
        String vowels = "aeiou";
        int count = 0;
        // Iterate through each character and check if it's a vowel
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) { // Check if the character is in the vowels string
                count++;
            }
        }
        return count;
    }
}