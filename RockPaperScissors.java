import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nWelcome to Rock, Paper, Scissors!\nCan you beat me in a Best Of Three?\n");
		System.out.println("Throw \"Rock\", \"Paper\", or \"Scissors\" to start!");
		
		String[] RockPaperScissors = {"Rock", "Paper", "Scissors"};
		int decision = 3;
		int score = 0;
		
		for(int i = 0; i <3;){
			System.out.print("You: ");
			String player = scanner.next();
			int choice = (int)(Math.random() * 3);
			
			switch(player){
			case "Rock":
			case "rock":
			case "ROCK":
				decision = 0;
			break;
			case "Paper":
			case "paper":
			case "PAPER":
				decision = 1;
			break;
			case "Scissors":
			case "scissors":
			case "SCISSORS":
				decision = 2;
			break;
			default:
				System.out.println("Not a valid response!");
				continue;
			}
		
			if(decision == choice){
				System.out.println("Opponent: " + RockPaperScissors[choice]);
				System.out.println(player + " ties " + RockPaperScissors[choice]);
			}else if(decision == 2 && choice == 1){
				System.out.println("Opponent: " + RockPaperScissors[choice]);
				System.out.println(player + " beats " + RockPaperScissors[choice]);
				score++;
				i++;
			}else if(decision == 1 && choice == 0){
				System.out.println("Opponent: " + RockPaperScissors[choice]);
				System.out.println(player + " beats " + RockPaperScissors[choice]);
				score++;
				i++;
			}else if(decision == 0 && choice == 2){
				System.out.println("Opponent: " + RockPaperScissors[choice]);
				System.out.println(player + " beats " + RockPaperScissors[choice]);
				score++;
				i++;
			}else{
				System.out.println("Opponent: " + RockPaperScissors[choice]);
				System.out.println(RockPaperScissors[choice] + " beats " + player);
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
