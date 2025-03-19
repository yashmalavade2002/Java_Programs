// public class Main {

//     public static void main(String[] args) {
//         int a[] = new int[5];
//         // try {
//         // System.out.println(a[3]);
//         // }
//         // } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//         // System.out.println("Tried To Access out of Array Element");
//         // }
//         // catch (Exception e) {
//         // System.out.println(" All exeception Handled");
//         // } finally {
//         // System.out.println("I Will Run Always");
//         // }
//         // System.out.println("bye world");
//         try {
//             getNumberFromArray(a);
//         } catch (Exception e) {
//             System.out.println("Exception Caught" + e.getMessage());
//         }

//     }

//     static int getNumberFromArray(int a[]) throws ArithmeticException {
//         return a[8];
//     }
// }

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        try {
            // throw new MyException();
            throw new MyException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
}
