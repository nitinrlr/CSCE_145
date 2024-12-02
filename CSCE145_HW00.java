/*
 * Nitin Bhupatiraju
 */
import java.util.Scanner;
public class CSCE145_HW00 {

	public static void main(String[] args) {
			System.out.println("Hello!\nType two, four-digit binary numbers.");
			Scanner keyboard = new Scanner(System.in);
			String binary1 = keyboard.nextLine();
			String binary2 = keyboard.nextLine();
			//This code takes input from the user and makes it into a variable.
			
			System.out.println("So you chose "+binary1+ " and " +binary2+ ". Interesting...");
			
			int decimal1 = 0;
			int decimal2 = 0;
			//This code makes the variable start at zero so it is ready for the conversion process.
			
			decimal1 += (binary1.charAt(0)-'0')*8;
			decimal1 += (binary1.charAt(1)-'0')*4;
			decimal1 += (binary1.charAt(2)-'0')*2;
			decimal1 += (binary1.charAt(3)-'0')*1;
			
			decimal2 += (binary2.charAt(0)-'0')*8;
			decimal2 += (binary2.charAt(1)-'0')*4;
			decimal2 += (binary2.charAt(2)-'0')*2;
			decimal2 += (binary2.charAt(3)-'0')*1;
			//This code will take the 4 digits the user input, and converts them into binary.
			
			int sum = decimal1+decimal2;
			//This code serves to add up the decimal values.
			
			System.out.println("The decimal value of " +binary1+ " is " +decimal1+ ".");
			//This code tells the user the decimal value of the first binary value they input.
			System.out.println("The decimal value of " +binary2+ " is " +decimal2+ ".");
			//This code tells the user the decimal value of the second binary value they input.
			System.out.println("If we add together " +decimal1+ " and " +decimal2+ ", \nwe get " +sum+ ".");
			//This tells us the final result we are looking for.
	}
}