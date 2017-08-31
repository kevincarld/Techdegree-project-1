public class GuessingGame {
   public static void main(String[] args) {
      
	   
	   
	   Prompter io = new Prompter();
	   
	   //admin setup
	   io.adminSetup();
	   
	   //get item name and item count
	    String itemName = io.askItem();
	    int itemCount = io.askItemCount();

	    //open jar
	    Jar jar = new Jar(itemName, itemCount);
	    
	   //player setup
	    io.playerSetup();
	    jar.fill();
     
      //gametime
	    int attempt = 0;
	    boolean isWon = false;
	    while(!isWon && attempt < itemCount) {
	    	try{	
	    		int guess = io.getGuess();
	    		isWon = jar.guessResult(guess);
	    		attempt++;
	    	} catch (IllegalArgumentException iae){
	    		System.out.println(iae.getMessage());
	    	}
	    } 
	   
      //win or lose
	    if(isWon){
	    	System.out.println("you got it in " + attempt + " attempts");
	    }
	   else {
	    		System.out.println("attempts has reached its limit. The number we are looking for is " + jar.getTheNum());
	    	}
	   
   }
}