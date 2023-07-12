package timeConverter;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the minutes");
		double m= scan.nextDouble();
		System.out.println(convertToHours(m));
		
		

	}
	public static double convertToHours(double minutes)
	{
		return minutes/60 ;
	}

}
