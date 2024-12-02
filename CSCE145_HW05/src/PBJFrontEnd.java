/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;

public class PBJFrontEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-----Sandwich 1-----");
            PBJSandwich sandwich1 = createSandwich(scanner);

            System.out.println("\n-----Sandwich 2-----");
            PBJSandwich sandwich2 = createSandwich(scanner);

            System.out.println("\n-----Sandwich 1-----");
            System.out.println(sandwich1);

            System.out.println("\n-----Sandwich 2-----");
            System.out.println(sandwich2);

            if (sandwich1.equals(sandwich2)) {
                System.out.println("\nAre they the same sandwich? true.");
            } else {
                System.out.println("\nAre they the same sandwich? false.");
            }

            System.out.print("\nWould you like to restart (y/n)? ");
            scanner.nextLine();  // Clear the newline left by the previous input
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        
        scanner.close();
    }

    private static PBJSandwich createSandwich(Scanner scanner) {
        Bread topSlice = new Bread();
        Bread bottomSlice = new Bread();
        PeanutButter peanutButter = new PeanutButter();
        Jelly jelly = new Jelly();

        System.out.println("\nTop Slice of Bread Information");
        System.out.print("Enter name of the bread: ");
        topSlice.setName(scanner.nextLine());

        topSlice.setCalories(askForCalories(scanner));

        topSlice.setType(askForBreadType(scanner));

        System.out.println("\nPeanut Butter Information");
        System.out.print("Enter name of the peanut butter: ");
        peanutButter.setName(scanner.nextLine());

        peanutButter.setCalories(askForCalories(scanner));

        peanutButter.setCrunchy(askForBoolean(scanner, "Is it crunchy? Enter \"true\", or \"false\": "));

        System.out.println("\nJelly Information");
        System.out.print("Enter name of the jelly: ");
        jelly.setName(scanner.nextLine());

        jelly.setCalories(askForCalories(scanner));

        jelly.setFruitType(askForFruitType(scanner));

        System.out.println("\nBottom Slice of Bread Information");
        System.out.print("Enter name of the bread: ");
        bottomSlice.setName(scanner.nextLine());

        bottomSlice.setCalories(askForCalories(scanner));

        bottomSlice.setType(askForBreadType(scanner));

        PBJSandwich sandwich = new PBJSandwich();
        sandwich.setTopSlice(topSlice);
        sandwich.setBottomSlice(bottomSlice);
        sandwich.setPeanutButter(peanutButter);
        sandwich.setJelly(jelly);

        return sandwich;
    }

    private static int askForCalories(Scanner scanner) {
        int calories;
        while (true) {
            System.out.print("Enter the number of calories: ");
            if (scanner.hasNextInt()) {
                calories = scanner.nextInt();
                scanner.nextLine();  // Clear newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();  // Clear invalid input
            }
        }
        return calories;
    }

    private static String askForBreadType(Scanner scanner) {
        String type;
        while (true) {
            System.out.print("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\": ");
            type = scanner.nextLine();
            if (type.equalsIgnoreCase("Honey Wheat") || type.equalsIgnoreCase("White") ||
                type.equalsIgnoreCase("Whole Grain") || type.equalsIgnoreCase("Whole Wheat")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter one of the specified bread types.");
            }
        }
        return type;
    }

    private static boolean askForBoolean(Scanner scanner, String message) {
        boolean result;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextBoolean()) {
                result = scanner.nextBoolean();
                scanner.nextLine();  // Clear newline
                break;
            } else {
                System.out.println("Invalid input. Please enter \"true\" or \"false\".");
                scanner.nextLine();  // Clear invalid input
            }
        }
        return result;
    }

    private static String askForFruitType(Scanner scanner) {
        String type;
        while (true) {
            System.out.print("Enter the fruit type. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\": ");
            type = scanner.nextLine();
            if (type.equalsIgnoreCase("Apple") || type.equalsIgnoreCase("Blueberry") ||
                type.equalsIgnoreCase("Grape") || type.equalsIgnoreCase("Strawberry") ||
                type.equalsIgnoreCase("Tomato")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter one of the specified fruit types.");
            }
        }
        return type;
    }
}