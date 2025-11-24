# Java Basics - Complete Guide

**Course:** Net & Sec (S5) - 2025-2026  
**Institution:** Université Cadi Ayyad - FSSM  
**Instructor:** Pr. Mustapha AATILA (m.aatila@uca.ac.ma)

---

## 📖 Table of Contents

1. [Introduction to Java](#-introduction-to-java)
2. [Java Compilation & Execution](#-java-compilation--execution)
3. [Setting Up Java Development](#-setting-up-java-development)
4. [First Java Program](#-first-java-program)
5. [Primitive Data Types](#-primitive-data-types)
6. [Operators](#-operators)
7. [Control Structures](#-control-structures)
8. [Loops](#-loops)
9. [User Input with Scanner](#-user-input-with-scanner)
10. [Packages](#-packages)
11. [Practice Exercises](#-practice-exercises)

---

## 🚀 Introduction to Java

### What is Java?

Java is a **high-level, object-oriented programming language** developed by Sun Microsystems in **1995**.

**Key Characteristics:**
- 📦 Object-oriented (like C++)
- 🔒 Implements all three OOP principles: Encapsulation, Inheritance, and Polymorphism
- 🎯 Inspired by C and C++
- 🛡️ Safer than C++ (no pointers, no multiple inheritance)

**What Java Removed from C++:**
- ❌ Pointers (to prevent direct memory manipulation errors)
- ❌ Multiple inheritance (to avoid complexity)
- ❌ Operator overloading

---

## 🔄 Java Compilation & Execution

### Compiled AND Interpreted Language

Java is unique because it's **both compiled and interpreted**:

```
Source Code (.java)
        ↓
   [Java Compiler]
        ↓
   Bytecode (.class)      ← Platform-independent
        ↓
[Java Virtual Machine (JVM)] ← Interpreter
        ↓
   Machine Code           ← Platform-specific execution
```

### How It Works:

1. **Write:** Code in `.java` files
2. **Compile:** Java compiler converts to **bytecode** (`.class` files)
3. **Execute:** JVM interprets bytecode for your specific platform

**Bytecode Characteristics:**
- ✅ Close to machine language
- ✅ Platform-independent
- ✅ Can run on any system with a JVM

---

## 🌍 Java Portability

### "Write Once, Run Anywhere"

Java is **portable** - it works on any platform without modification!

```
         Java Bytecode (.class)
                 ↓
    ┌────────────┼────────────┐
    ↓            ↓            ↓
JVM Windows   JVM Unix    JVM Mac
    ↓            ↓            ↓
  Windows      Unix         Mac
 Executable  Executable  Executable
```

**Why is it portable?**
- Same bytecode runs on all platforms
- Each platform has its own JVM
- Unicode support at source level
- No platform-specific compilation needed

---

## 🛠️ Setting Up Java Development

### What You Need (JDK):

The **Java Development Kit (JDK)** includes:

| Component | Description |
|-----------|-------------|
| **Java API** | Standard libraries and classes |
| **Java Compiler** | Converts `.java` to `.class` |
| **JRE** | Java Runtime Environment (includes JVM) |
| **Documentation** | API reference guides |
| **IDE** (optional) | VSCode, Eclipse, NetBeans, IntelliJ |

**Download:** Free from [Oracle's official website](https://www.oracle.com/java/technologies/downloads/)

---

## 💻 First Java Program

### Hello World Example

```java
public class Bienvenue {
    public static void main(String[] args) {
        System.out.println("Bienvenus L-NSC S5");
    }
}
```

### Code Breakdown:

| Component | Explanation |
|-----------|-------------|
| `public class Bienvenue` | Class name (must match filename) |
| `public static void main` | Main method - program entry point |
| `String[] args` | Command-line arguments |
| `System.out.println()` | Print to console |

### File Naming Rules:

- ✅ Filename: `Bienvenue.java` (matches class name)
- ✅ Extension: `.java`
- ⚠️ **Case-sensitive!** (`Bienvenue` ≠ `bienvenue`)

### Conventions:

- Class names start with **uppercase** letter
- Each instruction ends with **semicolon** (`;`)
- Use **camelCase** for variables

---

## 📊 Primitive Data Types

Java has **8 primitive types** (not objects!):

### 1. Integer Types

| Type | Size | Range |
|------|------|-------|
| `byte` | 1 byte | -128 to 127 |
| `short` | 2 bytes | -32,768 to 32,767 |
| `int` | 4 bytes | -2³¹ to 2³¹-1 |
| `long` | 8 bytes | -2⁶³ to 2⁶³-1 |

### 2. Floating-Point Types

| Type | Size | Precision |
|------|------|-----------|
| `float` | 4 bytes | ~7 decimal digits |
| `double` | 8 bytes | ~15 decimal digits |

### 3. Character Type

| Type | Size | Range |
|------|------|-------|
| `char` | 16 bits | Unicode '\u0000' to '\uffff' |

### 4. Boolean Type

| Type | Values |
|------|--------|
| `boolean` | `true` or `false` |

---

## 🎁 Wrapper Classes

Each primitive type has an **object wrapper class**:

| Primitive | Wrapper Class |
|-----------|---------------|
| `byte` | `java.lang.Byte` |
| `short` | `java.lang.Short` |
| `int` | `java.lang.Integer` |
| `long` | `java.lang.Long` |
| `float` | `java.lang.Float` |
| `double` | `java.lang.Double` |
| `char` | `java.lang.Character` |
| `boolean` | `java.lang.Boolean` |

**Purpose:** Allow primitives to be treated as objects (useful for collections, etc.)

---

## 📝 Variable Declaration & Initialization

### Declaration:

```java
long nombre;
int compteur;
char caractere;
```

### Initialization:

```java
// At declaration
int n = 15;
boolean b = true;

// Or separately
int n;
n = 15;
```

### Constants:

Use `final` keyword for constants:

```java
final int MAX_SIZE = 100;  // Cannot be changed
final double PI = 3.14159;

MAX_SIZE = 200;  // ❌ ERROR: Cannot reassign final variable
```

### Variable Naming Rules:

- ✅ Start with: letter, underscore (`_`), or dollar sign (`$`)
- ✅ Can contain: letters, numbers
- ❌ Cannot contain: spaces
- ❌ Cannot use: Java reserved keywords

---

## ⚙️ Operators

### Arithmetic Operators

```java
// Unary
+a, -b

// Binary
a + b   // Addition
a - b   // Subtraction
a * b   // Multiplication
a / b   // Division
a % b   // Modulus (remainder)

// Increment/Decrement
a++, ++a  // Increment
b--, --b  // Decrement

// Compound assignment
x += 2   // Same as: x = x + 2
x -= 3   // Same as: x = x - 3
x *= 5   // Same as: x = x * 5
x /= 2   // Same as: x = x / 2
```

### Comparison Operators

```java
a == b   // Equal to
a != b   // Not equal to
a > b    // Greater than
a < b    // Less than
a >= b   // Greater than or equal
a <= b   // Less than or equal
```

### Logical Operators

```java
a && b   // AND (both must be true)
a || b   // OR (at least one must be true)
!a       // NOT (inverts boolean)
```

### Type Casting

```java
int i = 123;
float j = (float)i;  // Explicit cast: int → float
```

---

## 🔀 Control Structures

### 1. If-Else Statement

```java
int i = 10;

if (i < 0) {
    System.out.println("nombre négatif");
} else if (i > 0) {
    System.out.println("nombre positif");
} else {
    System.out.println("nombre null");
}
```

### 2. Switch Statement

**Only works with:** `int`, `byte`, `short`, `char`, `String`, or enum

```java
int a = 30;

switch (a) {
    case 10:
        System.out.println("Ten");
        break;  // Important!
    case 20:
        System.out.println("Twenty");
        break;
    case 30:
        System.out.println("Thirty");
        break;
    default:
        System.out.println("Other value");
}
```

⚠️ **Important:** Always use `break` to prevent fall-through!

### 3. Ternary Operator

**Syntax:** `(condition) ? value_if_true : value_if_false`

```java
int x = 10, y = 20;
int max = (x < y) ? y : x;  // max = 20

int doubleMax = (x < y) ? y*2 : x*2;  // doubleMax = 40
```

---

## 🔁 Loops

### 1. For Loop

**Use when:** Number of iterations is **known**

```java
for (int i = 1; i <= 20; i++) {
    System.out.println(i);
}
```

**Syntax:**
```java
for (initialization; condition; increment) {
    // code block
}
```

### 2. While Loop

**Use when:** Number of iterations is **unknown**, condition checked **before** execution

```java
int i = 1;
while (i <= 20) {
    System.out.println(i);
    i++;
}
```

**Syntax:**
```java
while (condition) {
    // code block
}
```

⚠️ **Note:** Block may **never execute** if condition is false initially

### 3. Do-While Loop

**Use when:** You need **at least one iteration**, condition checked **after** execution

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 20);
```

**Syntax:**
```java
do {
    // code block
} while (condition);
```

✅ **Guaranteed:** Block executes **at least once**

---

## 🎛️ Loop Control: Break & Continue

### Break

**Purpose:** Exit loop immediately

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Stops at i=5
    }
    System.out.println(i);
}
// Output: 1 2 3 4
```

### Continue

**Purpose:** Skip to next iteration

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;  // Skips i=5
    }
    System.out.println(i);
}
// Output: 1 2 3 4 6 7 8 9 10
```

---

## 🎹 User Input with Scanner

### Setup

```java
import java.util.Scanner;  // Import at top

Scanner sc = new Scanner(System.in);  // Create Scanner object
```

### Common Methods

| Method | Return Type | Description |
|--------|-------------|-------------|
| `next()` | `String` | Reads one word |
| `nextLine()` | `String` | Reads entire line |
| `nextInt()` | `int` | Reads integer |
| `nextDouble()` | `double` | Reads decimal number |
| `nextBoolean()` | `boolean` | Reads true/false |

### Complete Example

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir votre nom:");
        String nom = sc.nextLine();
        
        System.out.println("Saisir votre age:");
        int age = sc.nextInt();
        
        System.out.println("Saisir votre salaire:");
        double salaire = sc.nextDouble();
        
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        System.out.println("Salaire: " + salaire);
    }
}
```

---

## 📦 Packages

### What is a Package?

A **package** is a collection of related classes, types, and functions grouped together.

### Common Java Packages

| Package | Purpose |
|---------|---------|
| `java.lang` | Basic types and functions (automatically imported) |
| `java.io` | Input/output operations |
| `java.io.File` | File management |
| `java.math` | Mathematical operations |
| `java.awt` | Graphical user interface elements |
| `java.util` | Utilities (Scanner, Collections, etc.) |

### Importing Packages

```java
// Import specific class
import java.util.Scanner;

// Import entire package
import java.io.*;

// Import specific class from package
import java.lang.Math;
```

---

## 📚 Practice Exercises

### Conditional Structures

1. **Square Calculator**
   - Prompt user for an integer
   - Calculate and display its square

2. **Price Calculator**
   - Read: unit price (HT), quantity, VAT rate
   - Calculate and display: total price (TTC)

3. **Product Sign**
   - Read two numbers
   - Determine if their product is positive or negative
   - **WITHOUT calculating the product!**

4. **Vowel or Consonant**
   - Read a character (use `charAt(0)`)
   - Determine if it's a vowel or consonant
   - Use `switch` statement

### Loop Exercises

1. **Multiplication Table**
   - Read an integer
   - Display its multiplication table
   - Implement using: `for`, `while`, AND `do-while`

2. **Digit Counter**
   - Read an integer
   - Count and display how many digits it contains

3. **Harmonic Series**
   - Read value of `n`
   - Calculate sum: `1 + 1/2 + 1/3 + 1/4 + ... + 1/n`
   - Display the result

---

## 🎯 Quick Reference

### Program Structure Template

```java
import java.util.Scanner;  // Imports

public class ClassName {   // Class declaration
    public static void main(String[] args) {  // Main method
        // Your code here
    }
}
```

### Increment/Decrement Behavior

```java
int n = 5;
int a = n++;  // a = 5, n = 6 (post-increment: use then increment)
int b = ++n;  // b = 7, n = 7 (pre-increment: increment then use)
```

### Loop Comparison

| Loop Type | When to Use | Condition Check | Min Iterations |
|-----------|-------------|-----------------|----------------|
| `for` | Known iterations | Before | 0 |
| `while` | Unknown iterations | Before | 0 |
| `do-while` | Need at least one | After | 1 |

---

## 💡 Best Practices

1. ✅ Always close Scanner: `sc.close()`
2. ✅ Use meaningful variable names
3. ✅ Comment complex logic
4. ✅ Follow Java naming conventions
5. ✅ One public class per file
6. ✅ Use constants for fixed values
7. ✅ Handle user input validation

---

*This guide is based on course materials from Pr. Mustapha AATILA's Java/OOP course at FSSM.*