public class HelloWorld {
    public static void main(String args[]){

        System.out.print("Hello World\n");

        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);

        String myString = "My string";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);

        int three = Integer.parseInt("456");

        x = 10;
//        x += 5;
        int y = 2;
//        y *= x;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        x = Integer.MAX_VALUE;
        x++;
        System.out.println("MAXVAL + 1 " + x);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
