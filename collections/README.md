# 🧠 Java Collections – Week 3

Welcome to the third week of my Java learning journey!  
This section focuses on understanding **Collections**, especially `ArrayList` and `HashMap`, which are essential tools for handling data in memory efficiently.

---

## 🔷 Topics Covered

- `ArrayList` – dynamic lists of elements
- `HashMap` – key-value storage (similar to dictionaries)
- Real-world usage examples
- Comments and explanations for easy understanding

---

## 📁 Files

collections/ ├── ArrayListExample.java ├── HashMapExample.java

---

## ✅ Description & Tips

### 📌 `ArrayList`

- Used to store a dynamic list of elements (like a shopping list).
- Allows indexed access to elements (get by position).
- Useful when order matters and you need to modify the list.

💡 **Common Methods:**
```java
add(element)       // Add item to the list
get(index)         // Get item by position
remove(index)      // Remove item by position
size()             // Get number of elements
📌 HashMap
Stores data as key-value pairs (like a mini-database).

Keys must be unique.

Values are accessed through keys.
💡 Common Methods:
put(key, value)       // Add or update an entry
get(key)              // Retrieve value by key
remove(key)           // Remove entry by key
containsKey(key)      // Check if key exists
 Real-World Use Cases
Temporary data storage before sending it to a database

Quick lookups (e.g. price list, user info by ID)

Storing configurations or session data