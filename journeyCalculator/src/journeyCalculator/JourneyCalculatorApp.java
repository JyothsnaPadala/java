package journeyCalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
	
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the  speed ");
			double s = scan.nextDouble();
			System.out.println("enter the time ");
			double t=scan.nextDouble();
			JorneyCalculator journey = new JorneyCalculator();
			System.out.printf("the distace is "+"%.2f",journey.calculateDistance(s,t));
			
			

		}

	}

