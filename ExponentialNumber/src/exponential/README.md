# Exponential Number in Java

## 📌 Overview

This Java program demonstrates how to calculate the powers of a number using the built-in `Math.pow()` method. The user enters a base number and a maximum exponent, and the program displays the result of raising the base to every power from `0` to the specified exponent.

---

## 🎯 Features

* Accepts a base number from the user.
* Accepts a maximum exponent.
* Calculates powers using Java's `Math.pow()` method.
* Displays powers from `0` to the given exponent.
* Uses a separate method (`pow()`) for cleaner code.

---

## 🛠️ Technologies Used

* Java
* Scanner Class
* Math Library (`Math.pow()`)

---

## 📂 File Structure

```
ExponentialNumber.java
```

---

## ▶️ How to Run

1. Save the file as `ExponentialNumber.java`.
2. Open a terminal or command prompt.
3. Compile the program:

```bash
javac ExponentialNumber.java
```

4. Run the program:

```bash
java exponential.ExponentialNumber
```

---

## 💻 Sample Output

```
Enter an integer base number:
2
Enter an exponent
5

2 to the power 0 is 1
2 to the power 1 is 2
2 to the power 2 is 4
2 to the power 3 is 8
2 to the power 4 is 16
2 to the power 5 is 32
```

---

## 🧠 Concepts Covered

* Methods in Java
* Method Parameters and Return Values
* `for` Loop
* User Input using `Scanner`
* Mathematical Operations with `Math.pow()`
* Type Casting (`double` to `int`)

---

## 📖 Explanation

1. The program prompts the user to enter a base number.
2. It then asks for the maximum exponent.
3. A `for` loop iterates from `0` to the entered exponent.
4. During each iteration, the `pow()` method computes the result using `Math.pow()`.
5. The result is printed in a readable format.

---

## 📚 Example

**Input**

```
Base = 3
Exponent = 4
```

**Output**

```
3 to the power 0 is 1
3 to the power 1 is 3
3 to the power 2 is 9
3 to the power 3 is 27
3 to the power 4 is 81
```

---

## 👨‍💻 Author

Harshit Singh
