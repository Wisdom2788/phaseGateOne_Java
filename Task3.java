public class Task3 {
    
	public static void main(String[] args) {
        String theStatement = "Mommy Ooooo My Body Dey Shake";
        char theLetterToCheck = 'o';
        
        int i = countOccurrences(theStatement,  theLetterToCheck);
        System.out.println("The letter '" +  theLetterToCheck + "' appears " + i + " times.");
    }

    public static int countOccurrences(String theStatement, char  theLetterToCheck) {
        int count = 0;
        for (int i = 0; i < theStatement.length(); i++) {
            if (theStatement.charAt(i) ==  theLetterToCheck) {
                count++;
            }
        }
        return count;
    }
}
