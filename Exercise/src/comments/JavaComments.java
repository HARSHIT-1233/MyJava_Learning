package comments;

public class JavaComments {
/*
* this is multi line comment
*/
    public static void main(String[] args){

        // Single line comment
       System.out.println("Hello Java Developers");

       int i = doMultiplication(45,5);
        System.out.println("Multiplication = " + i);
    }

    /**
     * this is documentation comment
     * this method multiplies two integers
     * @param x is the first parameter
     * @param y is the second parameter
     * @return this method returns the multiplication of two numbers
     */
    public static int doMultiplication(int x, int y){
        return x*y;
    }
}

