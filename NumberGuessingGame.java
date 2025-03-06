import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(5);
		
		System.out.println("Welcome to the Number Guessing Game!\nYou have 5 guesses to try and find the number between 1 and 10\nEnter your first guess:");
		int guess = scanner.nextInt();
		
		for(int i = 0; i <= 5; i++){
			if(guess < number){
				System.out.println("Higher");
			}else if(guess > number){
				System.out.println("Lower");
			}else if(guess == number){
				System.out.println("Congratulations you won!!!");
				i = 6;
			}
		}
		
		
		
	}
}