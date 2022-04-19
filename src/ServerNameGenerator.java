
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = new String[10];
        adjectives[0] = "attractive";
        adjectives[1] = "bored";
        adjectives[2] = "careful";
        adjectives[3] = "dark";
        adjectives[4] = "easy";
        adjectives[5] = "fair";
        adjectives[6] = "gleaming";
        adjectives[7] = "hurt";
        adjectives[8] = "jealous";
        adjectives[9] = "kind";


        String[] nouns = new String[10];
        nouns[0] = "area";
        nouns[1] = "book";
        nouns[2] = "case";
        nouns[3] = "day";
        nouns[4] = "eye";
        nouns[5] = "family";
        nouns[6] = "group";
        nouns[7] = "home";
        nouns[8] = "month";
        nouns[9] = "part";


        int randomAdj = (int) (Math.random() * adjectives.length - 1);
        int random = (int) (Math.random() * nouns.length - 1);

        System.out.println();

        System.out.println("Randomly generated server name: \n" + adjectives[randomAdj] + "-" + nouns[random] + ".");


    }
    }