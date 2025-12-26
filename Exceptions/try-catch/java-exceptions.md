# Java Exceptions: Checked vs Unchecked (List)

## 1) Checked Exceptions (compile-time checked)
- **Rule:** Must be **handled** with `try/catch` or **declared** with `throws`.
- **Typical meaning:** Something **outside** the program’s control may fail (I/O, network, database, etc.).
- **Common checked exceptions (examples):**
    - `IOException`
    - `FileNotFoundException`
    - `SQLException`
    - `ClassNotFoundException`
    - `InterruptedException`
    - `ParseException` (e.g., `java.text.ParseException`)
    - `MalformedURLException`
    - `TimeoutException` (e.g., `java.util.concurrent.TimeoutException`)
    - `ExecutionException` (e.g., `java.util.concurrent.ExecutionException`)
    - `NoSuchMethodException`
    - `NoSuchFieldException`
- **Note:** `Exception` (base type) is checked **unless** it’s a `RuntimeException` subtype.

---

## 2) Unchecked Exceptions (runtime)
- **Rule:** **Not required** to be caught or declared.
- **Typical meaning:** Usually **programming bugs** or invalid assumptions (null, bad index, wrong cast).
- **Common unchecked exceptions (examples):**
    - `NullPointerException`
    - `IllegalArgumentException`
    - `IllegalStateException`
    - `IndexOutOfBoundsException`
        - `ArrayIndexOutOfBoundsException`
        - `StringIndexOutOfBoundsException`
    - `ArithmeticException`
    - `ClassCastException`
    - `NumberFormatException`
    - `UnsupportedOperationException`
    - `ConcurrentModificationException`
    - `NoSuchElementException`
    - `SecurityException`
- **Rule of thumb:** Any exception extending `RuntimeException` is **unchecked**.

---

## 3) Errors (also unchecked, but not “exceptions”)
- **Rule:** Don’t usually catch; indicates serious JVM/system problems.
- **Examples:**
    - `OutOfMemoryError`
    - `StackOverflowError`
    - `NoClassDefFoundError`
    - `LinkageError`

---

## Quick summary
- **Checked:** must handle/declare (`throws`) → e.g., `IOException`, `SQLException`
- **Unchecked:** no requirement → e.g., `NullPointerException`, `IllegalArgumentException`
- **Errors:** serious failures → e.g., `OutOfMemoryError`
