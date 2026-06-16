# Java Number Systems Example

This repository contains a Java program that demonstrates different number systems supported by Java and how they are represented internally.

## File Included

### JavaNumbers.java

This program demonstrates:

* Octal Numbers (Base 8)
* Hexadecimal Numbers (Base 16)
* Binary Numbers (Base 2)
* Number System Conversions
* Integer Utility Methods

## Concepts Covered

### 1. Octal Numbers

Octal numbers use digits from:

```text
0 - 7
```

In Java, an octal number is represented by a leading `0`.

Example:

```java
int octalNumber = 015;
```

The program performs arithmetic operations on octal values and displays the result in both decimal and octal formats.

---

### 2. Hexadecimal Numbers

Hexadecimal numbers use:

```text
0 - 9, A - F
```

In Java, hexadecimal values are represented using:

```java
0x
```

or

```java
0X
```

Example:

```java
int hexNumber = 0x1B0;
```

The program adds hexadecimal numbers and converts the result back to hexadecimal format.

---

### 3. Binary Numbers

Binary numbers use only:

```text
0 and 1
```

In Java, binary values are represented using:

```java
0b
```

or

```java
0B
```

Example:

```java
int binaryNumber = 0b1001;
```

The program performs addition on binary values and displays the result in binary format.

---

## Utility Methods Used

### Convert to Octal

```java
Integer.toOctalString(number)
```

### Convert to Hexadecimal

```java
Integer.toHexString(number)
```

### Convert to Binary

```java
Integer.toBinaryString(number)
```

---

## How to Compile

```bash
javac JavaNumbers.java
```

## How to Run

```bash
java JavaNumbers
```

## Topics Covered

* Number Systems
* Octal Representation
* Hexadecimal Representation
* Binary Representation
* Base Conversion
* Integer Utility Methods
* Java Numeric Literals

## Author

Harshit Singh
