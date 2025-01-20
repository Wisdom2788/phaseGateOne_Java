public class PowerOfTwo {
    public static boolean isPowerOfTwoCheck(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number = number / 2;
        }

        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
   
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }
}
