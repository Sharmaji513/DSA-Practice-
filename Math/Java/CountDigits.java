import java.util.Scanner;

public class CountDigits {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a number
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int count = 0;
    while (number > 0) {
      count++;
      number = number / 10; // Remove the last digit
    }

    System.out.println("Number of digits: " + count);
  }
}
