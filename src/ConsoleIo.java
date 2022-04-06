import java.util.Scanner;
public class ConsoleIo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String name = "Anthony";
        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        System.out.println("Please Enter city name:");
        String city= scanner.nextLine();

        System.out.println("Please Enter state name:");
        String state= scanner.nextLine();

        System.out.println("how Long have you lived there?");
        int years = scanner.nextInt();


        System.out.printf("Welcome to %s, %s! Ive lived here %d years", city , state, years);
    }
}