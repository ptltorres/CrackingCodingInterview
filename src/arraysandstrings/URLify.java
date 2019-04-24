package arraysandstrings;

public class URLify {

    public static void execute() {
        String word = "Mr John Smith";

        System.out.println("Before: " + word);
        System.out.println("After: " + URLify(word));
    }

    private static String URLify(String word) {
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ') {
                characters[i] = '%';
            }
        }
        return String.valueOf(characters);
    }
}
