import java.util.Scanner;

public class palindrom {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int originalNumber = number;
    int reverse = 0;

    while (number > 0) {
      int lastDigit = number % 10;
      reverse = reverse * 10 + lastDigit;
      number = number / 10;
    }

    if (originalNumber == reverse) {
      System.out.println(originalNumber + " is a palindrome number");
    } else {
      System.out.println(originalNumber + " is not a palindrome number");
    }
  }
}
