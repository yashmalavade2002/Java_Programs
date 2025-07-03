class main {
    public static void main(String[] args) {
    // Typecasting 
    // Converting one data type value into another is called Typecasting
     // Implicit ---> automatically performed by the compiler
     // Explicit --> By Default compiler doesnt allow explicit typecasting

     // Implicit
    //  int a = 10; // 4 bytes
    //  double b = a; // 8 bytes
    //   System.out.println(b);
     
    // Explicit
    double x = 10.5; // 8 bytes
    int y = (int) x; // 4 bytes
    
    System.out.println(y);
    }

}
