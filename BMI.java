import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Shkruajeni peshen e juaj:");
		float kg = scanner.nextFloat();
		System.out.println("Shkruajeni gjatesine e juaj:");
		float m = scanner.nextFloat();
		
		float res = (float)kg / (float)(Math.pow(m, 2));
		
		if(res < 18.5){
			System.out.println("Nen peshen e rekomanduar");
		}else if(res >= 18.5 && res <= 24.9){
			System.out.println("Ne peshen e rekomanduar");
		}else if(res >= 25.0 && res <= 29.9){
			System.out.println("Mbi peshen e rekomanduar");
		}else{
			System.out.println("Obes");
		}
		
		System.out.println(res);
	}
}