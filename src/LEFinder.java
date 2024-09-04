public class LEFinder {
    public static int lEFinder(int[] arrayNumber) {
        if (arrayNumber == null || arrayNumber.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int largest = arrayNumber[0]; // Assume the first element is the largest initially

        // Iterate through the array to find the largest element
        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > largest) {
                largest = arrayNumber[i]; // Update largest if current element is greater
            }
        }

        return largest; // Return the largest element found
    }
}