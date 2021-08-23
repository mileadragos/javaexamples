package excercise3;

import java.util.Scanner;

public class NumberGuessing {
    public static void guessingNumberGame() {
    	Scanner sc = new Scanner(System.in);
    	String playAgain = "";
    	do {
	        int number = 1 + (int)(100 * Math.random());
	        int K = 5;
	        int i, guess;
	        System.out.println(
	            "A number is chosen"
	            + " between 1 to 100."
	            + " Guess the number"
	            + " within 5 trials.");
	        for (i = 0; i < K; i++) {
	            System.out.println("Guess the number:");
	            guess = sc.nextInt();
	            if (number == guess) {
	            	i = i + 1;
	                System.out.println("Congratulations!" + " You guessed the number from the " + i + " try.");
	                break;
	            }
		            else if (number > guess && i != K - 1) {
		                System.out.println("The number is " + "greater than " + guess);
		            }
			            else if (number < guess && i != K - 1) {
			                System.out.println("The number is" + " less than " + guess);
			            }
	        }
		        if (i == K) {
		            System.out.println("You have exhausted" + " the 5 trials.");
		  
		            System.out.println("The number was " + number);
		        }
		        
		        System.out.println("Would you like to play again?(y/n).");
		        
		        playAgain = sc.next();
	        
    	}while(playAgain.equalsIgnoreCase("y"));
    	sc.close();
    }
  
    public static void
    	main(String arg[])
    	{
        	guessingNumberGame();
    	}
}

