public class PhaseGate2Five {
    public static int[] sortDescending(int[] numbers) {
        int length = numbers.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        return numbers;
    }

    public static void main(String[] args) {
        int[] input = {5, 3, 8, 1, 2};
        
        int[] sorted = sortDescending(input);
        System.out.println("Result: ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}


