public class PhaseGate2four {

    public static int lengthOfLastWord(String words) {
        int letter = words.length() - 1;
        while (letter >= 0 && words.charAt(letter) == ' ') {
            letter--;
        }
        if (letter < 0) {
            return 0;
        }
        int check = letter;
        while (check >= 0 && words.charAt(check) != ' ') {
            start--;
        }
        return letter - check;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   Hello World   "));
        System.out.println(lengthOfLastWord("   fly me   to  the moon  "));
    }
}
