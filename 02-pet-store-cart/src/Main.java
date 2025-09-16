import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PET STORE SHOPPING CART

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("Welcome to Zouzou's Pet Store!");
        System.out.print("What item would you like to purchase for your pet: ");
        item = scanner.nextLine();

        System.out.print("Item's price: ");
        price = scanner.nextDouble();

        System.out.print("How many are you purchasing: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        String summary =
                "You purchased " + quantity + " " + item.toLowerCase() + (quantity == 1 ? "."
                                                                                        : "s.");

        System.out.print("\n");
        System.out.println(summary);
        System.out.println("Your total is " + currency + total + ".\n");
        System.out.println("Thank you for supporting Zouzou's Pet Store!");

        scanner.close();

    }
}