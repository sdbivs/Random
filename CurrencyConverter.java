import java.util.Scanner;
public class CurrencyConverter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String USD = "USD";
		String EUR = "EUR";
		String GBP = "GBP";
		String JPY = "JPY";
		String CAD = "CAD";
		String LEK = "LEK";
		
		System.out.println("Enter the amount: ");
		float money = (float) scanner.nextDouble();
		System.out.println("Enter the currency: USD, EUR, GBP, JPY, CAD");
		String currency = scanner.next();
		System.out.println("Chose one currency you want to convert in: USD, EUR, GBP, JPY, CAD.");
		String convert = scanner.next();
		
		float res = (float) 0;
		
		boolean usd = currency.toUpperCase().contains(USD);
		boolean eur = currency.toUpperCase().contains(EUR);
		boolean gbp = currency.toUpperCase().contains(GBP);
		boolean jpy = currency.toUpperCase().contains(JPY);
		boolean cad = currency.toUpperCase().contains(CAD);
		boolean lek = currency.toUpperCase().contains(LEK);
		
		if(usd){
			switch(convert.toLowerCase()){
				case "usd":
					res =  money;
					System.out.println(res);
				break;
				case "eur":
					res = money * 0.95f;
					System.out.println(res);
				break;
				case "gbp":
					res = money * 0.79f;
					System.out.println(res);
				break;
				case "jpy":
					res = money * 149.14f;
					System.out.println(res);
				break;
				case "cad":
					res = money * 1.43f;
					System.out.println(res);
				break;
				case "lek":
					res = money * 94.40f;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}else if(eur){
			switch(convert.toLowerCase()){
				case "usd":
					res = money * 1.05f;
					System.out.println(res);
				break;
				case "eur":
					res = money;
					System.out.println(res);
				break;
				case "gbp":
					res = money * 0.83f;
					System.out.println(res);
				break;
				case "jpy":
					res = money * 156.74f;
					System.out.println(res);
				break;
				case "cad":
					res = money * 1.50f;
					System.out.println(res);
				break;
				case "lek":
					res = money * 98.90f;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}else if(gbp){
			switch(convert.toLowerCase()){
				case "usd":
					res = money * 1.27f;
					System.out.println(res);
				break;
				case "eur":
					res = money * 1.20f;
					System.out.println(res);
				break;
				case "gbp":
					res = money;
					System.out.println(res);
				break;
				case "jpy":
					res = money * 188.86f;
					System.out.println(res);
				break;
				case "cad":
					res = money * 1.81f;
					System.out.println(res);
				break;
				case "lek":
					res = money * 119.25f;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}else if(jpy){
			switch(convert.toLowerCase()){
				case "usd":
					res = money * 0.0067f;
					System.out.println(res);
				break;
				case "eur":
					res = money * 0.0064f;
					System.out.println(res);
				break;
				case "gbp":
					res = money * 0.0053f;
					System.out.println(res);
				break;
				case "jpy":
					res = money;
					System.out.println(res);
				break;
				case "cad":
					res = money * 0.0096f;
					System.out.println(res);
				break;
				case "lek":
					res = money * 0.63f;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}else if(cad){
			switch(convert.toLowerCase()){
				case "usd":
					res = money * 0.70f;
					System.out.println(res);
				break;
				case "eur":
					res = money * 0.66f;
					System.out.println(res);
				break;
				case "gbp":
					res = money * 0.55f;
					System.out.println(res);
				break;
				case "jpy":
					res = money * 104.19f;
					System.out.println(res);
				break;
				case "cad":
					res = money;
					System.out.println(res);
				break;
				case "lek":
					res = money * 65.81f;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}else if(lek){
			switch(convert.toLowerCase()){
				case "usd":
					res = money * 0.011f;
					System.out.println(res);
				break;
				case "eur":
					res = money * 0.010f;
					System.out.println(res);
				break;
				case "gbp":
					res = money * 0.0084f;
					System.out.println(res);
				break;
				case "jpy":
					res = money * 1.58f;
					System.out.println(res);
				break;
				case "cad":
					res = money * 0.015f;
					System.out.println(res);
				break;
				case "lek":
					res = money;
					System.out.println(res);
				break;
				default:
					System.out.println("Currency is not available!");
			}
		}
		
	}
}