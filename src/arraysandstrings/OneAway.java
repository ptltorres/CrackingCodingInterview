/**
 * There are three types of edits that can be performed on strings: insert a character, remove a character, or replace
 * a character. Given tro strings, writ a function to check if they are on edit (or zero) away.
 *
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */

package arraysandstrings;

public class OneAway {

    public static void execute() {
        String original = "pale";
        String edited = "bake";

        if (isOneEditAway(edited, original))
            System.out.println(edited + " is one edit away from " + original);
        else
            System.out.println("Not one edit away");
    }

    private static boolean isOneEditAway(String edited, String original) {
        if (edited.equals(original))
            return true;

        int commonChars = 0;

        for (int i = 0; i < original.length(); i++) {
            if (contains(edited, original.charAt(i)))
                commonChars++;
        }

        return commonChars == original.length() || commonChars == (original.length() - 1);
    }

    private static boolean contains(String str, char value) {
        for (char c : str.toCharArray())
            if (c == value)
                return true;

        return false;
    }
}
