# Hello World in Java

This repository contains a simple Java program that demonstrates the basic structure of a Java application.

## File Included

### HelloWorld.java

This program demonstrates:

* Java class declaration
* The `main()` method
* Console output using `System.out.println()`
* Command-line arguments
* Program execution flow

## Concepts Covered

### Java Class

Every Java program is written inside a class.

```java
public class HelloWorld {
}
```

### Main Method

The `main()` method is the entry point of a Java application.

```java
public static void main(String[] args) {
}
```

When the program starts, Java executes the code inside this method.

### Console Output

The program prints a message to the console using:

```java
System.out.println("Hello World");
```

### Command-Line Arguments

The `args` array stores values passed when running the program.

```java
System.out.println("the size of args = " + args.length);
```

The `length` property returns the number of command-line arguments provided.

## How to Compile

```bash
javac HelloWorld.java
```

## How to Run

Without arguments:

```bash
java HelloWorld
```

With arguments:

```bash
java HelloWorld Java Programming
```

## Sample Output

### Without Arguments

```text
Hello World
the size of args = 0
```

### With Arguments

```text
Hello World
the size of args = 2
```

## Topics Covered

* Java Basics
* Java Class Structure
* Main Method
* Console Output
* Command-Line Arguments
* Program Execution

## Learning Outcomes

After completing this example, you will understand:

* How a Java program is structured
* The purpose of the `main()` method
* How to print output to the console
* How command-line arguments are passed to Java programs

## Author

Harshit Singh
