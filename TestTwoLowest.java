import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTwoLowest {
	
	@Test
    public void testfindTheTwoLowestNumbersInAnArray() {
        int[] expected = {-78, 0};
        int[] array = {53, 234, 0, 747, -78, 39, 45, 9};
        
        assertArrayEquals(expected, TwoLowest.findTheTwoLowestNumbersInAnArray(array));
	}
	
	
}
