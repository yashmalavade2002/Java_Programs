// import java.util.Scanner;

// public class ASCIIValue {
//     public static void main(String[] args) {
//         // Create a scanner object for input
//         Scanner scanner = new Scanner(System.in);
        
//         // Prompt user to enter a character
//         System.out.print("Enter a character: ");
//         char character = scanner.next().charAt(0);
        
//         // Find and print the ASCII value
//         int asciiValue = (int) character;
//         System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
//         // Close the scanner object
//         scanner.close();
//     }
// }

// Method 2
public class Main {
    public static void main(String[] args) {
        char ch = 'A'; // Example character
        int asciiValue = (int) ch; // Explicitly casting char to int

        System.out.println("ASCII VALUE OF " + ch + " IS " + asciiValue);
    }
}

