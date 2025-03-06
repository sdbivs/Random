import java.util.Scanner;
public class FinishTheQuotes{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nWelcome to Finish The Quote!\nWe say half a quote and you finish the rest, can you guess them all?\n");
		
		int score = 0;
		
		String[][] FullQuotes = { 
			{"The only thing we have to fear is fear itself", "I think, therefore I am", "To be, or not to be", "You either die a hero or you live long enough to see yourself become the villain", "Comfort is the enemy of progress"},
		
			{"Tears come from the heart, not from the brain", "Be so good they can't ignore you", "Legends never die", "Fear is a reaction. Courage is a decision", "Die with memories, not dreams"},

			{"Carpe diem", "Beauty is in the eye of the beholder", "The pen is mightier than the sword", "The grass is always greener on the other side", "When life gives you lemons, make lemonade"},

			{"Sometimes science is more art than science", "Your daughter Vanessa, judging by what she's learnt this term, has no hearing organs at all", "You look like someones grandmother gone wrong", "With great power comes great responsibility", "I cannot for the life of me understand why small children take so long to grow up"}
		};

	
		String[][] Quotes = { 
			{"The only thing we have to fear ", "I think, ", "To be, ", "You either die a hero ", "Comfort is "},
			
			{"Tears come from the heart, ", "Be so good ", "Legends never ", "Fear is a reaction. ", "Die with memories "},
			
			{"Carpe ", "Beauty is in the eye ", "The pen is mightier ", "The grass is always ", "When life gives you lemons, "},
			
			{"Sometimes science is ", "Your daughter Vanessa, judging by what she's learnt this term, ", "You look like someones grandmother ", "With great power ", "I cannot for the life of me understand why "}
		};
		
		for(int i = 0; i < 5; i++){
			int y = (int)(Math.random() * 4);
			int x = (int)(Math.random() * 3);
			System.out.print(Quotes[y][x]);
			String quote = scanner.nextLine();
			
			String guess = Quotes[y][x] + quote;
		
			boolean correct = FullQuotes[y][x].equals(guess);
		
			if(correct){
				System.out.println("Correct!");
				score++;
			}else{
				System.out.println("Incorrect!");
			}
		}
		
		System.out.println("Your score is: " + score + "/5");
	}
}