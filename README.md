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

Each class should focus on **one responsibility**.  
When a class handles multiple concerns (business logic, notifications, printing, etc.), changes in one area affect others, making the code harder to maintain.

✔️ Separating responsibilities into dedicated classes makes the system easier to understand, test, and modify.

---

### 2️⃣ Open-Closed Principle (OCP)
Software entities should be **open for extension but closed for modification**.

This means new functionality should be added by **extending existing code**, not by changing already tested and working code.

✔️ Using abstractions (interfaces or abstract classes) allows new features to be added without impacting existing behavior.

---

### 3️⃣ Liskov Substitution Principle (LSP)
Objects of a superclass should be **replaceable with objects of its subclasses without breaking the program**.

If a subclass cannot fully support the behavior of its parent class, then inheritance is being misused.

✔️ Designing smaller, role-specific interfaces ensures that child classes only implement behavior they actually support.

---

### 4️⃣ Interface Segregation Principle (ISP)
**Do not force any client to implement methods it does not use.**

Large interfaces should be split into **smaller, more specific interfaces**, so implementing classes only depend on what they actually need.

✔️ This avoids empty method implementations and keeps interfaces clean and focused.

---

### 5️⃣ Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules.  
**Both should depend on abstractions.**

Instead of tightly coupling business logic to concrete implementations, dependencies should be injected using interfaces.

✔️ This results in loose coupling, better testability, and easier extensibility.

---

## 🎯 Why SOLID Principles Matter
Applying SOLID principles helps developers:
- Write cleaner and more readable code
- Reduce tight coupling between classes
- Improve scalability and extensibility
- Simplify debugging and refactoring
- Build systems that are easier to maintain over time

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

This repository was created as part of continuous learning in object-oriented design and clean coding practices.


