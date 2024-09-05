public class SecondSmallestFinder {

    // Method to find the second smallest element in an array
    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        // Initialize the smallest and second smallest to maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                // Update second smallest to be the previous smallest
                secondSmallest = smallest;
                // Update smallest to the new minimum
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                // Update second smallest if num is between smallest and second smallest
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("There is no second smallest element in the array.");
        }

        return secondSmallest;
    }
}