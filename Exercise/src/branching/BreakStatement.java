package branching;

public class BreakStatement {

    public static void main(String[] args) {

        /*int age = 50;
        age--;
        if (age == 40)
            break; // break can't be used outside of switch or loop, thus this will give error
        */

        String[] animals = {"Monkey", "Bee", "Cat", "Dog", "Cow"};

        int index = 0;
        String animal = "null";
        while (index < animals.length){
            animal = animals[index];

            if (animal == "Dog")
                break;
            index++;
        }
        System.out.println(animal);

        for (String a : animals){
            if (a == "Dog"){
                break;
            }
            System.out.println(a);
        }

        for (int x = 15; x >= 0; x--){

            if (x == 5){
                break;
            }
            System.out.println("X: " + x);

        }

        int a =0;
        switch (a) {
            case 0:
                System.out.println("Hi....");
                break;
            case 1:
                System.out.println("Hello....");
                break;
        }
    }

}
