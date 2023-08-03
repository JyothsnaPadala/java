import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)

	{

		if(sides == 3)
		{
			System.out.println("The Shape formed with the sides given as "+sides+" will be Triangle");
		}
		else if(sides == 4)
		{
			System.out.println("The Shape formed with the sides given as "+sides+" will be Quadrilateral");
		}
		else if(sides == 5)
		{
			System.out.println("The Shape formed with the sides given as "+sides+" will be Pentagon");
		}
		else if(sides == 6)
		{
			System.out.println("The Shape formed with the sides given as "+sides+" will be Hexagon");
		}
		else 
		{
			System.out.println("The Shape formed with the sides given as "+sides+" will be Polygon");
		}
	}

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of sides");
		int sides = scan.nextInt(); 
		identifyPolygon(sides);
	}
}
