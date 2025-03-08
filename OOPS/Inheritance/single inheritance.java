// class student { // parent class
//     int rollno, marks;
//     String name;

//     void input() {
//         System.out.println("Enter the roll  no");
//     }

// }

// class aniket extends student { // child class
//     void disp() {
//         rollno = 5;
//         name = "Yash";
//         marks = 89;
//         System.out.println(rollno + " " + name + " " + marks);
//     }

//     public static void main(String[] args) {
//         aniket r = new aniket();
//         r.input();
//         r.disp();
//     }

// }
// Parent class
class Parent {
    void house() {
        System.out.println("Parent has a house.");
    }
}

// Child class (inherits Parent)
class Child extends Parent {
    void car() {
        System.out.println("Child has a car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.house(); // Inherited from Parent
        obj.car(); // Child's own method
    }
}
