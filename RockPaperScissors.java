import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nWelcome to Rock, Paper, Scissors!\nCan you beat me in a Best Of Three?\n");
		System.out.println("Throw \"Rock\", \"Paper\", or \"Scissors\" to start!");
		
		String[] ProgramChoice = {"Rock", "Paper", "Scissors"};
		int score = 0;
		
		for(int i = 0; i <3;){
			System.out.print("You: ");
			String player = scanner.next().toLowerCase();
			int playerChoice;
			int program = (int)(Math.random() * 3);
			
			switch(player){
			case "rock":
				playerChoice = 0;
			break;
			case "paper":
				playerChoice = 1;
			break;
			case "scissors":
				playerChoice = 2;
			break;
			default:
				System.out.println("Not a valid response!");
			continue;
			}
		
			if(playerChoice == program){
				System.out.println("Opponent: " + ProgramChoice[program]);
				System.out.println(player + " ties " + ProgramChoice[program]);
			}else if(playerChoice == 2 && program == 1){
				System.out.println("Opponent: " + ProgramChoice[program]);
				System.out.println(player + " beats " + ProgramChoice[program]);
				score++;
				i++;
			}else if(playerChoice == 1 && program == 0){
				System.out.println("Opponent: " + ProgramChoice[program]);
				System.out.println(player + " beats " + ProgramChoice[program]);
				score++;
				i++;
			}else if(playerChoice == 0 && program == 2){
				System.out.println("Opponent: " + ProgramChoice[program]);
				System.out.println(player + " beats " + ProgramChoice[program]);
				score++;
				i++;
			}else{
				System.out.println("Opponent: " + ProgramChoice[program]);
				System.out.println(ProgramChoice[program] + " beats " + player);
				i++;
			}
		}
		
		if(score >= 2){
			System.out.print("Congratulationss you won!!! ");
		}else{
			System.out.print("Oh no you lost! ");
		}
		
		System.out.println("Your score was: " + score + "/3");
		
	}
}
