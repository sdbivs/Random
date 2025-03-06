import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type your wight: ");
		float kg = scanner.nextFloat();
		System.out.print("Type your height: ");
		float m = scanner.nextFloat();
		
		float res = (float)kg / (float)(Math.pow(m, 2));
		
		if(res < 18.5){
			System.out.println("Under the recommended weight");
		}else if(res >= 18.5 && res <= 24.9){
			System.out.println("In the recommended weight");
		}else if(res >= 25.0 && res <= 29.9){
			System.out.println("Over the recommended weight");
		}else{
			System.out.println("Obese");
		}
		
		System.out.println(res);
	}
}
