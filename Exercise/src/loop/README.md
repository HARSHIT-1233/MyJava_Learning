# Java Loop Statements

This project demonstrates the various **looping constructs in Java**. Loops allow a block of code to execute repeatedly until a specified condition becomes false.

The project includes examples of:

* `for` loop
* `while` loop
* `do-while` loop
* `for-each` loop
* Infinite loops
* Labeled loops

---

## 📂 Project Structure

```text
Loop/
│── ForLoop.java
│── WhileLoop.java
│── DoWhileLoop.java
│── ForEachLoop.java
│── InfiniteLoop.java
└── LabelledLoops.java
```

---

# 1. ForLoop.java

## Overview

Demonstrates the flexibility of the **for loop** using different examples.

### Concepts Covered

* Nested for loops
* Multiple loop variables
* Incrementing and decrementing
* Calculating the sum of numbers
* Iterating through ranges
* Infinite for loop (commented)

### Examples

* Nested loops
* Printing loop counters
* Sum of even numbers
* Sum of natural numbers
* Standard counting loop

---

# 2. WhileLoop.java

## Overview

Demonstrates the **while loop**, which executes as long as the specified condition remains true.

### Concepts Covered

* Condition-controlled iteration
* Factorial calculation
* User input using `Scanner`
* Validation for negative numbers
* Iterative mathematical calculations

### Example

Calculates the factorial of a user-entered number.

---

# 3. DoWhileLoop.java

## Overview

The **do-while loop** executes its body **at least once**, even if the condition is false.

### Concepts Covered

* Menu-style repetition
* Summing multiple user inputs
* Character-based loop continuation
* Demonstrating guaranteed first execution
* Nested while loop inside do-while

### Example

* Add multiple numbers until the user chooses to stop.
* Demonstrates that the loop executes once regardless of the condition.

---

# 4. ForEachLoop.java

## Overview

The **for-each loop** simplifies iteration over arrays and collections.

### Concepts Covered

* Iterating through character arrays
* Iterating through integer arrays
* Calculating array sum
* Iterating through characters of a String

### Examples

* Print each character
* Calculate total of array elements
* Traverse a String using `toCharArray()`

---

# 5. InfiniteLoop.java

## Overview

Demonstrates **infinite loops** and a practical use case.

### Concepts Covered

* Infinite `while(true)` loop
* Number Guessing Game
* Breaking out of an infinite loop
* Importance of termination conditions
* Example of an endless boolean-controlled loop

### Learning Purpose

Shows how infinite loops are useful when the number of iterations is unknown beforehand and how `break` is used to terminate them.

---

# 6. LabelledLoops.java

## Overview

Demonstrates the use of **labels** with nested loops.

### Concepts Covered

* Unlabeled nested loops
* Labeled loops
* Breaking out of multiple nested loops
* Control flow using loop labels

### Example

* Difference between normal `break`
* `break` with loop labels

---

# Difference Between Java Loops

| Loop       | Condition Checked | Executes At Least Once | Best Used For                       |
| ---------- | ----------------- | ---------------------- | ----------------------------------- |
| `for`      | Before execution  | No                     | Known number of iterations          |
| `while`    | Before execution  | No                     | Unknown number of iterations        |
| `do-while` | After execution   | Yes                    | Menu-driven programs and user input |
| `for-each` | Automatically     | No                     | Traversing arrays and collections   |

---

# Key Learning Outcomes

After completing these programs, you will understand:

* Different looping statements in Java
* Nested loops
* Infinite loops
* User-controlled iteration
* Array traversal
* Labeled loops
* Mathematical calculations using loops
* Practical applications of loops

---

# How to Compile

```bash
javac ForLoop.java
javac WhileLoop.java
javac DoWhileLoop.java
javac ForEachLoop.java
javac InfiniteLoop.java
javac LabelledLoops.java
```

---

# How to Run

```bash
java ForLoop
```

```bash
java WhileLoop
```

```bash
java DoWhileLoop
```

```bash
java ForEachLoop
```

```bash
java InfiniteLoop
```

```bash
java LabelledLoops
```

---

# Prerequisites

* Java JDK 17 or above
* Command Prompt / Terminal
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans)

---

# Author

Harshit Singh
