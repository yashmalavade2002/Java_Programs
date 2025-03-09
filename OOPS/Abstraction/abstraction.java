/* Abstraction */
abstract class car {
    abstract public void fueltype();

    public void color() {
        System.out.println("Black color");
    }
}

class tata extends car {
    public void fueltype() {
        System.out.println("Diesel");
    }
}

public class Main {

    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.color();
        nexon.fueltype();
    }
}
