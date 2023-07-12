package theTemperatureConvereter;

import java.util.Scanner;

public class TemperatureConvereterApp {

	public static void main(String[] args) {
		TemoeratureConvereter temperature = new TemoeratureConvereter();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the temperature in Fahrenheit");
		double F = scan.nextDouble();
		System.out.printf("the temperature in celcius is "+"%.2f",temperature.convertFahreheitToCelsius(F));
		

	}

		
		

	}



