# Java Methods — Explained

A **method** in Java is a named block of code that runs when you call it. Methods help you:
- reuse logic (write once, call many times),
- organize code into readable units,
- hide implementation details behind a clean API.

---

## 1) Method syntax (anatomy)

```java
accessModifier otherModifiers returnType methodName(parameterList) throws ExceptionType {
    // method body
}
```

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

## 2) Parts of a method

### Access modifier
Controls visibility:
- `public` — accessible from anywhere
- `protected` — accessible in same package + subclasses
- *(no modifier)* (package-private) — accessible only within the same package
- `private` — accessible only inside the same class

### Other common modifiers
- `static` — belongs to the class, not a specific object
- `final` — cannot be overridden (for instance methods)
- `abstract` — no body; subclasses must implement (in abstract classes)
- `synchronized` — one thread at a time per lock
- `native` — implemented in non-Java code (JNI)
- `strictfp` — consistent floating-point behavior across platforms

### Return type
- A type like `int`, `String`, `List<User>`, etc.
- Or `void` if nothing is returned

### Method name
- Use **camelCase**: `calculateTotal`, `findById`
- Prefer verbs: `getName`, `computeScore`

### Parameters
Inputs to the method:
```java
public double area(double radius) { ... }
```

### Method body
Statements executed when called.

### `throws` clause (optional)
Declares checked exceptions the caller must handle:
```java
public void readFile(String path) throws IOException { ... }
```

---

## 3) Instance methods vs static methods

### Instance method
Runs on an **object** and can access instance fields:

```java
class Counter {
    private int value;

    public void increment() { // instance method
        value++;
    }

    public int getValue() {
        return value;
    }
}
```

Usage:
```java
Counter c = new Counter();
c.increment();
System.out.println(c.getValue());
```

### Static method
Runs on the **class** and cannot access instance fields without an object:

```java
class MathUtil {
    public static int square(int x) {
        return x * x;
    }
}
```

Usage:
```java
int s = MathUtil.square(7);
```

---

## 4) Parameters: pass-by-value (important!)

Java is **always pass-by-value**.

- For **primitives**, the value is copied.
- For **objects**, the **reference value** is copied (you can mutate the object, but you can’t “replace” the caller’s reference).

```java
static void changeInt(int x) { x = 99; }

static void changeList(List<Integer> list) { list.add(5); }

static void replaceList(List<Integer> list) { list = new ArrayList<>(); } // doesn't affect caller
```

---

## 5) Method overloading

**Overloading** means same method name, different parameter list:

```java
public int sum(int a, int b) { return a + b; }
public int sum(int a, int b, int c) { return a + b + c; }
public double sum(double a, double b) { return a + b; }
```

Overloading is resolved at **compile time** based on argument types.

---

## 6) Varargs (variable number of arguments)

Use `...` to accept many values:

```java
public static int sumAll(int... nums) {
    int total = 0;
    for (int n : nums) total += n;
    return total;
}
```

Call it like:
```java
sumAll(1, 2, 3, 4);
sumAll(); // valid, nums is empty
```

---

## 7) Returning values

### Single return value
```java
public boolean isAdult(int age) {
    return age >= 18;
}
```

### Early returns
```java
public String formatName(String name) {
    if (name == null) return "UNKNOWN";
    return name.trim().toUpperCase();
}
```

### Returning multiple values
Common patterns:
- create a small class/record
- return a `Map`
- return a DTO

Example with a record:
```java
public record MinMax(int min, int max) {}

public static MinMax minMax(int[] arr) {
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    for (int x : arr) { min = Math.min(min, x); max = Math.max(max, x); }
    return new MinMax(min, max);
}
```

---

## 8) Exceptions in methods

### Checked exceptions
Must be declared or handled:
```java
public String load(String path) throws IOException { ... }
```

### Unchecked exceptions
Runtime exceptions (no need to declare):
```java
public int divide(int a, int b) {
    return a / b; // can throw ArithmeticException if b == 0
}
```

### Best practice
- Throw **specific** exceptions.
- Avoid catching `Exception` unless you really mean it.
- Keep exception messages useful.

---

## 9) Overriding (polymorphism)

**Overriding** happens in subclasses: same signature, different implementation.

```java
class Animal {
    public String sound() { return "???"; }
}

class Dog extends Animal {
    @Override
    public String sound() { return "woof"; }
}
```

Runtime (dynamic) dispatch:
```java
Animal a = new Dog();

```

Rules (simplified):
- Same name + parameters
- Return type compatible (covariant return allowed)
- Access cannot become more restrictive
- Cannot override `final` methods

---

## 10) Methods in interfaces

Interfaces can have:
- **abstract methods** (implicitly public)
- **default methods** (have a body)
- **static methods**
- (Java 9+) **private helper methods**

```java
interface Loggable {
    void log(String msg); // abstract

    default void info(String msg) {
        log("[INFO] " + msg);
    }

    static String now() {
        return java.time.Instant.now().toString();
    }
}
```

---

## 11) Method references (functional style)

If you use lambdas, method references are a shorthand:

```java
List<String> names = List.of("Ali", "Zeynep", "Gürkan");

// lambda
names.forEach(s -> System.out.println(s));

// method reference
names.forEach(System.out::println);
```

---

## 12) Common pitfalls

- **Confusing overloading vs overriding**
    - Overloading: compile time, different parameters
    - Overriding: runtime, subclass replaces behavior
- **Null handling**
    - consider `Objects.requireNonNull(...)` for required inputs
- **Side effects**
    - keep methods focused; if it mutates state, name it clearly
- **Too many parameters**
    - consider a parameter object/DTO or builder pattern

---

## 13) Quick checklist for “good” methods

- Name is a verb phrase: `computeTotal`, `validateUser`
- Does one thing (single responsibility)
- Has small number of parameters
- Returns meaningful values (avoid `null` when possible)
- Throws clear, specific exceptions when needed
- Has tests for edge cases

---

## 14) Mini cheat sheet

```java
public int f(int x) { return x + 1; }              // instance method
public static int g(int x) { return x * 2; }       // static method
public void h() { /* no return */ }                // void
public void i(String... args) { }                  // varargs
public int sum(int a, int b) { return a + b; }     // overload example
@Override public String toString() { return "..."; } // override example
```
