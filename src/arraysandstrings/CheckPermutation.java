package arraysandstrings;

public class CheckPermutation {

    public static void execute() {
        String s1 = "abc";
        String s2 = "cab";

        if (isPermutationOf(s1, s2))
            System.out.println(s1 + " is a permutation of " + s2);
        else
            System.out.println(s1 + " is NOT a permutation of " + s2);
    }

    private static boolean isPermutationOf(String is, String of) {
        if (is.length() != of.length())
            return false;

        char[] chars = of.toCharArray();

        for (int i = 0; i < is.length(); i++) {
            if (!contains(chars, is.charAt(i)))
                return false;
        }

        chars = is.toCharArray();

        for (int i = 0; i < of.length(); i++) {
            if (!contains(chars, of.charAt(i)))
                return false;
        }

        return true;
    }

    private static boolean contains(char[] array, char value) {
        for (char c : array)
            if (c == value)
                return true;

        return false;
    }
}
