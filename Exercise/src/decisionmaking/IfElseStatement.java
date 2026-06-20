package decisionmaking;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        boolean control = true;
        if (control){
            System.out.println("control is true");
        }else{
            System.out.println("control is false");
        }

        input.close();

            int age = 30;
        if (age > 10) System.out.println("Age is greater than 10");

        if (age > 20) System.out.println("Age is greater than 20");

        if (age == 30) System.out.println("Age is 30");

        if (age > 40) System.out.println("Age is greater than 40");

    }

}
