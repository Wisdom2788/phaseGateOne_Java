public class IntegersDivisibleBy3 {
	
	public static int calculateSumOfIntegersDivisibleBy3(){
		
		int total = 0;
		int counter;
		
		for (counter = 1; counter <= 30; counter++) {
			if (counter % 3 == 0) {
             total += counter;
			}
		} return total;
		
	}
	
	public static void main (String... args) {
		System.out.println(calculateSumOfIntegersDivisibleBy3());
		
	}
	
	
}