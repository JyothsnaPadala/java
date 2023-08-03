import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial is "+fac);
	}
	
}
