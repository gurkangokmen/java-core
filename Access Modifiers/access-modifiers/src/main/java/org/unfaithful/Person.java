package org.unfaithful;

public class Person {
    // public: accessible from anywhere
    public String name;

    // private: only inside this class
    private int age;

    // protected: accessible within same package or dif-pac subclass
    protected String email;

    // default (no modifier): only same package
    String phoneNumber;

    // Constructor
    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // public method
    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    // private method
    private void showAge() {
        System.out.println("Age: " + age);
    }

    // protected method
    protected void showEmail() {
        System.out.println("Email: " + email);
    }

    // default method
    void showPhone() {
        System.out.println("Phone: " + phoneNumber);
    }
}
