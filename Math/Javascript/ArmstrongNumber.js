function isArmstrongNumber(num) {
  let sum = 0;
  let n = num; // number to a temporary variable

  // Extract each digit and calculate the sum of cubes
  while (n > 0) {
    let digit = n % 10; // Get the last digit
    sum += digit ** 3; // Add the cube of the digit to the sum
    n = Math.floor(n / 10);
  }

  // Check if the sum equals the original number
  return sum === num;
}

// Example usage
const number = 153;
if (isArmstrongNumber(number)) {
  console.log(`${number} is an Armstrong number.`);
} else {
  console.log(`${number} is not an Armstrong number.`);
}
