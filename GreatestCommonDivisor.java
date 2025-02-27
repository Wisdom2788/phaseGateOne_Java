import java.util.Arrays;

public class GreatestCommonDivisor {
 
    public static int greatestDivisorCheck(int number1, int number2) {

        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void main(String... args) {
        int number1 = 16;
        int number2 = 0;

        System.out.println(greatestDivisorCheck(number1, number2));
    }
	
	
}
