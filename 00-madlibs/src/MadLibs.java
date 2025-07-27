import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1, adjective2, adjective3,
                noun1, noun2, noun3,
                verb1, verb2, verb3;

        System.out.println("*** MAD LIBS GAME ***\n");

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a '-ing' verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter another noun: ");
        noun2 = scanner.nextLine();
        System.out.print("Enter another verb: ");
        verb2 = scanner.nextLine();

        System.out.print("And another adjective: ");
        adjective3 = scanner.nextLine();
        System.out.print("And a third noun: ");
        noun3 = scanner.nextLine();
        System.out.print("And a third verb: ");
        verb3 = scanner.nextLine();

        System.out.println("\n*** Your Mad Libs Story ***\n");
        System.out.println("There was once a " + adjective1 + " " + noun1 + " named Milo.");
        System.out.println("He was " + verb1 + " in school, when he thought about a " + noun2 +
                                   ".");
        System.out.println("A " + adjective2 + " " + noun2 + " " + verb2 + "!");
        System.out.println("Milo right then and there grabbed a " + noun3 + ", started " +
                                   verb3 + ",\nand suddenly became " + adjective3 + "!");

        scanner.close();

    }

}