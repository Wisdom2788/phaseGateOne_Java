import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTwoHighest {
	
	@Test
    public void testFindTheTwoLargestNumbersInAnArray() {
        int[] expected = {7890, 567};
        int[] array = {123, 345, 567, 7890, 123, -1};
        
        assertArrayEquals(expected, TwoHighest.findTheTwoLargestNumbersInAnArray(array));
	}
	
	
}
