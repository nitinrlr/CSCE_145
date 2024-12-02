/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;

public class DresserFrontEnd {
    public static void main(String[] args) {
        Dresser dresser = new Dresser();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the dresser!");

        while (running) {
            System.out.println("\nEnter 1: to add an item");
            System.out.println("Enter 2: to remove an item");
            System.out.println("Enter 3: to print out the dresser contents");
            System.out.println("Enter 9: to quit");

            System.out.print("\nYour choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("\nEnter the type");
                    System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
                    String type = scanner.nextLine().trim();

                    System.out.println("\nEnter a color");
                    System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
                    String color = scanner.nextLine().trim();

                    // Validation before creating the Clothing object
                    if (isValidType(type) && isValidColor(color)) {
                        Clothing clothing = new Clothing(type, color);
                        dresser.add(clothing);
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Invalid type or color entered. Item not added.");
                    }
                }
                case 2 -> {
                    System.out.println("\nEnter the type");
                    System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
                    String type = scanner.nextLine().trim();

                    System.out.println("\nEnter a color");
                    System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
                    String color = scanner.nextLine().trim();

                    // Validation before creating the Clothing object
                    if (isValidType(type) && isValidColor(color)) {
                        Clothing clothing = new Clothing(type, color);
                        dresser.remove(clothing);
                        System.out.println("Item removed successfully.");
                    } else {
                        System.out.println("Invalid type or color entered. Item not removed.");
                    }
                }
                case 3 -> {
                    System.out.println("\nDresser Contents:");
                    dresser.print();
                }
                case 9 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Helper methods for validation
    private static boolean isValidType(String type) {
        String[] validTypes = {"Undergarment", "Socks", "Stockings", "Top", "Bottom", "Cape"};
        for (String validType : validTypes) {
            if (validType.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidColor(String color) {
        String[] validColors = {"Brown", "Red", "Pink", "Black", "White", "Orange", "Green", "Blue", "Purple", "Grey"};
        for (String validColor : validColors) {
            if (validColor.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }
}