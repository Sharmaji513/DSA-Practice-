public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int n = num; 

    
        while (n > 0) {
            int digit = n % 10; 
            sum += Math.pow(digit, 3); // Add the cube of the digit to the sum
            n = n / 10; 
        }

        // Check if the sum equals the original number
        return sum == num;
    }
}
