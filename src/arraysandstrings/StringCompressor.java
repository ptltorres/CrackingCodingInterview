/**
 * This module performs basic string compression using the counts of repeated characters.
 * If the compressed string does not become smaller (length), return the original string.
 *
 * Example Input: aabcccccaaa
 * Example Output: a2b1c5a3
 */

package arraysandstrings;

public class StringCompressor {

    public static void execute() {
        String in = "aaaaaabbbbbbbbcc";
        String out = compress(in);

        System.out.println(in + " turned into " + out);
    }

    private static String compress(String original) {
        StringBuilder compressed = new StringBuilder();
        char currentChar;
        char previousChar = original.charAt(0);
        int count = 1;

        for (int i = 1; i < original.length(); i++) {
            currentChar = original.charAt(i);

            if (currentChar == previousChar) {
                count++;
            } else {
                compressed.append(previousChar).append(count);
                count = 1;
            }

            previousChar = currentChar;
        }

        compressed.append(previousChar).append(count);
        return (compressed.length() < original.length())? compressed.toString() : original;
    }
}
