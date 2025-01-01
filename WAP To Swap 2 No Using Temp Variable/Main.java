public class Main {

 public static void main(String[] args) {

  int num1 = 10;
  int num2 = 20;

  System.out.println("Before Swapping");
  System.out.println("Value of num1 is :" + num1);
  System.out.println("Value of num2 is :" + num2);

int temp=0;
temp=num1; // num1 - > temp
num1=num2; // num1 - > 20
num2=temp; // num2 - > 10

  System.out.println("After  Swapping");
  System.out.println("Value of num1 is :" + num1);
  System.out.println("Value of num2 is :" + num2);
 }
}
