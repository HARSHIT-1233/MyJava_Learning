package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // declaration
        int[] numberArray;

        // instantiation and initialization
        // the numberArray is an int array
        // it can hold 5 elements
        // its length is 5
        numberArray = new int[5];

        numberArray[0] = 5;
        numberArray[1] = -4;
        numberArray[2] = 7;
        numberArray[3] = 2;
        numberArray[4] = -3;

        int result = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3] + numberArray[4];
        System.out.println("result: " + result);
        System.out.println(Arrays.toString(numberArray));
        System.out.println("The length of numberArray: " + numberArray.length);

        int[] numberArray2 = {5, -4, 7, -3, 2};
        System.out.println("Before Altering: " + Arrays.toString(numberArray2));
        numberArray2[3] = 8;
        System.out.println("After Altering: " + Arrays.toString(numberArray2));

        int ages[] = new int[]{15, (int) 16.5, 17};
        System.out.println("ages: " + Arrays.toString(ages));

        Object[] mixedArray = {3, 5.7, 5.8F, "Cat", 'h', false};
        System.out.println("mixed array: " + Arrays.toString(mixedArray));
    }
}
