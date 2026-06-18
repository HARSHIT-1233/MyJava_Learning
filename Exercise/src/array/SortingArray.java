package array;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        System.out.println("---------- Sorting Double Array ----------");
        //Sorting Double Array
        double[] array1 = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
        System.out.println("Unsorted array: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted array: " + Arrays.toString(array1));

        System.out.println("---------- Sorting Int Array ----------");
        //Sorting Int Array
        int[] array2 = {1, 3, -5, 10, 2, 15, 9};
        System.out.println("Unsorted array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted array: " + Arrays.toString(array2));

        System.out.println("---------- Sorting Char Array ----------");
        //Sorting Char Array
        char[] array3 = {'F', 'B', 'b', 'H', 'c', 'A'};
        System.out.println("Unsorted array: " + Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("Sorted array: " + Arrays.toString(array3));

        System.out.println("---------- Sorting String Array ----------");
        //Sorting String Array
        String[] array4 = {"cat", "Dog", "Monkey", "Lion", "elephant", "Cow"};
        System.out.println("Unsorted array: " + Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println("Sorted array: " + Arrays.toString(array4));

        System.out.println("---------- Sorting String Array2 ----------");
        //Sorting String Array
        String[] array5 = {"3", "300", "20", "35", "37", "31", "4", "70", "ant", "Zebra"};
        System.out.println("Unsorted array: " + Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println("Sorted array: " + Arrays.toString(array5));
    }

}
