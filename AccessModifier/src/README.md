# Java Access Modifiers Across Packages

A simple Java project demonstrating how **Access Modifiers** (`public`, `protected`, `default`, and `private`) behave within the **same package** and across **different packages**.

---

## 📂 Project Structure

```
.
├── packageone
│   ├── Cat.java
│   └── Dog.java
└── packagetwo
    └── Bee.java
```

---

## 📖 Overview

This project contains three classes:

- **Cat.java** – Defines methods with all four access modifiers.
- **Dog.java** – Located in the same package (`packageone`) and accesses `Cat` methods.
- **Bee.java** – Located in a different package (`packagetwo`) and accesses `Cat` methods.

The project demonstrates which methods are accessible based on Java's access control rules. :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}

---

## 🔑 Access Modifiers

| Access Modifier | Same Class | Same Package | Different Package (Subclass) | Different Package (Non-Subclass) |
|----------------|-----------|--------------|------------------------------|----------------------------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |

---

## 📌 Class Behavior

### 1. Cat.java

Defines four methods using different access modifiers:

- `privateMethod()`
- `defaultMethod()`
- `protectedMethod()`
- `publicMethod()`

Since all methods are called from within the same class, every method is accessible. :contentReference[oaicite:3]{index=3}

---

### 2. Dog.java (Same Package)

`Dog` is in the same package as `Cat`.

Accessible methods:

- ✅ `publicMethod()`
- ✅ `protectedMethod()`
- ✅ `defaultMethod()`
- ❌ `privateMethod()`

This demonstrates that classes in the same package can access `public`, `protected`, and package-private (`default`) members, but not `private` members. :contentReference[oaicite:4]{index=4}

---

### 3. Bee.java (Different Package)

`Bee` belongs to another package and creates an object of `Cat`.

Accessible methods:

- ✅ `publicMethod()`
- ❌ `protectedMethod()`
- ❌ `defaultMethod()`
- ❌ `privateMethod()`

Since `Bee` is **not a subclass** of `Cat`, only the `public` method is accessible. :contentReference[oaicite:5]{index=5}

---

## ▶️ How to Compile

Compile all Java files:

```bash
javac packageone/*.java packagetwo/*.java
```

---

## ▶️ Run the Programs

Run `Cat`:

```bash
java packageone.Cat
```

Run `Dog`:

```bash
java packageone.Dog
```

Run `Bee`:

```bash
java packagetwo.Bee
```

---

## 🎯 Learning Outcomes

After completing this project, you will understand:

- Java packages
- Access modifiers
- Visibility rules
- Package-private (`default`) access
- Cross-package accessibility
- Why `private` members cannot be accessed outside their own class
- Difference between same-package and different-package access

---

## 💡 Key Takeaway

- **public** → Accessible everywhere.
- **protected** → Accessible within the same package and by subclasses in other packages.
- **default (package-private)** → Accessible only within the same package.
- **private** → Accessible only within the declaring class.

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Packages
- Access Modifiers
- JDK