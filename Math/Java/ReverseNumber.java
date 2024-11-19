import java.util.Scanner;

public class ReverseNumber {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;

      
        while (number> 0) {
            int lastDigit = number % 10;  // Extract the last digit
            reverse = (reverse * 10) + lastDigit; // Add the digit to the reversed number
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
