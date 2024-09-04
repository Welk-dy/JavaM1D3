public class PrimeNumbCheck {
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }
        // Check for factors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not a prime
            }
        }

        return true; // No divisors found, it's a prime
    }
}