package operator;

public class BitwiseBitshiftOperator {

    public static void main(String[] args) {
        System.out.println("----------- Bitwise AND (&) -----------");
        // Bitwise AND (&)

        int num1 = 8; // 1000
        int num2 = 9; // 1001
                      // 1000 -> 8

        System.out.println("num1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num2 in binary: " + Integer.toBinaryString(num2));
        System.out.println("num1 & num2 in binary: " + Integer.toBinaryString(num1 & num2));
        System.out.println("num1 & num2 decimal: " + (num1 & num2));

        System.out.println("----------- Bitwise Inclusive OR (|) -----------");
        // Bitwise Inclusive OR (|)

        int num3 = 8; // 1000
        int num4 = 9; // 1001
                      // 1001 -> 9

        System.out.println("num3 in binary: " + Integer.toBinaryString(num3));
        System.out.println("num4 in binary: " + Integer.toBinaryString(num4));
        System.out.println("num3 | num4 in binary: " + Integer.toBinaryString(num3 | num4));
        System.out.println("num3 | num4 in decimal: " + (num3 | num4));

        System.out.println("----------- Bitwise Exclusive OR (^) -----------");
        // Bitwise Exclusive OR (^)

        int num5 = 8; // 1000
        int num6 = 9; // 1001
                      // 0001 -> 1

        System.out.println("num5 in binary: " + Integer.toBinaryString(num5));
        System.out.println("num6 in binary: " + Integer.toBinaryString(num6));
        System.out.println("num5 ^ num6 in binary: " + Integer.toBinaryString(num5 ^ num6));
        System.out.println("num5 ^ num6 in decimal: " + (num5 ^ num6));

        System.out.println("----------- Bitwise Left Shift (<<) -----------");
        // Bitwise Left Shift (<<)

        int num7 = 8; // 1000 << 2 -> 100000 -> 32 in decimal 

        System.out.println("num5 in binary: " + Integer.toBinaryString(num5));
        System.out.println("num5 ^ num6 in binary: " + Integer.toBinaryString(num5 ^ num6));
        System.out.println("num5 ^ num6 in decimal: " + (num5 ^ num6));
    }

}
