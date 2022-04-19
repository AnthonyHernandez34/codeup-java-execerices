import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        Person people[] = new Person[3];
        people[0] = new Person("john");
        people[1] = new Person("ben");
        people[2] = new Person("dave");

        for (Person person : people) {
            System.out.println(person.getName());
        }

//        Person[] myArr = ArraysExercises.addPerson(people, new Person("jeff"));
//
//        for (
//            Person person : myArr) {
//            System.out.println(person.getName());
//        }
//        System.out.println(myArr.length);
//    }
    }
}