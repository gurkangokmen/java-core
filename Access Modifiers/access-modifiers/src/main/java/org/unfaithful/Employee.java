package org.unfaithful;

public class Employee extends Person{

    public Employee(String name, int age, String email, String phoneNumber) {
        super(name, age, email, phoneNumber);
    }

    public void printFromChild() {
        System.out.println("Name: " + name);          // public → OK
        // System.out.println(age);                  // private → ERROR
        System.out.println("Email: " + email);        // protected → OK (subclass)
        System.out.println("Phone: " + phoneNumber);  // default → OK (same package)
    }
}
