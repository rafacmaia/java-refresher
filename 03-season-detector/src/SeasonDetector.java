import java.util.Scanner;

public class SeasonDetector {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int birthMonth;

        System.out.println("*** SEASON DETECTOR ***");
        System.out.println(
                "I can magically tell you which season you were born in! It's crazy, right?\n");

        System.out.print("What's your name? ");
        name = scanner.nextLine();

        System.out.print("Enter your birth month (1-12): ");
        birthMonth = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        if (birthMonth <= 0 || birthMonth >= 13) {
            System.out.println("No, no, I don't think so.");
        } else if (birthMonth <= 3) {
            System.out.println(name + ", you're a winter baby ❄️!");
        } else if (birthMonth <= 6) {
            System.out.println("Look at that, " + name + ", you're a spring baby 🌸!");
        } else if (birthMonth <= 9) {
            System.out.println("Oh wow " + name + ", you're a summer baby ☀️!");
        } else {
            System.out.println("Sweet! " + name + ", you're a fall baby 🍁!");
        }

        scanner.close();
    }
}
