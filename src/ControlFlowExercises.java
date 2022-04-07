import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        // 5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        long num = 2L;      //declaration // put together gives us initiation// long used for 8 bytes memory usage -9 trillion --- 9 trillion
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

        //refactor
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (long num = 2; num < 1000000; num *= num) {
//            System.out.println(num);
//        }


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


//        Scanner scanner = new Scanner(System.in);
//        int test = 0;
//        while (test < 1){
//
//            System.out.println("Enter an integer: ");
//            int input = scanner.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(long i = 1; i <= input; i++){
//                double squared = i * i;
//                double cubed = i * i * i;
//                System.out.printf( "%-6d |%-9.2f|1000%-7.2f%n", i, squared, cubed);
//            }
//
//            scanner.nextLine();
//
//            System.out.println("Would you like to continue? Enter Y or N:");
//            String confirm = scanner.nextLine();
//            if(confirm.equalsIgnoreCase("Y")){
//                continue;
//            }else{
//                break;
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        int test = 0;
        while (test < 1) {

            System.out.println("Enter a numerical grade: ");
            int grade = scanner.nextInt();
            String letterGrade = "";
            if (grade >= 0 && grade <= 59) {
                letterGrade = "F";
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 88) {
                letterGrade = "A";
            }
            System.out.format("You entered a numerical grade of %d. The letter grade is %s. ", grade, letterGrade);
            scanner.nextLine();
            System.out.println("Would you like to continue? Enter Y or N:");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }
}