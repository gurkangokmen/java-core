package org.unfaithful;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Gurkan", 25, "gurkan@example.com", "555-123");

        System.out.println(p.name);           // public → OK
        // System.out.println(p.age);         // private → ERROR
        System.out.println(p.email);          // protected → OK (same package)
        System.out.println(p.phoneNumber);    // default → OK (same package)

        p.sayHello();                         // public → OK
        // p.showAge();                       // private → ERROR
        p.showEmail();                        // protected → OK
        p.showPhone();                        // default → OK

        System.out.println("---------------------------------");

        Employee emp = new Employee("Ali", 30, "ali@g.com", "555-333");
        emp.printFromChild();                 // test subclass access
    }
}