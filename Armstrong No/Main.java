public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        int num=123,temp=num; int sum=0;
        while(num>0) {
        int digit =num%10;
        	sum=sum+(digit*digit*digit);
        	num=num/10;
        }
        if(temp==sum) {
        	System.out.println(" Armstrong No ");
        }
        else {
        	System.out.println("Not Armstrong No ");
        }
    }
}
