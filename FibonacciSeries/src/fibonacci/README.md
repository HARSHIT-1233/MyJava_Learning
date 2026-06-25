# Fibonacci Series in Java

This project demonstrates how to generate the **Fibonacci sequence** in Java using a `for` loop.

The program accepts the number of terms from the user and prints the Fibonacci sequence up to that count.

---

## 📂 Project Structure

```text id="n4hm6g"
Fibonacci/
└── Fibonacci.java
```

---

# Overview

The **Fibonacci sequence** is a series of numbers where each number is the sum of the two preceding numbers.

The sequence starts as:

```text id="2mnb7x"
0 1 1 2 3 5 8 13 21 34 ...
```

Mathematically,

```text id="tlw01l"
F(n) = F(n-1) + F(n-2)

where

F(0) = 0
F(1) = 1
```

---

# Features

* Accepts user input using `Scanner`
* Generates Fibonacci numbers iteratively
* Uses a `for` loop
* Demonstrates variable updates without recursion
* Beginner-friendly implementation

---

# How the Program Works

1. Read the number of terms from the user.
2. Initialize the first two Fibonacci numbers:

   * Previous = 0
   * Current = 1
3. Print the previous number.
4. Calculate the next Fibonacci number.
5. Update the variables.
6. Repeat until the required number of terms has been generated.

---

# Example

### Input

```text id="7vyn4q"
Enter max sequence number:
10
```

### Output

```text id="xyb8j0"
0 1 1 2 3 5 8 13 21 34
```

---

# Algorithm

1. Start
2. Read the number of terms.
3. Initialize:

   * `fibPrevious = 0`
   * `fibonacci = 1`
4. Repeat for the specified number of terms:

   * Print `fibPrevious`
   * Compute the next Fibonacci number
   * Update the variables
5. End

---

# Time Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

The program generates each Fibonacci number exactly once while using constant extra memory.

---

# Concepts Used

* Variables
* User Input (`Scanner`)
* `for` Loop
* Integer Arithmetic
* Iterative Programming
* Sequence Generation

---

# How to Compile

```bash id="1plj50"
javac Fibonacci.java
```

---

# How to Run

```bash id="s7i31z"
java Fibonacci
```

---

# Sample Runs

### Example 1

**Input**

```text id="0xqg3t"
5
```

**Output**

```text id="gfc9xv"
0 1 1 2 3
```

---

### Example 2

**Input**

```text id="2y4glf"
8
```

**Output**

```text id="ujkwvq"
0 1 1 2 3 5 8 13
```

---

# Learning Outcomes

After completing this program, you will understand:

* What the Fibonacci sequence is.
* How to generate a mathematical sequence using loops.
* Updating variables efficiently in an iterative algorithm.
* Taking user input in Java.
* Time and space efficiency of iterative solutions.

---

# Prerequisites

* Java JDK 17 or above
* Command Prompt / Terminal
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans)

---

# Author

Harshit Singh
