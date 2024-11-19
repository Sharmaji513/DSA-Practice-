function ReverseNumber(number) {
 
    let reverse= 0;

    while (number > 0) {
        let lastDigit = number % 10; // Get the last digit
        reverse = reverse * 10 + lastDigit; // Add it to the reversed number
        number = Math.floor(number / 10); // Remove the last digit
    }

    return  reverse;
}


let input = 1234;
let output =  ReverseNumber(input);
console.log("Number of digits:", output);