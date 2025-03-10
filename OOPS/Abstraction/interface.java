/* Abstraction */
interface Car {
    public void start();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Electric car starts");
    }
}

class DieselCar implements Car { // Fixed spelling mistake
    public void start() {
        System.out.println("Diesel car starts");
    }
}

public class Main {
    public static void main(String[] args) {
        Car tesla = new ElectricCar(); // Corrected variable name
        Car xuv700 = new DieselCar(); // Corrected variable name

        tesla.start(); // Output: Electric car starts
        xuv700.start(); // Output: Diesel car starts
    }
}
