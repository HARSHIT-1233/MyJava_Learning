package inputoutput;

import java.util.*;

public class BasicInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered: " +number);
        input.close();
    }
}
