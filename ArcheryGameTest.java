import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ArcheryGameTest {
	
	@Test
    public void testgameWelcomeMenu() {
        String expected = """
		 <<--<<--<<-- Welcome to Semicolon ArcheryGame -->>-->>-->>
		 __________________________________________________________
		""";
        assertEquals(expected, ArcheryGame.gameWelcomeMenu());
	}
	
	@Test
    public void testgameWelcomeMenu() {
		
		
	}
}