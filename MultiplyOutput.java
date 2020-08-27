import java.util.Scanner;
public class MultiplyOutput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstNum = 0.0, secondNum = 0.0;
		
		System.out.print("Enter first Number: ");
		firstNum = scan.nextDouble();
		System.out.print("Enter second Number: ");
		secondNum = scan.nextDouble();
		
		System.out.println("Product of " + firstNum + " and " + secondNum + " is " + (firstNum * secondNum) + ".");
		
		scan.close();
	}

}
