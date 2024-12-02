/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;
public class CSCE145_HW03 {

    static class Rectangle 
    {
        double length;
        double width;

        Rectangle(double length, double width) 
        {
            this.length = length;
            this.width = width;
        }

        double getArea() 
        {
            return length * width;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rectangles do you want to create? ");
        int numRectangles = scanner.nextInt();

        Rectangle[] rectangles = new Rectangle[numRectangles];

        for (int i = 0; i < numRectangles; i++) 
        {
            System.out.println("Enter length for rectangle " + (i + 1) + ": ");
            double length = scanner.nextDouble();
            System.out.println("Enter width for rectangle " + (i + 1) + ": ");
            double width = scanner.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }

        boolean running = true;
        while (running) 
        {
            System.out.println("\nChoose an option:");
            System.out.println("1. Sort and display areas from Smallest to Largest");
            System.out.println("2. Sort and display areas from Largest to Smallest");
            System.out.println("3. Display the Average Area of the rectangles");
            System.out.println("4. Display the Minimum area in the collection");
            System.out.println("5. Display the Maximum area in the collection");
            System.out.println("6. Quit the program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    sortRectanglesByArea(rectangles, true);
                    displayAreas(rectangles);
                    break;
                case 2:
                    sortRectanglesByArea(rectangles, false);
                    displayAreas(rectangles);
                    break;
                case 3:
                    System.out.println("Average area: " + calculateAverageArea(rectangles));
                    break;
                case 4:
                    System.out.println("Minimum area: " + findMinArea(rectangles));
                    break;
                case 5:
                    System.out.println("Maximum area: " + findMaxArea(rectangles));
                    break;
                case 6:
                    System.out.println("Quitting the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Function to sort rectangles by area
    public static void sortRectanglesByArea(Rectangle[] rectangles, boolean ascending) 
    {
        for (int i = 0; i < rectangles.length - 1; i++) 
        {
            for (int j = 0; j < rectangles.length - 1 - i; j++) 
            {
                if (ascending ? rectangles[j].getArea() > rectangles[j + 1].getArea() 
                              : rectangles[j].getArea() < rectangles[j + 1].getArea()) 
                {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }
    }

    // Function to display areas of all rectangles
    public static void displayAreas(Rectangle[] rectangles) 
    {
        System.out.println("Rectangles' areas:");
        for (Rectangle rectangle : rectangles) 
        {
            System.out.println(rectangle.getArea());
        }
    }

    // Function to calculate average area
    public static double calculateAverageArea(Rectangle[] rectangles) 
    {
        double totalArea = 0;
        for (Rectangle rectangle : rectangles) 
        {
            totalArea += rectangle.getArea();
        }
        return totalArea / rectangles.length;
    }

    // Function to find minimum area
    public static double findMinArea(Rectangle[] rectangles) 
    {
        double minArea = rectangles[0].getArea();
        for (Rectangle rectangle : rectangles) 
        {
            if (rectangle.getArea() < minArea) 
            {
                minArea = rectangle.getArea();
            }
        }
        return minArea;
    }

    // Function to find maximum area
    public static double findMaxArea(Rectangle[] rectangles) 
    {
        double maxArea = rectangles[0].getArea();
        for (Rectangle rectangle : rectangles) 
        {
            if (rectangle.getArea() > maxArea) 
            {
                maxArea = rectangle.getArea();
            }
        }
        return maxArea;
    }
}
