import java.util.*;

/* Finds the first duplicate character in a String and displays its index.
If there isn't a duplicate character, it'll display -1
*/

public class CharacterDuplicates {

    public static void main(String[] args) {
        String input = "abc";

        System.out.println(findDuplicate(input));
    }

    public static int findDuplicate(String input) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (characterSet.contains(input.charAt(i))) {
                return i;
            } else characterSet.add(input.charAt(i));
        }
        return -1;
    }
}
