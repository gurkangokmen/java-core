# Solid

## 🔸S🔸olid - Single Responsibility Principle

```java
// Violating SRP
class ReportGenerator {
    void generateReport() {
        // code to generate report
    }
    void sendEmail() {
        // code to send report via email
    }
}

// Following SRP
class ReportGenerator {
    void generateReport() {
        // code to generate report
    }
}

class EmailService {
    void sendEmail() {
        // code to send report via email
    }
}

```

## S🔸o🔸lid - Open/Closed Principle

Definition: Software entities (classes, modules, etc.) should be open for extension but closed for modification.

Why: This allows adding new features without changing existing code, reducing bugs.

```java
// Violating OCP
class Invoice {
    double calculateDiscount(String customerType) {
        if (customerType.equals("Regular")) {
            return 0.1;
        } else if (customerType.equals("VIP")) {
            return 0.2;
        }
        return 0.0;
    }
}

// Following OCP
interface Discount {
    double getDiscount();
}

class RegularDiscount implements Discount {
    public double getDiscount() {
        return 0.1;
    }
}

class VIPDiscount implements Discount {
    public double getDiscount() {
        return 0.2;
    }
}

```


## So🔸l🔸id - Liskov Substitution Principle

Definition: Subtypes should be replaceable with their base types without altering the correctness of the program.
Why: It ensures the app works as expected even when subclasses are used in place of the parent class.

Note: It prevents dummy code. Each method has a functional operation.

More Info: [Liskov Principle Example](https://www.gencayyildiz.com/blog/liskovun-yerine-gecme-prensibiliskov-substitution-principle-lsp/) 
```java
// Violating LSP
class Bird {
    void fly() {}
}

class Penguin extends Bird {
    void fly() {
        throw new UnsupportedOperationException();
    }
}

// Following LSP
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {}
}

class Penguin {
    // Penguin doesn’t implement Flyable, as it can’t fly.
}

```

## Sol🔸i🔸d - Interface Segregation Principle

Definition: Clients should not be forced to implement interfaces they don't use.

Why: Helps create smaller, more specific interfaces, making them easier to implement.

```java
// Violating ISP
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {}
    public void eat() {} // Robots don’t need to eat
}

// Following ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    public void work() {}
}
```

## Soli🔸d🔸 - Dependency Inversion Principle

Definition: Depend on abstractions, not concrete classes.

Why: It makes the code more flexible and easier to modify.

```java
// Violating DIP
class LightBulb {
    void turnOn() {}
    void turnOff() {}
}

class Switch {
    private LightBulb lightBulb = new LightBulb();

    void operate() {
        lightBulb.turnOn();
    }
}

// Following DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {}
    public void turnOff() {}
}

class Switch {
    private Switchable device;

    Switch(Switchable device) {
        this.device = device;
    }

    void operate() {
        device.turnOn();
    }
}
```


# DRY

Definition: Avoid duplicating code; instead, centralize repeated logic in a single place.

Why: Reduces the chance of errors, as updates only need to be made in one place.

```java
// Violating DRY
int calculateArea(int width, int height) {
    return width * height;
}

int calculatePerimeter(int width, int height) {
    return 2 * (width + height);
}

// Following DRY
class Rectangle {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }
}
```

# KISS

Definition: Aim to keep code as simple and straightforward as possible.

Why: Simple code is easier to understand, maintain, and debug.

```java
// Violating KISS
void checkAge(int age) {
    if (age >= 18 && age <= 100) {
        System.out.println("Adult");
    } else if (age >= 0 && age < 18) {
        System.out.println("Minor");
    } else if (age > 100) {
        System.out.println("Probably an error");
    } else {
        System.out.println("Invalid age");
    }
}

// Following KISS
void checkAge(int age) {
    if (age >= 18) {
        System.out.println("Adult");
    } else if (age >= 0) {
        System.out.println("Minor");
    } else {
        System.out.println("Invalid age");
    }
}
```