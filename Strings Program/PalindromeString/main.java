// public class PalindromeString {
// public static void main(String[] args) {
// String str = "Madam";
// String rev = "";
// for (int i = str.length() - 1; i >= 0; i--) {
// rev = rev + str.charAt(i);
// }
// if (str.toLowerCase().equals(rev.toLowerCase())) {
// System.out.println(" Palindrome String ");
// } else {
// System.out.println(" Not Palindrome String ");
// }
// }
// }

// Approch 2
// public class PalindromeString {
// public static void main(String[] args) {
// String str = "Madam";
// str = str.toLowerCase(); // Convert to lowercase once
// StringBuilder rev = new StringBuilder(str).reverse(); // Efficient reversal

// if (str.equals(rev.toString())) {
// System.out.println("Palindrome String");
// } else {
// System.out.println("Not a Palindrome String");
// }
// }
// }
