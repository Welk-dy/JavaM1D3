public class SumDigits {
        public static int sumDigits(String inputString) {
        int totalSum = 0;

        // Remove non-numeric characters (except for digits)
        String cleanedString = inputString.replaceAll("[^0-9]", "");

        // Iterate through each character in the cleaned string
        for (char c : cleanedString.toCharArray()) {
            // Convert the character to a digit and add to total sum
            totalSum += Character.getNumericValue(c);
        }

        return totalSum; // Return the total sum of digits
    }
}