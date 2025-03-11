import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter The No");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0){
             System.out.println("Even No !!");
        }
             else 
             {
                  System.out.println("odd No !!");
                 
             }
    
    }
}
// Print Even and Odd Numbers from 1 to N
public class Main {

    public static void main(String[] args) {
        int N = 20;
        System.out.println("Even Nos Are : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Nos Are : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
