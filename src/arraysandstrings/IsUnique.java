/**
 * Implement an algorithm to determine if a String has all unique characters.
 */

package arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public void execute() {
        String word = "Chicago";

        if (isUnique(word))
            System.out.println(word + " is unique.");
        else
            System.out.println(word + " is NOT unique.");
    }

    public boolean isUnique(String str) {
        str = str.toLowerCase();
        Set<Character> charsSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (charsSet.contains(currentChar))
                return false;

            charsSet.add(currentChar);
        }

        return true;
    }
}
