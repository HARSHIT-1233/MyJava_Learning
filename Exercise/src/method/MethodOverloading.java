package method;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + add(4, 5));
        System.out.println("Sum of three numbers: " + add(4, 5, 6));
        System.out.println("Sum of two double numbers: " + add(4.23, 5.23));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int add(int x, int y, int z){
        return x + y + z;
    }

    public static double add(double x, double y){
        return x + y;
    }

}
