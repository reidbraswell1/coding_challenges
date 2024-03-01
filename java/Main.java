import java.io.Console;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 13;
        int index = BinarySearch.binarySearch(arr, target);
        System.out.println("Coding Challenge - Binary Search");
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Target = " + target);
        System.out.println("Index of target " + target + " is: " + index);

        System.out.println("Coding Challenge - Luhn Algorithm");
        String cardNum = "4351943610957779";
        boolean valid = LuhnValidation.validateCard(cardNum);
        String response = valid ? ("Card Number " + "'" + cardNum + "'" + " is valid"): ("Card Number " + "'" + cardNum + "'" + " is not valid");
        System.out.println(response);

        cardNum = "4351943610957778";
        valid = LuhnValidation.validateCard(cardNum);
        response = valid ? ("Card Number " + "'" + cardNum + "'" + " is valid"): ("Card Number " + "'" + cardNum + "'" + " is not valid");
        System.out.println(response);

        cardNum = "This is a test";
        valid = LuhnValidation.validateCard(cardNum);
        response = valid ? ("Card Number " + "'" + cardNum + "'" + " is valid"): ("Card Number " + "'" + cardNum + "'" + " is not valid");
        System.out.println(response);
    }
}
