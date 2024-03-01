using System;

class LuhnValidation {

    public static bool ValidateCard(String cardNum) {
        
        int sum = 0;
        int digits = cardNum.Length;
        bool isSecond = false;

        // Start from the rightmost digit
        for (int i = digits - 1; i >= 0; i--) 
        {
            int test;
            bool isNumeric = int.TryParse(char.ToString(cardNum[i]), out test);
            if (!isNumeric) {
                return false;
            }

            // Convert the rightmost digit to a number
            int d = cardNum[i] - '0';

            if (isSecond == true)
                d *= 2;

            // If the sum is < 10 sum will be zero.
            sum += d / 10;
            // If the sum is > 9 then sum becomes the previous plus the remainder
            // ie if d = 17 then 17/10 = 1 added to 17 % 10 = 7. Sum should be 8.
            sum += d % 10;

            // Return isSecond to false
            isSecond = !isSecond;
        }
        // If true if the remainder of the sum divided by 10 is zero. 
        return (sum % 10 == 0);
    }
}