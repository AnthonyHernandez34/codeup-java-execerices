import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(add(3, 7));
        System.out.println(subtract(3, 7));
        System.out.println(multiply(3, 7));
        System.out.println(divide(3, 0));
        System.out.println(modulus(22, 10));
        factorial();
        rollDice(scan);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (x * 1.0 / y * 1.0);
    }

    public static int modulus(int x, int y) {
        return (x % y);
    }


    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        // how to proceed
        if( userInput < min || userInput > max ){
            System.out.println("Number is outside of the range");
            return getInteger(min, max);
        } else {
            // how to stop
            System.out.println("Number is within the range");
            return userInput;
        }
    }

    public static void factorial(){
        int userInput = getInteger(1,10);
        long sum = 1;
        for (int fa = userInput; fa > 0; fa--){
            sum *= fa;
        }
        System.out.println("factorial of " + userInput +" = " + sum);
    }

    public static void randomize(short sides){
        System.out.println( (int) Math.floor(Math.random() * sides) );
        System.out.println( (int) Math.floor(Math.random() * sides) );
    }

    public static void rollDice(Scanner scan){
        int counter = 0;

        while(true){
            counter++;
            System.out.println("Roll Dice method");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Ok, bye, you played " + counter + " times");
                break;
            }
        }
    }
}