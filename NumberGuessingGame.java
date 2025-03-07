import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random() * 101);
		boolean won = false;
		
		System.out.println("\nGuess a number between 0 and 100. \nYou have 10 Guesses!\n");
		
		for(int i = 0; i < 10;){
			int guess = scanner.nextInt();
			if(guess == randomNumber){
				i = 10;
				won = true;
			}else if(guess < randomNumber){
				System.out.println("Higher!");
				i++;
			}else if(guess > randomNumber){
				System.out.println("Lower!");
				i++;
			}else{
				System.out.println("Input invalid! Try again.");
			}
		}
		
		if(won){
			System.out.println("Congratulations you WON!!! The number was: " + randomNumber + ".");
		}else{
			System.out.println("You LOST!!! The number is: " + randomNumber + ".");
		}
	}
}
