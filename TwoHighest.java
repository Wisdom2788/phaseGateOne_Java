import java.util.Arrays;

public class TwoHighest {
	
	public static int[] findTheTwoLargestNumbersInAnArray (int[] array) {
		
		int firstLargest = array[0];
		int secondLargest = array[1];
		int count;
		
		for (count = 0; count < array.length; count++) {
			if (array[count] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = array[count];
			} else if (array[count] > secondLargest) {
				secondLargest = array[count];
			}
			
			
		}
		return new int[] {firstLargest, secondLargest};
	}
	
	public static void main (String... args) {
		
		int[] array = {123, 345, 567, 7890, 123, -1};
		System.out.println(Arrays.toString(findTheTwoLargestNumbersInAnArray(array)));
		
	}
}