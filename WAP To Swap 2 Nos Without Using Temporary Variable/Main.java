public class Main {

 public static void main(String[] args) {

  int x = 10;
  int y = 20;

  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);

  //add both the numbers and assign it to first
  x = x + y;
  y = x - y;
  x = x - y;

  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}
