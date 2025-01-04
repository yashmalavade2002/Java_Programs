
class Main {
    public static void main(String[] args) {
     int number=1233;
        
        int reversedNumber = 0;
        
        // Reversing the integer
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Displaying the reversed integer
        System.out.println("Reversed integer: " + reversedNumber);
        
    }
}
