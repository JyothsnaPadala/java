import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the height in inches");
		double h = scan.nextDouble();
		HeightConverter hc = new HeightConverter();
		System.out.println(hc.convertInchesToFeet(h));

	}

}
