public class LEFinder {
    public static int lEFinder(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int largest = array[0]; // Assume the first element is the largest initially

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }

        return largest; // Return the largest element found
    }
}