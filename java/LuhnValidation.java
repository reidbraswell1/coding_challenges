import java.util.Arrays;

public class LuhnValidation {

    public static boolean validateCard(String cardNumber) {
        
        int sum = 0;
        String cardNum[] = cardNumber.split("");
        int digits = cardNum.length;
        boolean isSecond = false;

        // Start from the rightmost digit
        for (int i = digits - 1; i >= 0; i--) 
        {
            // If we don't have a number return
            try {
                Integer.parseInt(cardNum[i]);
            }
            catch (NumberFormatException e)
            {
                return false;
            }

            // Convert the rightmost digit to a number
            int d = Integer.parseInt(cardNum[i]);
            
            // Double every second number
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