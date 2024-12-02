/*
 * Nitin Bhupatiraju
 */
import java.util.Random;
import java.util.Scanner;

public class CSCE145_HW04 {
    
    public static void main(String[] args) {
        CarGame game = new CarGame();
        game.play();
    }
}

class CarGame {
    private static final int SIZE = 10;
    private static final char EMPTY = '_';
    private static final char PLAYER = 'X';
    private static final char HOME = '^';
    private static final char POTHOLE = 'O';

    private char[][] grid = new char[SIZE][SIZE];
    private int playerRow = 0, playerCol = 0;
    private Random random = new Random();

    // Initializes the game environment
    private void initializeGame() {
        // Reset player position to the top-left corner
        playerRow = 0;
        playerCol = 0;

        // Fill grid with empty spaces
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }

        // Place the player and home
        grid[0][0] = PLAYER;
        grid[SIZE - 1][SIZE - 1] = HOME;

        // Place exactly 5 potholes in unique locations
        int potholes = 0;
        while (potholes < 5) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            if (grid[row][col] == EMPTY) {
                grid[row][col] = POTHOLE;
                potholes++;
            }
        }
    }

    // Displays the game grid, hiding potholes from view
    private void displayGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == playerRow && j == playerCol) {
                    System.out.print(PLAYER + " ");
                } else if (i == SIZE - 1 && j == SIZE - 1) {
                    System.out.print(HOME + " ");
                } else {
                    System.out.print(EMPTY + " ");
                }
            }
            System.out.println();
        }
    }

    // Moves the player based on input direction
    private boolean movePlayer(String direction) {
        int newRow = playerRow;
        int newCol = playerCol;

        // Update coordinates based on direction
        switch (direction.toUpperCase()) {
            case "N": newRow--; break;
            case "S": newRow++; break;
            case "E": newCol++; break;
            case "W": newCol--; break;
            case "NE": newRow--; newCol++; break;
            case "NW": newRow--; newCol--; break;
            case "SE": newRow++; newCol++; break;
            case "SW": newRow++; newCol--; break;
            default:
                System.out.println("Invalid direction. Use N, S, E, W, NE, NW, SE, or SW.");
                return false;
        }

        // Check if new position is within bounds
        if (newRow >= 0 && newRow < SIZE && newCol >= 0 && newCol < SIZE) {
            // Move player to the new location
            grid[playerRow][playerCol] = EMPTY;
            playerRow = newRow;
            playerCol = newCol;
            return true;
        } else {
            System.out.println("Out of bounds. Try a different direction.");
            return false;
        }
    }

    // Checks if the player has won, lost, or can keep playing
    private String checkGameStatus() {
        if (playerRow == SIZE - 1 && playerCol == SIZE - 1) {
            return "win";
        } else if (grid[playerRow][playerCol] == POTHOLE) {
            return "lose";
        }
        return "continue";
    }

    // Starts the game
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            initializeGame();
            String status = "continue";

            while (status.equals("continue")) {
                displayGame();
                System.out.print("Move (N, S, E, W, NE, NW, SE, SW): ");
                String direction = scanner.nextLine();

                if (movePlayer(direction)) {
                    status = checkGameStatus();
                }
            }

            displayGame();
            if (status.equals("win")) {
                System.out.println("Congratulations! You reached home safely.");
            } else if (status.equals("lose")) {
                System.out.println("Game over! You hit a pothole.");
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                playing = false;
            }
        }

        scanner.close();
    }
}
