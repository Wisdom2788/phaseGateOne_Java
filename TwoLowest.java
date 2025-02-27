import java.util.Arrays;

public class TwoLowest {
	
	public static int[] findTheTwoLowestNumbersInAnArray (int[] array) {
		
		int firstLowest = array[0];
		int secondLowest = array[1];
		
		for (int count = 0; count < array.length; count++) {
			if (array[count] < firstLowest) {
				secondLowest = firstLowest;
				firstLowest = array[count];
			} else if (array[count] < secondLowest) {
				secondLowest = array[count];
			}
			
		} return new int[] {firstLowest, secondLowest};  
		
		
	}
	
	public static void main(String... args) {
		
		int array[] = {53, 234, 0, 747, -78, 39, 45, 9};
		System.out.print(Arrays.toString(findTheTwoLowestNumbersInAnArray(array)));
	}
	
	
}