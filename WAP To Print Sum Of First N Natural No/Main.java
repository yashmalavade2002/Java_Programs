import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       int n, sum=0;
       System.out.println(" Enter The no ");
       Scanner r=new Scanner(System.in);
       n=r.nextInt();
       for(int i=1;i<=n;i++){
           sum=sum+i;
       }
       System.out.println(" Sum Of 1st N Natural No Is "+sum);
    }
}
