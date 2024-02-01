import java.util.Scanner;

public class AddTwoNumbers {

    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Call the addNumbers method
        int sum = addNumbers(number1, number2);

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
