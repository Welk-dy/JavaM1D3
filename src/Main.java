import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("Enter a digits = ");
        String inputString = scanner.nextLine(); // Read the input token as a string

        // Call the sumDigits method from SumDigits class
        int totalSum = SumDigits.sumDigits(inputString);

        // Print the total sum
        System.out.println("Total sum of digits = " + totalSum);

        // Task 2
        System.out.print("Enter a number to check if it is prime = ");
        int num = scanner.nextInt();

        // Use the PrimeChecker class to check if the number is prime
        boolean pResult = PrimeNumbCheck.isPrime(num);

        // Print the pResult
        if (pResult) {
            System.out.println("The Number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number.");
        }

        // Task 3
        System.out.print("Enter space-separated integers (e.g., 1 2 3 4 5) = ");
        scanner.nextLine();
        String aInput = scanner.nextLine();
        // Split the input string into an array of strings
        String[] inputArray = aInput.split("\\s+");
            // Initialize the integer array with valid numbers
            int[] numbers = new int[inputArray.length];
            int count = 0;
            // Convert the array of strings to an array of integers, skipping empty strings
            for (String str : inputArray) {
                if (!str.trim().isEmpty()) { // Check if the string is not empty
                    try {
                        numbers[count++] = Integer.parseInt(str); // Convert to integer
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input: " + str);
                        return; // Exit if any invalid input is encountered
                    }
                }
            }
            // Resize the numbers array to fit the valid input size
            if (count != numbers.length) {
                int[] validNumbers = new int[count];
                System.arraycopy(numbers, 0, validNumbers, 0, count);
                numbers = validNumbers;
            }
            // Use the LargestElementFinder class to find the largest element
            int largest = LEFinder.lEFinder(numbers);
            // Print the largest element
            System.out.println("The largest element in the array is = " + largest);

        // Task 4
        System.out.print("Enter an expression (e.g., 5 + 3) = ");
        String cInput = scanner.nextLine();

        String[] parts = cInput.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please use the format: (number) (operator) (number)");
            return;
        }
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[2]);
            char operator = parts[1].charAt(0); // Extract the operator

            // Perform the operation
            double cResult = Calculator.calculator(num1, num2, operator);

            // Print the cResult
            System.out.println("Result = " + cResult);

        // Task 5
        System.out.print("Enter a string to reverse = ");
        String rInput = scanner.nextLine();

        // Reverse the string using the ReverseString class
        String reversed = ReverseString.reverseString(rInput);

        System.out.println("Reversed String: " + reversed);

        // Close the Scanner
        scanner.close();
    }
}