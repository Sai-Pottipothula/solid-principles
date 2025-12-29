![abc](https://github.com/user-attachments/assets/9481b975-c777-4fa7-a4ce-2f66c0467a16)

# SOLID Principles (Java)

## 📌 Introduction
This repository explains the **SOLID principles** using **simple Java examples** to demonstrate how good object-oriented design improves **code quality, maintainability, scalability, and flexibility**.

SOLID principles were introduced by **Robert C. Martin (Uncle Bob)** and are widely used in modern software development to design clean, modular, and extensible systems.

---

## 🔑 What is SOLID?
SOLID is an acronym that represents five fundamental object-oriented design principles:

- **S** – Single Responsibility Principle (SRP)  
- **O** – Open-Closed Principle (OCP)  
- **L** – Liskov Substitution Principle (LSP)  
- **I** – Interface Segregation Principle (ISP)  
- **D** – Dependency Inversion Principle (DIP)  

---

## 🧱 SOLID Design Principles Explained

### 1️⃣ Single Responsibility Principle (SRP)
A class should have **only one reason to change**.

Each class should focus on **one responsibility**. When a class handles multiple concerns, changes in one area can affect others, making the system harder to maintain.

Separating responsibilities into dedicated classes improves clarity, testability, and maintainability.

---

### 2️⃣ Open-Closed Principle (OCP)
Software entities should be **open for extension but closed for modification**.

New functionality should be added by extending existing code rather than modifying already tested and stable code. This is commonly achieved using abstractions such as interfaces.

---

### 3️⃣ Liskov Substitution Principle (LSP)
Objects of a superclass should be **replaceable with objects of its subclasses without breaking the program**.

If a subclass cannot fully support the behavior of its parent, inheritance is being misused. Designing role-specific interfaces helps ensure correct substitution.

---

### 4️⃣ Interface Segregation Principle (ISP)
**No client should be forced to depend on methods it does not use.**

Large interfaces should be split into smaller, focused interfaces so that implementing classes only depend on relevant functionality.

---

### 5️⃣ Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. **Both should depend on abstractions.**

Using interfaces to inject dependencies reduces tight coupling, improves flexibility, and makes systems easier to extend and test.

---

## 📌 Summary
| Principle | Description |
|--------|------------|
| SRP | Each class should have a single responsibility |
| OCP | Extend behavior without modifying existing code |
| LSP | Subclasses must be replaceable for parent classes |
| ISP | Clients should not depend on unused methods |
| DIP | Depend on abstractions, not concrete implementations |

---

## 🎯 Key Takeaway
Applying SOLID principles leads to cleaner, more maintainable, and scalable software systems by promoting modular design and loose coupling.

