# Java Variables Example

This repository contains a simple Java program that introduces the concept of variables and demonstrates how they are used in Java.

## File Included

### Variable.java

This program demonstrates:

* Variable declaration
* Variable initialization
* Storing values in variables
* Performing arithmetic operations using variables
* Variable naming conventions

## Concepts Covered

### Variable Declaration

Variables are used to store data in memory.

Example:

```java
int a;
int b;
```

### Variable Initialization

Assigning a value to a variable:

```java
int a = 10;
int b = 20;
```

### Multiple Variable Declaration

Java allows multiple variables of the same type to be declared in a single statement:

```java
int a = 10, b = 20, c = a + b;
```

### Arithmetic Operations

Variables can participate in mathematical expressions:

```java
int c = a + b;
```

The result is then displayed using:

```java
System.out.println("c = " + c);
```

## Variable Naming Rules

### Valid Variable Names

```java
int age;
int _age;
int $age;
int age3;
```

### Invalid Variable Names

```java
int a ge;
int 3age;
```

### Naming Best Practices

* Use meaningful names
* Follow camelCase convention
* Start variable names with a letter
* Avoid special characters except `_` and `$`

Examples:

```java
int studentAge;
double accountBalance;
String firstName;
```

## How to Compile

```bash
javac Variable.java
```

## How to Run

```bash
java Variable
```

## Sample Output

```text
c = 30
```

## Topics Covered

* Variables
* Data Storage
* Variable Declaration
* Variable Initialization
* Arithmetic Expressions
* Java Naming Conventions

## Learning Outcomes

After completing this example, you will understand:

* What variables are and why they are used
* How to declare and initialize variables
* How to store and manipulate data
* Java variable naming rules and conventions

## Author

Harshit Singh
