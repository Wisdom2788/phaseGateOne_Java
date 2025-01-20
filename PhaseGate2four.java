import java.util.Scanner;
public class PhaseGate2four {
	
	public static boolean isPalindrome(int number) {
		Scanner wisdom = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int numberInput = wisdom.nextInt();
		
		if (numberInput % 10 == 0) 
			return false;
		else if (numberInput % 10 == 1) {
			return true;
		}
		
		return false;
	}
	
	public static void main (String... args) {
	 System.out.println(isPalindrome(1211));
	}
}
