import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int y;
        System.out.println("Enter Any Year");
        Scanner r = new Scanner(System.in);
        y = r.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
