# Java `enum` (Enumerations)

Java **enums** are a special kind of class used to represent a **fixed set of constant values** (e.g., days of the week, order status, user roles).  
They are **type-safe**, can have **fields/methods**, and integrate nicely with `switch`, collections, and APIs.

---

## 1) Basic enum

```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

### Using it

```java
Day today = Day.FRIDAY;

if (today == Day.FRIDAY) {
    System.out.println("Almost weekend!");
}
```

---

## 2) Enums are classes (you can add fields + constructors)

Each enum constant can carry data.

```java
public enum OrderStatus {
    NEW("New"),
    PAID("Paid"),
    SHIPPED("Shipped"),
    CANCELLED("Cancelled");

    private final String label;

    // Enum constructors are implicitly private
    OrderStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
```

Usage:

```java
OrderStatus s = OrderStatus.PAID;
System.out.println(s.getLabel()); // "Paid"
```

---

## 3) Methods per constant (constant-specific behavior)

You can override methods differently for each constant.

```java
public enum Operation {
    ADD {
        @Override public int apply(int a, int b) { return a + b; }
    },
    SUB {
        @Override public int apply(int a, int b) { return a - b; }
    };

    public abstract int apply(int a, int b);
}
```

Usage:

```java
int result = Operation.ADD.apply(5, 3); // 8
```

---

## 4) `switch` with enums

Enums are great for `switch`:

```java
public static String message(OrderStatus status) {
    return switch (status) {
        case NEW -> "Waiting for payment";
        case PAID -> "Preparing shipment";
        case SHIPPED -> "On the way";
        case CANCELLED -> "Order cancelled";
    };
}
```

---

## 5) Helpful built-in enum methods

Given:

```java
Day d = Day.MONDAY;
```

Common methods:

- `d.name()` → `"MONDAY"` (exact identifier)
- `d.ordinal()` → index (0-based, depends on declaration order)
- `Day.valueOf("MONDAY")` → `Day.MONDAY` (throws if invalid)
- `Day.values()` → array of all constants

Example:

```java
for (Day day : Day.values()) {
    System.out.println(day);
}
```

> **Tip:** Avoid persisting `ordinal()` in a database. If you reorder enum constants later, stored ordinals become wrong.

---

## 6) Enums in collections: `EnumSet` and `EnumMap`

Java has specialized, efficient collections for enums.

### `EnumSet` (set of enum values)

```java
import java.util.EnumSet;

EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

### `EnumMap` (map keyed by enum)

```java
import java.util.EnumMap;

EnumMap<OrderStatus, Integer> counts = new EnumMap<>(OrderStatus.class);
counts.put(OrderStatus.NEW, 12);
counts.put(OrderStatus.PAID, 7);
```

---

## 7) Enums with custom lookup (e.g., by code)

If you store a short code (like in JSON/DB), add a lookup:

```java
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String code;

    HttpMethod(String code) { this.code = code; }

    public String getCode() { return code; }

    private static final Map<String, HttpMethod> BY_CODE =
            Stream.of(values()).collect(Collectors.toUnmodifiableMap(HttpMethod::getCode, m -> m));

    public static HttpMethod fromCode(String code) {
        HttpMethod m = BY_CODE.get(code);
        if (m == null) throw new IllegalArgumentException("Unknown method: " + code);
        return m;
    }
}
```

Usage:

```java
HttpMethod m = HttpMethod.fromCode("POST");
```

---

## 8) When to use `enum` vs constants?

### Prefer `enum` when:
- The set of values is **finite and known**
- You want **type safety** (no invalid strings)
- You want behavior attached to each value (methods)

### Prefer constants (`public static final`) when:
- Values are not a closed set (or may grow dynamically)
- You don’t need a dedicated type

---

## 9) Common pitfalls and best practices

- ✅ **Use enums for domain states** (status, role, type).
- ✅ Keep enum names **UPPER_SNAKE_CASE** by convention.
- ✅ If you store enum in DB/JSON, prefer storing a **stable string code**, not `ordinal()`.
- ✅ Consider adding `fromCode(...)` for safe parsing.
- ❌ Don’t compare enums with `.equals` unnecessarily — use `==` (safe for enums).

---

## Quick summary

- `enum` defines a **fixed set** of constants.
- Enums are **full classes**: fields, constructors, methods.
- Works well with `switch`, and has efficient `EnumSet`/`EnumMap`.
