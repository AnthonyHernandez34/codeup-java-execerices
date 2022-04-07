
import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        String name = "Anthony";
//        System.out.printf("Hello there, %s can i ask you a question.%n", name);
//
//        System.out.println("do you live in the city (yes or no):");
//        String city = scanner.nextLine();
//
//        System.out.println("can you come visit in-person (no or yes):");
//        String canComeinPerson = scanner.nextLine();
//
//
//        System.out.printf("user input for the following questions %s, %s!", city, canComeinPerson);

        boolean livesInCity = true;
        boolean hasTrans = true;
        boolean canComeinPerson = livesInCity && hasTrans;

        if (canComeinPerson) {
            System.out.println("yay, you can come to potluck");
        } else {
            System.out.println("sorry, cant come");
        }
    }
}

