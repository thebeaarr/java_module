# Object-Oriented Programming (OOP) - Java/Python

**Course:** Net & Sec (S5) - 2025-2026  
**Institution:** Université Cadi Ayyad - FSSM  
**Instructor:** Pr. Mustapha AATILA (m.aatila@uca.ac.ma)

---

## 📚 Course Outline

1. Introduction to OOP
2. Java Language Syntax
3. Classes and Objects in Java
4. Exceptions in Java
5. Input/Output in Java
6. Event-Driven Programming in Java
7. Database Access with JDBC
8. Projects

---

## 🎯 Introduction to OOP

### Programming Levels

**Low-Level Programming**
- Written in languages close to machine language
- Examples: Binary, Assembly

**High-Level Programming**
- Written in languages close to human language
- Examples: Java, Python

### Procedural vs Object-Oriented Programming

| Procedural Programming | Object-Oriented Programming |
|------------------------|----------------------------|
| Separates data from functions | Combines data and functions in objects |
| Data → Function 1, Function 2, etc. | Object 1, Object 2, Object 3 (each with its own data & methods) |

---

## 🔑 Core OOP Principles

OOP is built on four fundamental concepts:

### 1. **Class**
A blueprint or template for creating objects. It defines:
- Attributes (properties/data)
- Methods (behaviors/functions)

**Example:** A `Person` class can create multiple person objects (Ahmed, Sanae, Laila, Karim)

### 2. **Object**
A concrete instance of a class representing a real-world entity.

**Every object has:**
- **Identity:** Distinguishes it from other objects
- **State:** Represented by attributes that store values
- **Behavior:** Defined by methods that modify states

**Relationship:**
```
Class (template) → creates → Objects (instances)
```

### 3. **Encapsulation**
Controls access to class members using visibility modifiers.

| Modifier | Symbol | Visibility |
|----------|--------|------------|
| **public** | `+` | Accessible by all classes |
| **private** | `-` | Accessible only within the same class |
| **protected** | `#` | Accessible within the same package and subclasses |
| **friendly** (default) | ~ | Accessible within the same package |

**Best Practices:**
- Keep attributes `private`
- Use getter and setter methods for access
- Only one `public` class per file (matching the filename)

### 4. **Inheritance**
Allows a class to inherit properties and methods from another class.

**Terminology:**
- **Superclass (Parent):** The class being inherited from
- **Subclass (Child):** The class that inherits

**Types:**
- **Simple Inheritance:** One subclass inherits from one superclass (Java)
- **Multiple Inheritance:** One subclass inherits from multiple superclasses (C++)

**Example Hierarchy:**
```
Animal
├── Herbivore
├── Carnivore
└── Omnivore
```

### 5. **Polymorphism**
Literally means "many forms." Allows the same method name to behave differently based on the object type.

**Example:**
```java
class Animal {
    public void parler() {
        System.out.println("L'animal fait un bruit.");
    }
}

class Chat extends Animal {
    public void parler() {
        System.out.println("Le chat miaule.");
    }
}

class Chien extends Animal {
    public void parler() {
        System.out.println("Le chien aboie.");
    }
}

// Usage
Animal animal = new Animal();
Animal chat = new Chat();
Animal chien = new Chien();

animal.parler();  // Output: L'animal fait un bruit.
chat.parler();    // Output: Le chat miaule.
chien.parler();   // Output: Le chien aboie.
```

---

## 📊 Quick Reference

### Class vs Object

| Class | Object |
|-------|--------|
| Abstract representation | Concrete instance |
| Blueprint/template | Usable example |
| Defines structure | Contains actual data |
| Created once | Can create multiple instances |

### Access Modifiers Summary

- **Private:** Maximum protection, only accessible within the class
- **Friendly:** Default level, accessible within the same package
- **Protected:** Accessible within package and by subclasses
- **Public:** Accessible by all classes

**Note:** Only methods and attributes can be `private` or `protected`, not classes.

---

## 💡 Key Concepts

- **Instance:** An object created from a class
- **Method:** A function defined within a class
- **Attribute:** A variable defined within a class
- **Package:** A namespace that organizes related classes

---

## 🎓 Learning Objectives

By the end of this course, you will be able to:
- Understand and apply OOP principles
- Design and implement classes and objects
- Use encapsulation to protect data
- Implement inheritance hierarchies
- Apply polymorphism for flexible code
- Handle exceptions properly
- Work with file I/O
- Build event-driven applications
- Connect to databases using JDBC

---

*This README is based on course materials from Pr. Mustapha AATILA's OOP Java/Python course.*