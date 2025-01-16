public class Task4 {

	public static boolean primeNumberCheck(int number) {
	
	 if (number % 2 == 0) {
         return false;
       }
        
        return true;
	}

public static void main (String... args) {

System.out.println(primeNumberCheck(19));

}
}