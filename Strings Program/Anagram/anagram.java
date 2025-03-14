import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) { // Correct method signature
        str1 = str1.replaceAll("\\s", "").toLowerCase(); // Correct escape sequence
        str2 = str2.replaceAll("\\s", "").toLowerCase(); // Correct escape sequence

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2); // Compares if the sorted arrays are equal.
    }

    public static void main(String[] args) {
        String str1 = "Listenl";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) { // Use the correct method name
            System.out.println(str1 + " and " + str2 + " are Anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are Not Anagrams");
        }
    }
}

