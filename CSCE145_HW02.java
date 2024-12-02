/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;
import java.util.Random;
public class CSCE145_HW02 {

	public static void main(String[] args) {
		playGame();
	}
	public static void playGame() {
		System.out.println("Lets play 3 rounds of rock paper scissors! Input 'rock' 'paper' or 'scissors' to make your choice.");
		Scanner keyboard = new Scanner(System.in);
		
		int rounds = 3;
		int userScore = 0;
		int systemScore = 0;
		String[] options = {"rock", "paper", "scissors"};
	    Random random = new Random();
	    int index = random.nextInt(options.length); //System's random choice
	    String systemchoice = options[index]; // Stores the random choice in the variable 'systemchoice'
		
	    for (int i = 1; i <= rounds; i++)
	    {
	    	System.out.println("Round "+ i +". Enter your choice: rock, paper, or scissors.");
	    
	    
		String choice1 = keyboard.nextLine();
			if (choice1.equalsIgnoreCase("rock") && systemchoice == ("rock"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("No point given");
			}
			
			else if (choice1.equalsIgnoreCase("rock") && systemchoice == ("paper"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("System +1 pt!");
				systemScore++;
			}	
			else if (choice1.equalsIgnoreCase("rock") && systemchoice == ("scissors"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("You get +1 pt!");
				userScore++;
			}		
			else if (choice1.equalsIgnoreCase("paper") && systemchoice == ("paper"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("No point given!");
			}
			else if (choice1.equalsIgnoreCase("paper") && systemchoice == ("rock"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("You get +1 pt!");
				userScore++;
			}			
			else if (choice1.equalsIgnoreCase("paper") && systemchoice == ("scissors"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("System +1 pt!");
				systemScore++;
			}			
			else if (choice1.equalsIgnoreCase("scissors") && systemchoice == ("scissors"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("No point given!");
			}			
			else if (choice1.equalsIgnoreCase("scissors") && systemchoice == ("rock"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("System +1 pt!");
				systemScore++;
			}
			else if (choice1.equalsIgnoreCase("scissors") && systemchoice == ("paper"))
			{
				System.out.println("System's choice: " + systemchoice);
				System.out.println("You get +1 pt!");
				userScore++;
			}			
			else
			{
				System.out.println("Invalid input, System +1 pt.");
				systemScore++;
			}
	    }
	    System.out.println("\nYour score: " +userScore+"\nSystem score: " +systemScore);
		if (userScore > systemScore)
		{
			System.out.println("You win!");
		}
		else if (userScore < systemScore)
		{
			System.out.println("System wins!");
		}
		else if (userScore == systemScore)
		{
			System.out.println("It's a tie!");			
		}
		
		System.out.println("\nDo you want to play again? (yes or no)");
        String playAgain = keyboard.nextLine();

        if (playAgain.equalsIgnoreCase("yes")) 
        {
            playGame(); // Will replay the game if "yes" is selected
        } 
        else 
        {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }	
	}
}
