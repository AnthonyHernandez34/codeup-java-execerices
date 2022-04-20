package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Student newStudent = new Student("ClarkKent");
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        String userChoice;
        boolean finished = false;

        newStudent.addGrade(100);
        newStudent.addGrade(95);
        newStudent.addGrade(90);
        students.put("Superman", newStudent);

        newStudent = new Student("BruceWayne");
        newStudent.addGrade(80);
        newStudent.addGrade(83);
        newStudent.addGrade(87);
        students.put("Batman", newStudent);

        newStudent = new Student("PrincessDiana");
        newStudent.addGrade(90);
        newStudent.addGrade(88);
        newStudent.addGrade(94);
        students.put("Wonderwoman", newStudent);

        newStudent = new Student("PeterParker");
        newStudent.addGrade(95);
        newStudent.addGrade(91);
        newStudent.addGrade(86);
        students.put("Spidermen", newStudent);

        System.out.println("Welcome!\n\nHere are the students Github user names:\n");

        String userNames = "";
        for (String userName : students.keySet()) {
            userNames += String.format("|%s| ", userName);
        }

        do {
            System.out.printf("%s\n\n", userNames);
            userChoice = input.getString("What student would you like to see more information on?\n\n> ");

            if (students.containsKey(userChoice)) {
                Student selectedStudent = students.get(userChoice);
                System.out.printf("Name: %s - Github Username: %s\nCurrent Average: %-3.1f\n",
                        selectedStudent.getName(), userChoice, selectedStudent.getGradeAverage());
            } else {
                System.out.printf("\nSorry, no student found with github username \"%s\"\n\n", userChoice);
            }

            finished = !input.getString("Would you like to see another student\n\n> ").toLowerCase().startsWith("y");

        } while (!finished);
    }
}