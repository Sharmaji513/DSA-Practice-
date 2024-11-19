function countDigits(number) {
 
    let count = 0;

    while (number > 0) {
        number = Math.floor(number / 10); // Remove the last digit
        count++; 
    }

    return count;
}


let input = 516849;
let digitCount = countDigits(input);
console.log("Number of digits:", digitCount);
