let validateCard = (cardNbr) => {
    console.log("--- Begin Function validateCard() ---");

    let sum = 0;
    let isSecond = false;
    let digits = cardNbr.length;

    // Start from the rightmost digit
    for (let i = digits - 1; i >= 0; i--) {
        // Return false if cardNbr[i] is a space or empty string
        if (cardNbr[i] === "" || cardNbr[i] === "") {
            return false;
        }
        // Return false if cardNbr[i] is a letter 
        if (isNaN(cardNbr[i]))
            return false;

        // Convert the rightmost digit to a number
        let d = cardNbr[i];
        console.log("d=", d);

        // Double every second number
        if (isSecond == true)
            d *= 2;
        console.log("d after multiplication ", d);

        // If the sum is < 10 sum will be zero.
        sum += Math.floor(d / 10);
        // If the sum is > 9 then sum becomes the previous plus the remainder
        // ie if d = 17 then 17/10 = 1 added to 17 % 10 = 7. Sum should be 8.
        sum += d % 10;

        // Return isSecond to false
        isSecond = !isSecond;
    }
    // If true if the remainder of the sum divided by 10 is zero. 
    return (sum % 10 == 0);
}

let validateCardDriver = (event) => {
    console.log("--- Begin Function validateCardDriver() ---");
    event.preventDefault();
    let cardNbr = document.getElementById("card-nbr").value;
    let result = document.getElementById("result");
    if(validateCard(cardNbr)) {
        result.innerHTML = "Card Number " + cardNbr + " is valid."
    }
    else {
        result.innerHTML = "Card Number " + cardNbr + " is invalid."
    }
    console.log("Card Nbr = ", cardNbr);
    console.log("--- End Function validateCardDriver() ---");
}

let resetMsg = (event) => {
    console.log("--- Begin Function resetMsg() ---");
    document.getElementById("result").innerHTML="";
    console.log("--- Begin Function resetMsg() ---");
}