import java.util.Scanner;

public class Program1 {
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number greater than 100");
	int n = scan.nextInt();
	if(n>100)
	{
		System.out.println("Number is greater than 100");
	}
	else
	{
		System.out.println("Please check and give a number greater than 100");
	}
	printNumbers(n);
}

	public static void printNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
