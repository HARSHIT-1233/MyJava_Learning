package array;

import java.util.Arrays;

public class SearchingInArrays {

    public static void main(String[] args) {
        // Sorted Array
        int[] numbers1 = {0, 2, 4, 6, 8, 10}; // Sorted Array
        int indexOfEight = Arrays.binarySearch(numbers1, 8); //4
        System.out.println("Index of 8 = " + indexOfEight);

        int indexOfSeven = Arrays.binarySearch(numbers1, 7); //-5
        System.out.println("Index of 7 = " + indexOfSeven);

        // Unsorted Array
        int[] numbers2 = {0, 12, 4, 16, 18, 10}; // Unsorted Array
        int indexOfEights = Arrays.binarySearch(numbers2, 8); //-4
        System.out.println("Index of 8 = " + indexOfEights);

        int indexOfSevens = Arrays.binarySearch(numbers2, 7); //-4
        System.out.println("Index of 7 = " + indexOfSevens);

        Arrays.sort(numbers2);

        int indexOfFour = Arrays.binarySearch(numbers2, 4);
        System.out.println("Index of 4 = " + indexOfFour); //1

        String[] animals = {"Cat", "Cow", "Dog", "Elephant", "Lion", "Monkey"};
        int indexOfDog = Arrays.binarySearch(animals, "Dog");
        System.out.println("index of dog = " + indexOfDog);
    }

}
