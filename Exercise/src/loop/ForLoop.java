package loop;

public class ForLoop {

    public static void main(String[] args) {

        /*// infinite (endless) loop with for loop
        for (;;){
            System.out.println("Hello World");
        }*/

        int counter = 0;

        for (int x = 1; x < 4; x++){
            for (int y = 0; y <= 5; y++){
                System.out.println("Loop number: " + ++counter);
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                System.out.println("-------------");
            }
        }

        for (int a = 0, b = 1; a <= 5 && b < 11; a++, b++){
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("-----------");
        }

        int sum = 0;
        for (int k = 0; k <= 10; k += 2){
            sum += k;
            System.out.println(k);
        }
        System.out.println("Sum of numbers: " + sum);

        int sum1 = 0;
        for (int k = 0; k <= 5; k++){
            sum1 += k;
            System.out.println(k);
        }
        System.out.println("Sum of numbers: " + sum1);

        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }

}
