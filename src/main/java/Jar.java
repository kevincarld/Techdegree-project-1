import java.util.Random;

public class Jar {
	private String itemName;
	private int itemCount;
	private int theNum;
	
	
	public Jar(String itemName, int itemCount) {
		this.itemName = itemName;
		this.itemCount = itemCount;
		theNum = 0;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	//fill jar with random number
	public int fill() {
		Random random = new Random();
	    theNum = random.nextInt(itemCount) + 1;
	   //System.out.println(theNum);
	    return theNum;
	}
	
	public int getTheNum() {
		return theNum;
	}
	// win / lose
	public boolean guessResult(int number) {
		boolean winner = true;
		if (number > itemCount) {
			throw new IllegalArgumentException("Your guess must be less than " + itemCount);
		}	
		
		if (number < itemCount || number == itemCount) {
					
				if(number > theNum) {
					System.out.println("too high");
					winner = false;
				}
				else if (number < theNum) {
					System.out.println("too low");
					winner = false;
				}
				else if (number == theNum) {
					winner = true;
				}
		}		
		return winner;
		
	}
	
	
}