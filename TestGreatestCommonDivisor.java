import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestGreatestCommonDivisor {
	
	@Test
    public void testGreatestDivisorCheck() {
        assertEquals(6, GreatestCommonDivisor.greatestDivisorCheck(18, 24));

        assertEquals(16, GreatestCommonDivisor.greatestDivisorCheck(16, 0));
        assertEquals(20, GreatestCommonDivisor.greatestDivisorCheck(0, 20));

        assertEquals(10, GreatestCommonDivisor.greatestDivisorCheck(10, 10));

        assertEquals(5, GreatestCommonDivisor.greatestDivisorCheck(5, 25));

        assertEquals(1, GreatestCommonDivisor.greatestDivisorCheck(13, 7));
    }
    
	
	
}
