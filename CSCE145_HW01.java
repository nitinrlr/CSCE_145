/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;
public class CSCE145_HW01 {

	public static void main(String[] args) {
		System.out.println("You've just been teleported to a new world!\nWould you like to enter the cave, fight the dragon ahead, or sit and do nothing?\nType '1' or '2' or '3'");
		Scanner keyboard = new Scanner(System.in);
		int choice1 = keyboard.nextInt();
		
		if(choice1 == 1) // Numeric comparison
		{
			System.out.println("How old are you?");
			int age = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.println("This place is very dark...\nA fork in the path appears, should you go left, or right?\nType 'left' or 'right'");
			String choice2 = keyboard.nextLine(); // String comparison
				if(choice2.equalsIgnoreCase("left") || age < 18) // .equalsIgnoreCase used, allowing "LEFT" or "left" to be a valid answer
				{
					System.out.println("You are either too young or chose the wrong path and get lost in the darkness forever... YOU DIED (ending 1/10)");
					System.exit(0);
				}
				else if(choice2.equalsIgnoreCase("right") && age >= 18) // Compound boolean expression
				{
					System.out.println("You come across a witch, who offers to teleport you back to your own world!\nWill you accept, or decline?\nType '10' or '11'");
					int choice5 = keyboard.nextInt();
						if(choice5 == 10) 
						{
							System.out.println("You timidly accept. The next thing you know you are back in class which is where you were before you got teleported.\nYou start to wonder if you really made the correct decision...\nYOU WIN..? (ending 4/10)");
						}
						else if(choice5 == 11)
						{
							System.out.println("The witch, upon hearing that you declined her offer turns you into a puny slime!\n'Spend the rest of your days as a worthless blob!' she says. YOU DIED..? (ending 3/10)");
							System.exit(0);
						}
						else
						{
							System.out.println("Invalid choice, must restart.");
							System.exit(0);
						}
				}
				else
				{
					System.out.println("Invalid choice, must restart.");
					System.exit(0);
				}

		}
		else if(choice1 == 2)
		{
			System.out.println("No turning back now!\nThe dragon lets out a staggering roar and prepares for a tail swipe. Will you try and jump over it, or duck under it?\nType '6' or '7'");
			int choice3 = keyboard.nextInt();
				if(choice3 == 6)
				{
					System.out.println("The tail swings low, jumping was the correct choice! The dragon is on it's last legs, buts it's charging up a massive fireball!\nQuick! Will you try and deflect it back at the dragon, or take cover by the ruins?\nType '12' or '13'");
					int choice6 = keyboard.nextInt();
						if(choice6 == 12)
						{
							System.out.println("Considering the fact that you don't have any tools or armor, the outcome of this choice is fairly obvious.\nYOU DIED (ending 5/10)");
						}
						else if(choice6 == 13)
						{
							System.out.println("Smart choice. The blast shakes the ground while you take cover. Now is your chance, deal the finishing blow!\nAim for the head or the heart? Type 'head' or 'heart'");
							String choice7 = keyboard.nextLine();
								if(choice7.equalsIgnoreCase("head"))
								{
									System.out.println("The dragon has been slain! Word spreads to nearby villages and eventually the king of the land!\nYou have become the hero of the land and live happily ever after! YOU WIN (ending 7/10)");
									System.exit(0);
								}
								else if(choice7.equalsIgnoreCase("heart"))
								{
									System.out.println("'You should have gone for the head...' YOU DIED (ending 6/10");
									System.exit(0);
								}
								else
								{
									System.out.println("Invalid choice, must restart.");
									System.exit(0);
								}
						}
						else
						{
							System.out.println("Invalid choice, must restart.");
							System.exit(0);
						}
				}
				else if(choice3 == 7)
				{
					System.out.println("The tail smacks you in the torso and sends you blasting off away! YOU DIED (ending 2/10)");
					System.exit(0);
				}
				else
				{
				System.out.println("Invalid choice, must restart.");
				System.exit(0);
				}
		}
		else if(choice1 == 3)
		{
			System.out.println("There is nothing but tall trees all around...\nYour stomach growls, will you climb the trees in search of fruit, or stay on the ground?\nType '8' or '9'");
			int choice4 = keyboard.nextInt();
				if(choice4 == 8)
				{
					System.out.println("You're halfway up the tree and spot a large birds nest filled with eggs!\nWill you take them, or continue climbing?\nType '16' or '17'");
					int choice8 = keyboard.nextInt();
						if(choice8 == 16)
						{
							System.out.println("As you are snatching the eggs, the mother, a huge red dragon flies over. She wasn't very happy when she saw her babies getting snatched.\nShe launches you off the tree... nothing breaks your fall... YOU DIED (ending 9/10)");
							System.exit(0);
						}
						else if(choice8 == 17)
						{
							System.out.println("Confident in your gut instinct, you continue to climb. At the top of the tree you see a nearby village!\nYou safely climb down and make your way there. The villagers are nice folk, who teach you the ways of their people.\nPeaceful days are ahead... YOU WIN (ending 10/10)");
							System.exit(0);
						}
						else
						{
							System.out.println("Invalid choice, must restart.");
							System.exit(0);
						}
				}
				else if(choice4 == 9)
				{
					System.out.println("Night has fallen, its freezing cold. You have wasted all this time doing absolutely nothing and die of low temps. YOU DIED (ending 8/10)");
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid choice, must restart.");
					System.exit(0);
				}
		}
		else
		{
			System.out.println("Invalid choice, must restart.");
			System.exit(0); // These lines are written to stop the system from running if the user made an invalid choice
		}
	}
}