public class FibonacciGen{

    // Method to generate Fibonacci sequence up to n terms
    public static int[] fibonacciGen(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array for non-positive n
        }

        // Initialize the array to hold the Fibonacci sequence
        int[] fibonacciSeq = new int[n];

        // Handle the first two terms
        if (n > 0) fibonacciSeq[0] = 0;
        if (n > 1) fibonacciSeq[1] = 1;

        // Generate the remaining terms
        for (int i = 2; i < n; i++) {
            fibonacciSeq[i] = fibonacciSeq[i - 1] + fibonacciSeq[i - 2];
        }

        return fibonacciSeq;
    }
}