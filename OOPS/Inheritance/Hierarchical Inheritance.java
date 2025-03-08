/*Hierarchical Inheritance */
class Animal {
    void eat() {
        System.out.println("This Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat Meow");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.meow();
        dog.eat();
        dog.bark();

    }
}
