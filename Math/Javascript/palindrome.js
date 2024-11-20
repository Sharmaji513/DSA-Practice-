function isPalindrome(number) {

  // Negative numbers are not palindromes
  if (number < 0) {
      return false;
  }

  let originalNumber = number; // Store the original number
  let reverse = 0;

  // Reverse the number
  while (number > 0) {
      let digit = number % 10; 
      reverse = reverse * 10 + digit; 
      number = Math.floor(number / 10); 
  }

  // Check if the reversed number === original number
  return originalNumber === reverse;
}


const input = 121; 
if (isPalindrome(input)) {
  console.log(input + " is a palindrome.");
} else {
  console.log(input + " is not a palindrome.");
}
