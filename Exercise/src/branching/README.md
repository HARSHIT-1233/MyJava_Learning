# Java Branching Statements

This project demonstrates the three primary **branching statements** in Java:

* `break`
* `continue`
* `return`

These statements control the execution flow of loops, switch statements, and methods.

---

## 📂 Files Included

```
Branching/
│── BreakStatement.java
│── ContinueStatement.java
└── ReturnStatement.java
```

---

# 1. Break Statement

### Overview

The `break` statement immediately terminates the nearest enclosing loop or `switch` statement and transfers control to the statement following it.

### Demonstrated Concepts

* Using `break` inside a `while` loop
* Using `break` inside a `for-each` loop
* Using `break` inside a traditional `for` loop
* Using `break` inside a `switch` statement
* Example showing that `break` **cannot** be used outside a loop or switch (commented)

### Example Output

```
Dog
Monkey
Bee
Cat
X: 15
X: 14
...
X: 6
Hi....
```

---

# 2. Continue Statement

### Overview

The `continue` statement skips the current iteration of a loop and immediately proceeds with the next iteration.

### Demonstrated Concepts

* `continue` inside a `while` loop
* `continue` inside a `for-each` loop
* Printing only even numbers using `continue`
* Example showing that `continue` **cannot** be used outside a loop (commented)

### Example Output

```
Monkey
Bee
Cat
Dog

Monkey
Bee
Cat
Cow

10
8
6
4
2
0
```

---

# 3. Return Statement

### Overview

The `return` statement immediately exits the current method.

If the method returns a value, `return` also sends the value back to the caller.

### Demonstrated Concepts

* Exiting a method using `return`
* Using `return` inside conditional statements
* Difference between `return` and `break`
* Using `return` within a `switch`
* Code after `return` becomes unreachable

### Example Output

```
Before the return statement
```

---

# Difference Between break, continue and return

| Statement  | Purpose                               | Works With    | Execution After Statement             |
| ---------- | ------------------------------------- | ------------- | ------------------------------------- |
| `break`    | Terminates the current loop or switch | Loops, Switch | Continues after the loop/switch       |
| `continue` | Skips the current iteration           | Loops only    | Starts the next iteration             |
| `return`   | Exits the current method              | Methods       | Remaining method code is not executed |

---

# Key Points

### break

* Ends the nearest loop or switch.
* Commonly used to stop searching once a condition is met.
* Cannot be used outside loops or switch statements.

### continue

* Skips only the current iteration.
* Loop continues with the next iteration.
* Valid only inside loops.

### return

* Exits the entire method immediately.
* Can return a value (for non-void methods).
* Any statements after `return` in the same execution path become unreachable.

---

# How to Run

### Compile

```bash
javac BreakStatement.java
javac ContinueStatement.java
javac ReturnStatement.java
```

### Execute

```bash
java BreakStatement
```

```bash
java ContinueStatement
```

```bash
java ReturnStatement
```

---

# Learning Outcomes

After completing these examples, you will understand:

* How `break` terminates loops and switch statements.
* How `continue` skips specific iterations.
* How `return` exits methods immediately.
* Appropriate use cases for each branching statement.
* The differences between `break`, `continue`, and `return`.

---

## Author

Harshit Singh
