import java.util.Arrays;

public class LowestAndHighest {
	
	public static int[] findTheHighestAndLowestElementsOfAnArray (int[] array) {
		
		int highest = array[0];
		int lowest = array[1];
		int count;
		
		for (count = 0; count < array.length; count++) {
			if (array[count] > highest) {
				highest = array[count];
			} else if (array[count] < lowest) {
				lowest = array[count];
			}
			
		} return new int[] {highest, lowest};
		
		
	}
	
	public static void main (String... args) {
		int[] array = {646, 78, 87, 464, 345, 788, 234,};
		System.out.println(Arrays.toString(findTheHighestAndLowestElementsOfAnArray(array)));
	}
	
	
}