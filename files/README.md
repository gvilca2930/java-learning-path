# 📂 Java Files – Reading and Writing Files

This module demonstrates how to **write to** and **read from** a text file using Java I/O classes.

---

## 🧠 Concepts Covered

- `FileWriter` – for writing text to a file.
- `BufferedReader` and `FileReader` – for reading content from a file line by line.
- Exception handling with `try-catch` blocks.
- File path management and closing resources.

---

## 🧪 Practical Example

We simulate a basic **product inventory** written to and read from a file.

### 🔹 WriterFile.java

This class writes predefined product names and their prices to a text file.

```java
FileWriter writer = new FileWriter("files/archivo.txt");
writer.write("Cafe - 5.50\n");
writer.write("Pizza - 5.50\n");
// ...
writer.close();

🗂️ Project Structure

files/
├── ReadFile.java
├── WriterFile.java
├── archivo.txt
└── README.md

✅ Outcome
Understand how to create and access text files using Java.

Learn basic file handling and string formatting.

Apply try-catch blocks to manage exceptions like IOException.