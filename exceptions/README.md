# 🚨 Java Exception Handling – Notes & Exercises

This section explores how **exceptions** work in Java and how to handle them effectively using `try`, `catch`, and **custom exceptions**.

---

## 📘 Topics Covered

- Introduction to exceptions
- `try-catch-finally` structure
- Throwing exceptions manually (`throw`)
- Creating custom exception classes
- Validating user input with exceptions

---

## 🧪 Practice: Temperature Logger App

This small project simulates a temperature logger that:

- Accepts user input (7 values)
- Validates each temperature between -30°C and 55°C
- Throws a custom exception if the input is out of range
- Stores and displays all valid values

It is implemented using three files under the `exceptions/` folder:

- `TemperaturaInvalidaException.java`: Defines the custom exception class.
- `RegistroTemperatura.java`: Contains the logic to register and validate temperatures.
- `AplicacionTemperatura.java`: Main app that interacts with the user via console input.

Additionally, notes and theory are available in:

- `notes/exceptions.md`: Summary of concepts, syntax, and best practices.

---

## ✅ Key Concepts

### 🔥 What is an Exception?

An **exception** is an event that disrupts the normal flow of execution. It typically occurs when something unexpected happens, such as:

- Invalid input
- File not found
- Division by zero
- Null pointer reference

### 🛠️ Handling Exceptions in Java

```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that always runs (optional)
}
---
🧩 Creating a Custom Exception
public class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String message) {
        super(message);
    }
}
📝 Notes
All theory and additional explanations are available in notes/exceptions.md, including:

Checked vs. Unchecked exceptions

Best practices for designing custom exceptions

When to use finally

🚀 What's Next?
Explore file handling and how exceptions are used with file I/O

Learn about the exception class hierarchy

Apply exception handling in real-world applications like input forms or APIs