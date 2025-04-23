import java.util.Scanner;

public class Functions {
    public static int calculateProduct(int a, int b) {
        // int sum = a + b;
        // return sum;
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        System.out.println("Product of 2 nos is " + calculateProduct(a, b));
    }

}
