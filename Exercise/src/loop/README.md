# Java Loops

This repository contains Java programs that demonstrate different types of loops in Java. These examples help beginners understand how loops work, their syntax, and practical use cases.

## Files Included

### 1. DoWhileLoop.java
Demonstrates the **do-while loop**, where the loop body executes at least once before the condition is checked.

**Concepts Covered:**
- User input using `Scanner`
- Summing multiple numbers using a do-while loop
- Countdown example
- Nested `while` loop inside a `do-while` loop
- Loop termination conditions

**Topics:**
- `do-while`
- User input
- Nested loops

---

### 2. ForEachLoop.java
Demonstrates the **for-each (enhanced for) loop** for traversing arrays.

**Concepts Covered:**
- Traditional `for` loop
- Enhanced `for-each` loop
- Iterating through character arrays
- Calculating the sum of array elements
- Traversing strings character by character

**Topics:**
- Enhanced for loop
- Arrays
- String iteration

---

### 3. ForLoop.java
Demonstrates different variations of the **for loop**.

**Concepts Covered:**
- Nested for loops
- Multiple loop variables
- Increment operations
- Calculating sums
- Even number iteration
- Counter implementation

**Topics:**
- Nested loops
- Multiple initialization variables
- Loop control
- Arithmetic operations

---

### 4. InfiniteLoop.java
Demonstrates the use of an **infinite loop** (`while(true)`) through a simple number guessing game.

**Concepts Covered:**
- Infinite loops
- Random number generation
- User input validation
- Using `break` to exit loops
- Practical application of endless loops

**Topics:**
- `while(true)`
- Random class
- Break statement
- Number Guessing Game

> **Note:** The second comparison in the guessing game should ideally be:
>
> ```java
> else if (userInput < generatedNumber)
> ```
>
> instead of
>
> ```java
> else if (userInput > generatedNumber)
> ```
>
> so that the program correctly asks the user to increase their guess.

---

### 5. WhileLoop.java
Demonstrates the **while loop** by calculating the factorial of a number.

**Concepts Covered:**
- User input
- Factorial calculation
- Handling special cases (0!, 1!, negative numbers)
- Loop-controlled multiplication

**Topics:**
- While loop
- Mathematical computation
- Conditional statements

---

## Concepts Learned

- `for` loop
- `while` loop
- `do-while` loop
- Enhanced `for-each` loop
- Nested loops
- Infinite loops
- Loop control using `break`
- User input with `Scanner`
- Random number generation
- Array traversal
- String traversal
- Factorial calculation
- Sum of numbers

---

## Requirements

- Java JDK 17 or above (Compatible with Java 21)
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans)

---

## How to Run

1. Clone the repository.

```bash
git clone <repository-url>
```

2. Navigate to the project folder.

```bash
cd <project-folder>
```

3. Compile the desired file.

```bash
javac FileName.java
```

Example:

```bash
javac ForLoop.java
```

4. Run the program.

```bash
java FileName
```

Example:

```bash
java ForLoop
```

---

## Learning Outcomes

After completing these programs, you will be able to:

- Understand the differences between all loop types.
- Choose the appropriate loop for different scenarios.
- Work with arrays using traditional and enhanced loops.
- Perform mathematical operations using loops.
- Create menu-driven and input-based applications.
- Implement nested loops and infinite loops safely.

---

## Author

Harshit Singh