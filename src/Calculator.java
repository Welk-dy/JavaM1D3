public class Calculator {

    public static double calculator(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            case '^':
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}