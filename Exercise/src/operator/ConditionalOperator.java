package operator;

public class ConditionalOperator {

    public static void main(String[] args) {

        int number1 = 5, number2 = 8, number3 = 12;
        boolean result; // default value of boolean is false

        // conditional AND (&&) operator
        result = (number1 > number2) && (number3 > number1);
        System.out.println("result = " + result);

        // conditional OR (||) operator
        result = (number1 > number2) || (number3 > number2);
        System.out.println("result = " + result);

        // conditional Ternary (?:)operator
        result = number1 < number2 ? true : false;
        System.out.println("result = " + result);
    }
}
