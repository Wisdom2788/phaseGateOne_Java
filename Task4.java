public class CharacterCounter {
    public static void main(String[] args) {
        String word = "Hello World";
        char letter = 'o';
        
        int count = countOccurrences(word, letter);
        System.out.println("The letter '" + letter + "' appears " + count + " times.");
    }

    public static int countOccurrences(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
