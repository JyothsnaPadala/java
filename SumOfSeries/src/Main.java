import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number to find the sum of series");
	int n = scan.nextInt();
	CalculateSumOfSeries(n);
	}
	public static void CalculateSumOfSeries(int n)
	{
		double res = 0.0;
		for(int i=1;i<=n;i++)
		{
			res = res+1/i;
		
		}
		System.out.printf("%f",res);
	}
}
