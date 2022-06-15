
package newpackage;
import java.util.Scanner;

public class LoanCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		

		//calc
		for (int i=3; i<3; i++){
			System.out.println("For 1st month");
			amount=amount-amount*10/100;
			System.out.println("Remain amount is"+amount);

												}	
}
}

