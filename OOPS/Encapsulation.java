// // Java Program which demonstrate Encapsulation
// class Account {
//     // Private data members (encapsulated)
//     private long accNo; // Account number 
//     private String name;
//     private String email;
//     private float amount;

//     // Public getter and setter methods (controlled access)
//     public long getAccNo() { return accNo; }
//     public void setAccNo(long accNo) { this.accNo = accNo; }
//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }
//     public String getEmail() { return email; }
//     public void setEmail(String email) { this.email = email; }
//     public float getAmount() { return amount; }
//     public void setAmount(float amount) { this.amount = amount; }
// }

// public class Geeks {
//     public static void main(String[] args) {
//         // Create an Account object
//         Account acc = new Account(); 

//         // Set values using setter methods (controlled access)
//         acc.setAccNo(90482098491L);
//         acc.setName("ABC");
//         acc.setEmail("abc@gmail.com");
//         acc.setAmount(100000f);

//         // Get values using getter methods
//         System.out.println("Account Number: " + acc.getAccNo());
//         System.out.println("Name: " + acc.getName());
//         System.out.println("Email: " + acc.getEmail());
//         System.out.println("Amount: " + acc.getAmount());
//     }
// }
class Employee {
    private String name; // Private variable
    private double salary;

    // Setter method with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    // Getter method
    public double getSalary() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000); // Valid input
        System.out.println("Salary: " + emp.getSalary()); // Output: Salary: 50000.0

        emp.setSalary(-1000); // Invalid input
        System.out.println("Salary: " + emp.getSalary()); // Output: Salary: 50000.0
    }
}

