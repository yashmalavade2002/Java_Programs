// Fibonacci series
class Main {
    public static void main(String[] args) {
        int n = 20, firstNum = 0, secondNum = 1;
        System.out.print(firstNum + ", ");
        for (int i = 1; i < n; i++) {
            System.out.print(secondNum + ", ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
