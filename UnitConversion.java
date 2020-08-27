import java.util.Scanner;
public class UnitConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double CONVERSION_RATE = 0.0254;
		double userInput = 0.0;

		System.out.println("Enter a number of inches to convert:");
		userInput = scan.nextDouble();
		
		System.out.println(userInput + " inches equals " + (userInput * CONVERSION_RATE) + " meters.");
		scan.close();
	}

}
