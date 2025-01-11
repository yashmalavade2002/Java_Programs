import java.util.Scanner;

// palindrome no
class programs {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter The NO: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int reversedNumber = 0, temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;

        }
        if (number == reversedNumber) {
            System.out.println("Palindrome No");

        } else {
            System.out.println(" Not Palindrome No");
        }

    }
}
