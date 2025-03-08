// /* Multi-level Inheritance */

// // Example 1

// class A { // super class
//     int a, b, c;

//     void add() {
//         a = 10;
//         b = 20;
//         c = a + b;
//         System.out.println("sum of two nos " + c);
//     }

//     void sub() {
//         a = 200;
//         b = 20;
//         c = a - b;
//         System.out.println("sub of two nos " + c);
//     }

// }

// class B extends A { // sub 1
//     void multi() {
//         a = 10;
//         b = 20;
//         c = a * b;
//         System.out.println("Multi of two nos " + c);
//     }

//     void div() {
//         a = 10;
//         b = 2;
//         c = a / b;
//         System.out.println("div of two nos " + c);
//     }

// }

// class C extends B {
//     void rem() {
//         a = 10;
//         b = 3;
//         c = a % b;
//         System.out.println("rem of two nos " + c);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         C r = new C();
//         r.add();
//         r.sub();
//         r.multi();
//         r.div();
//         r.rem();
//     }
// }
// Parent class
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Intermediate child class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk on land.");
    }
}

// Child class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Defined in Dog
    }
}
