import java.util.Scanner;
	
public class Prompter {
	Scanner in = new Scanner(System.in);
	private String itemName;
	private int itemCount;
	
	
	//administrator setup
	public void adminSetup() {
		System.out.println("ADMINISTRATOR SETUP");
		System.out.println("=============================");
	}
	
	//player setup
	public void playerSetup() {
		System.out.printf("%nPLAYER");
		System.out.println("=============================");
		System.out.printf("How many %s are in the jar? Pick a number between 1 and %d %n", itemName, itemCount);
	}
	//asking the item
	public String askItem() {
		System.out.print("What type of item? ");
		itemName = in.nextLine();
		return itemName;
	}
	//asking the max amount that can be stored in the jar
	public int askItemCount() {
		System.out.printf("What is the maximum amount of %s? ", itemName);
		itemCount = in.nextInt();
		return itemCount;
	}
	//prompt for guess
	public int getGuess() {
		System.out.print("guess: ");
		int guess = in.nextInt();
		return guess;
	}

	
	
	
}