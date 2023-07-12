package financeCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principal , rate and time");
		double p  = scan.nextDouble();
		double r = scan.nextDouble();
		double t = scan.nextDouble();
		FinanceCalculator fc= new FinanceCalculator();
		System.out.println(fc.calculateSimpleInterest(p,r,t));

	}

}
