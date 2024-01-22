import java.util.Scanner;

public class NumberGuessingGame 
{
   
    public static void guessingNumberGame()
	{
     
     try (Scanner sc = new Scanner(System.in)) {
		int number = 1 + (int)(100 * Math.random());
		 int K = 5;

		 int i, guess;

		 System.out.println("Welcome to Guess Number Game." + "You Will Be Asked To Guess A Number To Win The Game." + " You have Maximum 5 Attemp Limit."+" Enter a guess number between 1 to 100.");
		     
		 for (i = 0; i < K; i++) {

		     System.out.println(
		         "Guess the number:");

		     
		     guess = sc.nextInt();

		    
		     if (number == guess) {
		         System.out.println(
		             "OOHHOO!"
		             + " Your Number is correct.You Win the Game!");
		         break;
		     }
		     else if (number > guess
		              && i != K - 1) {
		         System.out.println(
		             "The number is "
		             + "greater than " + guess);
		     }
		     else if (number < guess
		              && i != K - 1) {
		         System.out.println(
		             "The number is"
		             + " less than " + guess);
		             
		     }
		 }

		 if (i == K) {
		     System.out.println(
		         "You have exhausted"
		         + " K trials.");

		     System.out.println(
		         "The number was " + number);
		        
		 }
		 sc.close();
	}

     }
    public static void main(String arg[])
    {
	 guessingNumberGame();
    }
}

