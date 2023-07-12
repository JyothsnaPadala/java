package planetExplorer;

import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of the sphere");
		double radius = scan.nextDouble();
		PlanetExplorer surfaceArea = new PlanetExplorer();
		System.out.printf("%.2f",surfaceArea.calculateSurfaceArea(radius));
		
		

	}

}
